package com.petproject.heladeria.venta.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.vendedor.values.VendedorId;
import com.petproject.heladeria.venta.values.VentaId;

public class AsociarVendedor extends Command {

    private final VentaId ventaId;
    private final VendedorId vendedorId;

    public AsociarVendedor(VentaId ventaId, VendedorId vendedorId){
        this.ventaId = ventaId;
        this.vendedorId = vendedorId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

}
