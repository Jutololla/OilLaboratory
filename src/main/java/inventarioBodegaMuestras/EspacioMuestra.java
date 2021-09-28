package inventarioBodegaMuestras;

import co.com.sofka.domain.generic.AggregateEvent;
import inventarioBodegaMuestras.values.EspacioMuestraId;

public class EspacioMuestra extends AggregateEvent<EspacioMuestraId> {
    public EspacioMuestra(EspacioMuestraId entityId) {
        super(entityId);
    }
}
