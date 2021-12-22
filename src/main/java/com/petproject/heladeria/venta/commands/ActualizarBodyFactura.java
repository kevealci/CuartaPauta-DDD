package com.petproject.heladeria.venta.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.venta.values.Body;
import com.petproject.heladeria.venta.values.FacturaId;
import com.petproject.heladeria.venta.values.VentaId;

public class ActualizarBodyFactura extends Command {

    private final VentaId ventaId;
    private final FacturaId facturaId;
    private final Body body;

    public ActualizarBodyFactura(VentaId ventaId, FacturaId facturaId, Body body ) {
        this.ventaId = ventaId;
        this.facturaId = facturaId;
        this.body = body;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Body getBody() {
        return body;
    }
}
