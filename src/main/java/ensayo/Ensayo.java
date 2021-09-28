package ensayo;

import co.com.sofka.domain.generic.AggregateEvent;
import ensayo.events.*;
import ensayo.values.*;

import java.util.Objects;

public class Ensayo extends AggregateEvent<EnsayoId> {
    protected Muestra muestra;
    protected Analista analista;
    protected Normativa normativa;
    protected FechaAnalisis fechaAnalisis;
    protected ResultadoAnalisis ResultadoAnalisis;

    public Ensayo(EnsayoId entityId, Normativa normativa) {
        super(entityId);
        this.normativa=normativa;
    }

    public void asociarMuestra(CodigoUN codigoUN, Procedencia procedencia, Cliente cliente, FechaRecepcion fechaRecepcion){
        Objects.requireNonNull(codigoUN);
        Objects.requireNonNull(procedencia);
        Objects.requireNonNull(cliente);
        Objects.requireNonNull(fechaRecepcion);
        appendChange(new MuestraAsociado(codigoUN, procedencia, cliente, fechaRecepcion)).apply();
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
