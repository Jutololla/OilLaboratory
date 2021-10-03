package domain.ensayo.commands;

import co.com.sofka.domain.generic.Command;
import domain.ensayo.values.EnsayoId;
import domain.ensayo.values.Normativa;

public class crearEnsayo extends Command {
    private final EnsayoId ensayoId;
    private final Normativa normativa;

    public crearEnsayo(EnsayoId ensayoId, Normativa normativa) {
        this.ensayoId = ensayoId;
        this.normativa = normativa;
    }

    public Normativa getNormativa() {
        return normativa;
    }

    public EnsayoId getEnsayoId() {
        return ensayoId;
    }
}
