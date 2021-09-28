package ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import ensayo.values.FechaAnalisis;

public class FechaAnalisisActualizado extends DomainEvent {
    private final FechaAnalisis fechaAnalisis;

    public FechaAnalisisActualizado(FechaAnalisis fechaAnalisis){
        super("oillaboratory.ensayo.fechaanalisisactualizado");
        this.fechaAnalisis=fechaAnalisis;
    }

    public FechaAnalisis getFechaAnalisis() {
        return fechaAnalisis;
    }
}
