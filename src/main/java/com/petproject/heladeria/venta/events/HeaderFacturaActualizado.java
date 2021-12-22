package com.petproject.heladeria.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.venta.values.FacturaId;
import com.petproject.heladeria.venta.values.Header;

public class HeaderFacturaActualizado extends DomainEvent {
    private final FacturaId facturaId;
    private final Header header;

    public HeaderFacturaActualizado(FacturaId facturaId, Header header) {
        super("petproject.venta.headerfacturaactualizado");
        this.facturaId = facturaId;
        this.header = header;
    }

    public Header getHeader() {
        return header;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }
}
