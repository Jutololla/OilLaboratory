package ensayo.commands;

import co.com.sofka.domain.generic.Command;
import ensayo.values.Cliente;
import ensayo.values.CodigoUN;
import ensayo.values.FechaRecepcion;
import ensayo.values.Procedencia;

public class asociarMuestra extends Command {

    private final CodigoUN codigoUN;
    private final Procedencia procedencia;
    private final Cliente cliente;
    private final FechaRecepcion fechaRecepcion;

    public asociarMuestra(CodigoUN codigoUN, Procedencia procedencia, Cliente cliente, FechaRecepcion fechaRecepcion) {
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
}
