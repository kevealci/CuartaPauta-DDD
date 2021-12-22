package com.petproject.heladeria.venta.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.venta.values.FacturaId;
import com.petproject.heladeria.venta.values.Footer;
import com.petproject.heladeria.venta.values.VentaId;

public class ActualizarFooterFactura extends Command {

    private final VentaId ventaId;
    private final FacturaId facturaId;
    private final Footer footer;

    public ActualizarFooterFactura(VentaId ventaId, FacturaId facturaId, Footer footer){
        this.ventaId = ventaId;
        this.facturaId = facturaId;
        this.footer = footer;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Footer getFooter() {
        return footer;
    }
}
