package ensayo.commands;

import co.com.sofka.domain.generic.Command;
import ensayo.values.FechaRecepcion;
import ensayo.values.MuestraId;

public class actualizarFechaRecepcionMuestra extends Command {
    private final FechaRecepcion fechaRecepcion;
    private final MuestraId entityId;

    public actualizarFechaRecepcionMuestra(FechaRecepcion fechaRecepcion, MuestraId entityId) {
        this.fechaRecepcion = fechaRecepcion;
        this.entityId = entityId;
    }

    public FechaRecepcion getFechaRecepcion() {
        return fechaRecepcion;
    }

    public MuestraId getEntityId() {
        return entityId;
    }
}
