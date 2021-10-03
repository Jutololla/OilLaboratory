package domain.ensayo.commands;

import co.com.sofka.domain.generic.Command;
import domain.ensayo.values.*;

public class asociarMuestra extends Command {
    private final EnsayoId ensayoId;
    private final MuestraId muestraId;
    private final CodigoUN codigoUN;
    private final Procedencia procedencia;
    private final Cliente cliente;
    private final FechaRecepcion fechaRecepcion;

    public asociarMuestra(EnsayoId ensayoId, MuestraId muestraId, CodigoUN codigoUN, Procedencia procedencia, Cliente cliente, FechaRecepcion fechaRecepcion) {
        this.ensayoId = ensayoId;
        this.muestraId = muestraId;
        this.codigoUN = codigoUN;
        this.procedencia = procedencia;
        this.cliente = cliente;
        this.fechaRecepcion = fechaRecepcion;
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

    public EnsayoId getEnsayoId() {        return ensayoId;    }

    public MuestraId getMuestraId() {
        return muestraId;
    }
}
