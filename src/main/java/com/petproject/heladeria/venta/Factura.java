package com.petproject.heladeria.venta;

import co.com.sofka.domain.generic.Entity;
import com.petproject.heladeria.cliente.values.Monto;
import com.petproject.heladeria.venta.values.Body;
import com.petproject.heladeria.venta.values.FacturaId;
import com.petproject.heladeria.venta.values.Footer;
import com.petproject.heladeria.venta.values.Header;

import java.util.Objects;

public class Factura extends Entity<FacturaId> {
    private Header header;
    private Body body;
    private Footer footer;

    public Factura(FacturaId entityId, Header header, Body body, Footer footer) {
        super(entityId);
        this.header = header;
        this.body = body;
        this.footer = footer;
    }

    public void actualizarHeader(Header header){ this.header = Objects.requireNonNull(header); }

    public void actualizarBody(Body body){ this.body = Objects.requireNonNull(body); }

    public void actualizarFooter(Footer footer){ this.footer = Objects.requireNonNull(footer); }

    public Header header() { return header; }

    public Body body() { return body; }

    public Footer footer() { return footer; }
}
