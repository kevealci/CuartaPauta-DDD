package com.petproject.heladeria.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.vendedor.values.VendedorId;

public class VendedorAsociado extends DomainEvent {
    private final VendedorId vendedorId;

    public VendedorAsociado(VendedorId vendedorId) {
        super("petproject.venta.vendedorasociado");
        this.vendedorId = vendedorId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}
