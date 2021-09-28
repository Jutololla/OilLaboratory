package ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import ensayo.values.FechaRecepcion;
import ensayo.values.MuestraId;

public class FechaRecepcionMuestraActualizado extends DomainEvent {
    private final FechaRecepcion fechaRecepcion;
    private final MuestraId entityId;

    public FechaRecepcionMuestraActualizado(FechaRecepcion fechaRecepcion, MuestraId entityId){
        super("oillaboratory.ensayo.fecharecepcionmuestraactualizado");
        this.fechaRecepcion=fechaRecepcion;
        this.entityId=entityId;
    }

    public FechaRecepcion getFechaRecepcion() {
        return fechaRecepcion;
    }

    public MuestraId getEntityId() {
        return entityId;
    }
}
