package domain.ensayo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.ensayo.events.*;
import domain.ensayo.values.*;

import java.util.List;
import java.util.Objects;

public class Ensayo extends AggregateEvent<EnsayoId> {
    protected Muestra muestra;
    protected Analista analista;
    protected Normativa normativa;
    protected FechaAnalisis fechaAnalisis;
    protected ResultadoAnalisis resultadoAnalisis;



    public Ensayo(Normativa normativa, EnsayoId ensayoId){
        super(new EnsayoId());
        appendChange(new EnsayoCreado(normativa, ensayoId)).apply();
            }

    private Ensayo(EnsayoId entityId){
        super(entityId);
        subscribe(new EnsayoChange(this));
    }

    public static Ensayo from(EnsayoId ensayoId, List<DomainEvent> events){
        var ensayo = new Ensayo(ensayoId);
        events.forEach(ensayo::applyEvent);
        return ensayo;
    }

    public void asociarMuestra(MuestraId muestraId, CodigoUN codigoUN, Procedencia procedencia, Cliente cliente, FechaRecepcion fechaRecepcion){
        Objects.requireNonNull(codigoUN);
        Objects.requireNonNull(procedencia);
        Objects.requireNonNull(cliente);
        Objects.requireNonNull(fechaRecepcion);
        appendChange(new MuestraAsociado(muestraId, codigoUN, procedencia, cliente, fechaRecepcion)).apply();
    }

    public void asociarAnalista(Nombre nombre){
        Objects.requireNonNull(nombre);
        appendChange(new AnalistaAsociado(nombre));
    }

    public void actualizarResultados(ResultadoAnalisis resultadoAnalisis){
        appendChange(new ResultadoActualizado(resultadoAnalisis)).apply();
    }

    public void actualizarCodigoUNMuestra(CodigoUN codigoUN, MuestraId entityId){
        appendChange(new CodigoUNMuestraActualizado(entityId, codigoUN)).apply();
    }

    public void actualizarProcedenciaMuestra(Procedencia procedencia, MuestraId entityId){
        appendChange(new ProcedenciaMuestraActualizado(procedencia, entityId)).apply();
    }
public void actualizarClienteMuestra(Cliente cliente, MuestraId entityId){
        appendChange(new ClienteMuestraActualizado(cliente, entityId)).apply();
    }
public void actualizarFechaRecepcionMuestra(FechaRecepcion fechaRecepcion, MuestraId entityId){
        appendChange(new FechaRecepcionMuestraActualizado(fechaRecepcion, entityId)).apply();
    }
    public void actualizarFechaAnalisis(FechaAnalisis fechaAnalisis){
        appendChange(new FechaAnalisisActualizado(fechaAnalisis)).apply();
    }

}
