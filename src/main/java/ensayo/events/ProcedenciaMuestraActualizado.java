package ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import ensayo.values.MuestraId;
import ensayo.values.Procedencia;

public class ProcedenciaMuestraActualizado extends DomainEvent {
    private final Procedencia procedencia;
    private final MuestraId entityId;

    public ProcedenciaMuestraActualizado(Procedencia procedencia, MuestraId entityId){
        super("oillaboratory.ensayo.procedenciamuestraactualizado");
        this.entityId=entityId;
        this.procedencia=procedencia;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public MuestraId getEntityId() {
        return entityId;
    }
}
