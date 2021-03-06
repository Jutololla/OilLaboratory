package domain.ensayo.commands;

import co.com.sofka.domain.generic.Command;
import domain.ensayo.values.FechaAnalisis;

public class actualizarFechaAnalisis extends Command {
    private final FechaAnalisis fechaAnalisis;

    public actualizarFechaAnalisis(FechaAnalisis fechaAnalisis) {
        this.fechaAnalisis = fechaAnalisis;
    }

    public FechaAnalisis getFechaAnalisis() {
        return fechaAnalisis;
    }
}
