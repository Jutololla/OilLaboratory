package usecase.ensayo;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import domain.ensayo.commands.crearEnsayo;
import domain.ensayo.events.EnsayoCreado;
import domain.ensayo.values.EnsayoId;
import domain.ensayo.values.Normativa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearEnsayoUseCaseTest {

    @Test
    @DisplayName("Prueba de creacion de un ensayo con argumentos validos")
    void argumentoValido_CrearEnsayo() {
        var command = new crearEnsayo(
                EnsayoId.of(""), new Normativa("ASTM1240")
        );
        var useCase = new CrearEnsayoUseCase();
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var event = (EnsayoCreado) events.get(0);
        Assertions.assertEquals("ASTM1240", event.getNormativa().value());
        assertNotNull(event.aggregateRootId());

    }

    @Test
    @DisplayName("Prueba de creacion de un ensayo con argumentos no validos")
    void argumentoNoValido_CrearEnsayo() {
        assertThrows(IllegalArgumentException.class, () -> {
            var command = new crearEnsayo(
                    new EnsayoId(), new Normativa("")
            );
        });
    }


}