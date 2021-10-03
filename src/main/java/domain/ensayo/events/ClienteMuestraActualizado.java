package domain.ensayo.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.ensayo.values.Cliente;
import domain.ensayo.values.MuestraId;

public class ClienteMuestraActualizado extends DomainEvent {
    private final Cliente cliente;
    private final MuestraId entityId;

    public ClienteMuestraActualizado(Cliente cliente, MuestraId entityId){
        super("oillaboratory.domain.ensayo.clientemuestraactualizado");
        this.cliente=cliente;
        this.entityId=entityId;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public MuestraId getEntityId() {
        return entityId;
    }
}
