package com.petproject.heladeria.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.venta.values.Body;
import com.petproject.heladeria.venta.values.FacturaId;

public class BodyFacturaActualizado extends DomainEvent {
    private final FacturaId facturaId;
    private final Body body;

    public BodyFacturaActualizado(FacturaId facturaId, Body body) {
        super("petproject.venta.bodyfacturaactualizado");
        this.facturaId = facturaId;
        this.body = body;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Body getBody() {
        return body;
    }
}
