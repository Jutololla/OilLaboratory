package ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import ensayo.values.EnsayoId;
import ensayo.values.Normativa;

public class EnsayoCreado extends DomainEvent {
    private final Normativa normativa;
    //private final EnsayoId ensayoId;

    public EnsayoCreado(Normativa normativa){
        super("oillaboratory.ensayo.ensayocreado");
        this.normativa=normativa;
       // this.ensayoId=new EnsayoId();
    }

    public Normativa getNormativa() {
        return normativa;
    }

//    public EnsayoId getEnsayoId() {
//        return ensayoId;
//    }
}
