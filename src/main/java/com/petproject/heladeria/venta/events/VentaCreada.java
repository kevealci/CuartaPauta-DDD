package com.petproject.heladeria.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.ClienteId;
import com.petproject.heladeria.vendedor.values.VendedorId;

public class VentaCreada extends DomainEvent {
    private final ClienteId clienteId;
    private final VendedorId vendedorId;

    public VentaCreada(ClienteId clienteId, VendedorId vendedorId) {
        super("petproject.venta.ventacreada");
        this.clienteId = clienteId;
        this.vendedorId = vendedorId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}
