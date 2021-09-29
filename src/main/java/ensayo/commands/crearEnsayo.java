package ensayo.commands;

import co.com.sofka.domain.generic.Command;
import ensayo.values.Normativa;

public class crearEnsayo extends Command {
    private final Normativa normativa;

    public crearEnsayo(Normativa normativa) {
        this.normativa = normativa;
    }

    public Normativa getNormativa() {
        return normativa;
    }
}
