package ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import ensayo.values.CodigoUN;
import ensayo.values.MuestraId;

public class CodigoUNMuestraActualizado extends DomainEvent {
    private final MuestraId entityId;
    private final CodigoUN codigoUN;

    public CodigoUNMuestraActualizado(MuestraId entityId, CodigoUN codigoUN){
        super("oillaboratory.ensayo.codigounmuestraactualizado");
        this.entityId=entityId;
        this.codigoUN=codigoUN;
    }

    public MuestraId getEntityId() {
        return entityId;
    }

    public CodigoUN getCodigoUN() {
        return codigoUN;
    }
}
