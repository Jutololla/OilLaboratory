package domain.ensayo.commands;

import co.com.sofka.domain.generic.Command;
import domain.ensayo.values.Cliente;
import domain.ensayo.values.MuestraId;

public class actualizarClienteMuestra extends Command {
    private final Cliente cliente;
    private final MuestraId entityId;

    public actualizarClienteMuestra(Cliente cliente, MuestraId entityId) {
        this.cliente = cliente;
        this.entityId = entityId;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public MuestraId getEntityId() {
        return entityId;
    }
}
