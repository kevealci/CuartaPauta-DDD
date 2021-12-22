package com.petproject.heladeria.venta.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.ClienteId;
import com.petproject.heladeria.venta.values.VentaId;

public class AsociarCliente extends Command {

    private final VentaId ventaId;
    private final ClienteId clienteId;

    public AsociarCliente(VentaId ventaId, ClienteId clienteId){
        this.ventaId = ventaId;
        this.clienteId = clienteId;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
