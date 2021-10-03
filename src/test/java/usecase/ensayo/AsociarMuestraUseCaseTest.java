package usecase.ensayo;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.ensayo.commands.asociarMuestra;
import domain.ensayo.commands.crearEnsayo;
import domain.ensayo.events.EnsayoCreado;
import domain.ensayo.events.MuestraAsociado;
import domain.ensayo.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
class AsociarMuestraUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    @DisplayName("Prueba la asociacion de una muestra a un analisis con argumentos validos")
    void argumentosValidos_asociarMuestra() {
        var command = new asociarMuestra(
                new EnsayoId("3131"),
                new MuestraId("1521"),
                new CodigoUN("5454"),
                new Procedencia("Carolina Sur, MV Spirit Mourven"),
                new Cliente("Frontera"),
                new FechaRecepcion(LocalDate.of(2021, 8, 3))
        );


        var useCase = new AsociarMuestraUseCase();
        Mockito.when(repository.getEventsBy(command.getMuestraId().value())).thenReturn(EventRestore());
        useCase.addRepository(repository);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        var events= UseCaseHandler.getInstance()
                        .setIdentifyExecutor(command.getMuestraId().value())
                                .syncExecutor(useCase,new RequestCommand<>(command))
                                        .orElseThrow()
                                                .getDomainEvents();
        var muestraAsociado = (MuestraAsociado) events.get(0);

        Assertions.assertEquals("3131", muestraAsociado.aggregateRootId() );
        Assertions.assertEquals("1521", muestraAsociado.getMuestraId().toString());
        Assertions.assertEquals("5454", muestraAsociado.getCodigoUN().value());
        Assertions.assertEquals("Carolina Sur, MV Spirit Mourven",muestraAsociado.getProcedencia().value());
        Assertions.assertEquals("Frontera",muestraAsociado.getCliente().value());
        Assertions.assertEquals("2021-08-03", muestraAsociado.getFechaRecepcion().value().toString());
    }

    @Test
    @DisplayName("Prueba de asociacion de una muestra con argumentos no validos")
    void argumentoNoValidoCodigoUN_asociarMuestra() {
        assertThrows(IllegalArgumentException.class, () -> {
            var command = new asociarMuestra(
                    new EnsayoId(),
                    new MuestraId(),
                    new CodigoUN(""),
                    new Procedencia("xx"),
                    new Cliente("xx"),
                    new FechaRecepcion(LocalDate.of(2021, 8, 3))
            );
        });
    }

    @Test
    @DisplayName("Prueba de asociacion de una muestra con argumentos no validos")
    void argumentoNoValidoProcedencia_asociarMuestra() {
        assertThrows(IllegalArgumentException.class, () -> {
            var command = new asociarMuestra(
                    new EnsayoId(),
                    new MuestraId(),
                    new CodigoUN("xx"),
                    new Procedencia(""),
                    new Cliente("xx"),
                    new FechaRecepcion(LocalDate.of(2021, 8, 3))
            );
        });
    }

    @Test
    @DisplayName("Prueba de asociacion de una muestra con argumentos no validos")
    void argumentoNoValidoCliente_asociarMuestra() {
        assertThrows(IllegalArgumentException.class, () -> {
            var command = new asociarMuestra(
                    new EnsayoId(),
                    new MuestraId(),
                    new CodigoUN("xx"),
                    new Procedencia("xx"),
                    new Cliente(""),
                    new FechaRecepcion(LocalDate.of(2021, 8, 3))
            );
        });
    }

    private List<DomainEvent> EventRestore() {
        return List.of(
                new EnsayoCreado(new Normativa("ISO3001"), new EnsayoId("3131")));
    }
}