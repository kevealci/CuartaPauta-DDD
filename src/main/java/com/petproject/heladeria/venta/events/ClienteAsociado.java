package com.petproject.heladeria.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.ClienteId;

public class ClienteAsociado extends DomainEvent {
    private final ClienteId clienteId;

    public ClienteAsociado(ClienteId clienteId) {
        super("petproject.venta.clienteasociado");
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
