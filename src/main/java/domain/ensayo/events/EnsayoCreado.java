package domain.ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.ensayo.values.EnsayoId;
import domain.ensayo.values.Normativa;

public class EnsayoCreado extends DomainEvent {
    private final Normativa normativa;
    private final EnsayoId ensayoId;

    public EnsayoCreado(Normativa normativa, EnsayoId ensayoId){
        super("oillaboratory.domain.ensayo.ensayocreado");
        this.normativa=normativa;
        this.ensayoId = ensayoId;
    }

    public Normativa getNormativa() {
        return normativa;
    }

    public EnsayoId getEnsayoId() {
        return ensayoId;
    }
}
