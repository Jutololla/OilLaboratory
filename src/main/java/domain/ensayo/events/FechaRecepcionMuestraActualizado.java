package domain.ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.ensayo.values.FechaRecepcion;
import domain.ensayo.values.MuestraId;

public class FechaRecepcionMuestraActualizado extends DomainEvent {
    private final FechaRecepcion fechaRecepcion;
    private final MuestraId entityId;

    public FechaRecepcionMuestraActualizado(FechaRecepcion fechaRecepcion, MuestraId entityId){
        super("oillaboratory.domain.ensayo.fecharecepcionmuestraactualizado");
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
