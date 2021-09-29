package ensayo.commands;

import co.com.sofka.domain.generic.Command;
import ensayo.values.CodigoUN;
import ensayo.values.MuestraId;

public class actualizarCodigoUNMuestra extends Command {
    private final CodigoUN codigoUN;
    private final MuestraId entityId;

    public actualizarCodigoUNMuestra(CodigoUN codigoUN, MuestraId entityId) {
        this.codigoUN = codigoUN;
        this.entityId = entityId;
    }

    public CodigoUN getCodigoUN() {
        return codigoUN;
    }

    public MuestraId getEntityId() {
        return entityId;
    }
}
