package domain.ensayo.commands;

import co.com.sofka.domain.generic.Command;
import domain.ensayo.values.Nombre;

public class asociarAnalista extends Command {
    private final Nombre nombre;

    public asociarAnalista(Nombre nombre) {
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
