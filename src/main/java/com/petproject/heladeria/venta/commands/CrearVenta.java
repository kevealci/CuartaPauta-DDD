package com.petproject.heladeria.venta.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.ClienteId;
import com.petproject.heladeria.vendedor.values.VendedorId;
import com.petproject.heladeria.venta.values.VentaId;

public class CrearVenta extends Command {

    private final VentaId ventaId;
    private final ClienteId clienteId;
    private final VendedorId vendedorId;

    public CrearVenta(VentaId ventaId, ClienteId clienteId, VendedorId vendedorId){
        this.ventaId = ventaId;
        this.clienteId = clienteId;
        this.vendedorId = vendedorId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}
