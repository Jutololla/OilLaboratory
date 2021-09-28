package ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import ensayo.values.*;

public class MuestraAsociado extends DomainEvent {
    private final MuestraId muestraId;
    private final CodigoUN codigoUN;
    private final Procedencia procedencia;
    private final Cliente cliente;
    private final FechaRecepcion fechaRecepcion;

    public MuestraAsociado(CodigoUN codigoUN, Procedencia procedencia, Cliente cliente, FechaRecepcion fechaRecepcion) {
        super("oillaboratory.ensayo.muestraasociada");
        this.muestraId=new MuestraId();
        this.codigoUN = codigoUN;
        this.procedencia = procedencia;
        this.cliente = cliente;
        this.fechaRecepcion = fechaRecepcion;
    }

    public MuestraId getMuestraId() {
        return muestraId;
    }

    public CodigoUN getCodigoUN() {
        return codigoUN;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public FechaRecepcion getFechaRecepcion() {
        return fechaRecepcion;
    }
}
