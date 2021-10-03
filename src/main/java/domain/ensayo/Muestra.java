package domain.ensayo;

import co.com.sofka.domain.generic.Entity;
import domain.ensayo.values.*;

import java.util.Objects;

public class Muestra extends Entity<MuestraId> {
    private CodigoUN codigoUN;
    private Procedencia procedencia;
    private Cliente cliente;
    private FechaRecepcion fechaRecepcion;

    private Muestra(MuestraId muestraId){
        super(muestraId);
    }
    protected Muestra(MuestraId muestraId, CodigoUN codigoUN, Procedencia procedencia, Cliente cliente, FechaRecepcion fechaRecepcion) {
        super(muestraId);
        this.codigoUN = codigoUN;
        this.procedencia = procedencia;
        this.cliente = cliente;
        this.fechaRecepcion = fechaRecepcion;
    }

    public Muestra from(MuestraId muestraId, CodigoUN codigoUN, Procedencia procedencia, Cliente cliente, FechaRecepcion fechaRecepcion) {
        var muestra = new Muestra(muestraId);
        muestra.codigoUN= codigoUN;
        muestra.procedencia=procedencia;
        muestra.cliente=cliente;
        muestra.fechaRecepcion=fechaRecepcion;
        return muestra;
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
