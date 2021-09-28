package inventarioBodegaMuestras;

import co.com.sofka.domain.generic.AggregateEvent;
import inventarioBodegaMuestras.values.EstanteId;

public class Estante extends AggregateEvent<EstanteId> {
    public Estante(EstanteId entityId) {
        super(entityId);
    }
}
