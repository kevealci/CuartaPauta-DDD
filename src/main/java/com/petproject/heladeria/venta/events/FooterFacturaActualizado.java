package com.petproject.heladeria.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.venta.values.FacturaId;
import com.petproject.heladeria.venta.values.Footer;

public class FooterFacturaActualizado extends DomainEvent {
    private final FacturaId facturaId;
    private final Footer footer;

    public FooterFacturaActualizado(FacturaId facturaId, Footer footer) {
        super("petproject.venta.footerfacturaactualizado");
        this.facturaId = facturaId;
        this.footer = footer;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Footer getFooter() {
        return footer;
    }
}
