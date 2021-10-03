package domain.ensayo.commands;

import co.com.sofka.domain.generic.Command;
import domain.ensayo.values.MuestraId;
import domain.ensayo.values.Procedencia;

public class actualizarProcedenciaMuestra extends Command {
    private final Procedencia procedencia;
    private final MuestraId entityId;

    public actualizarProcedenciaMuestra(Procedencia procedencia, MuestraId entityId) {
        this.procedencia = procedencia;
        this.entityId = entityId;
    }

    public Procedencia getProcedencia() {
        return procedencia;
    }

    public MuestraId getEntityId() {
        return entityId;
    }
}
