package com.petproject.heladeria.venta.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.venta.values.FacturaId;
import com.petproject.heladeria.venta.values.Header;
import com.petproject.heladeria.venta.values.VentaId;

public class ActualizarHeaderFactura extends Command {

    private final VentaId ventaId;
    private final FacturaId facturaId;
    private final Header header;

    public ActualizarHeaderFactura(VentaId ventaId, FacturaId facturaId, Header header){
        this.ventaId = ventaId;
        this.facturaId = facturaId;
        this.header = header;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public FacturaId getFacturaId() {
        return facturaId;
    }

    public Header getHeader() {
        return header;
    }
}
