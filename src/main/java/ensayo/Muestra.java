package ensayo;

import co.com.sofka.domain.generic.AggregateEvent;
import ensayo.values.*;

import java.util.Objects;

public class Muestra extends AggregateEvent<MuestraId> {
    private CodigoUN codigoUN;
    private Procedencia procedencia;
    private Cliente cliente;
    private FechaRecepcion fechaRecepcion;

    public Muestra(CodigoUN codigoUN, Procedencia procedencia, Cliente cliente, FechaRecepcion fechaRecepcion) {
        super(new MuestraId());
        this.codigoUN = codigoUN;
        this.procedencia = procedencia;
        this.cliente = cliente;
        this.fechaRecepcion = fechaRecepcion;
    }

    public void actualizarCodigoUN(CodigoUN codigoUN){
        this.codigoUN= Objects.requireNonNull(codigoUN);
    }

    public void actualizarProcedencia(Procedencia procedencia){
        this.procedencia= Objects.requireNonNull(procedencia);
    }

    public void actualizarCliente(Cliente cliente){
        this.cliente= Objects.requireNonNull(cliente);
    }

    public void actualizarFechaRecepcion(FechaRecepcion fechaRecepcion){
        this.fechaRecepcion= Objects.requireNonNull(fechaRecepcion);
    }

    public void actualizarAtributos(CodigoUN codigoUN, Procedencia procedencia, Cliente cliente, FechaRecepcion fechaRecepcion){
        actualizarCodigoUN(codigoUN);
        actualizarProcedencia(procedencia);
        actualizarCliente(cliente);
        actualizarFechaRecepcion(fechaRecepcion);
    }

    public CodigoUN codigoUN() {
        return codigoUN;
    }

    public Procedencia procedencia() {
        return procedencia;
    }

    public Cliente cliente() {
        return cliente;
    }

    public FechaRecepcion fechaRecepcion() {
        return fechaRecepcion;
    }
}
