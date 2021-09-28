package ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import ensayo.Analista;
import ensayo.values.AnalistaId;
import ensayo.values.Nombre;

public class AnalistaAsociado extends DomainEvent {
    private final AnalistaId analistaId;
    private final Nombre nombre;

    public AnalistaAsociado(Nombre nombre){
        super("oillaboratory.ensayo.analistaascoiado");
        this.analistaId=new AnalistaId();
        this.nombre=nombre;
    }

    public Nombre getNombre(){
        return nombre;
    }

    public AnalistaId getAnalistaId(){
        return analistaId;
    }

}
