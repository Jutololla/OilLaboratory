package domain.ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.ensayo.Analista;
import domain.ensayo.values.AnalistaId;
import domain.ensayo.values.Nombre;

public class AnalistaAsociado extends DomainEvent {
    private final AnalistaId analistaId;
    private final Nombre nombre;

    public AnalistaAsociado(Nombre nombre){
        super("oillaboratory.domain.ensayo.analistaascoiado");
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
