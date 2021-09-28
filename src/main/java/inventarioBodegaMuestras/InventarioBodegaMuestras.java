package inventarioBodegaMuestras;

import co.com.sofka.domain.generic.AggregateEvent;
import inventarioBodegaMuestras.values.InventarioBodegaMuestrasId;

public class InventarioBodegaMuestras extends AggregateEvent<InventarioBodegaMuestrasId> {
    public InventarioBodegaMuestras(InventarioBodegaMuestrasId entityId) {
        super(entityId);
    }
}
