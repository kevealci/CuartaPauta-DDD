package com.petproject.heladeria.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.Monto;
import com.petproject.heladeria.vendedor.values.ComisionId;
import com.petproject.heladeria.vendedor.values.VendedorId;

public class ActualizarMontoComision extends Command {

    private final VendedorId vendedorId;
    private final ComisionId comisionId;
    private final Monto monto;

    public ActualizarMontoComision(VendedorId vendedorId, ComisionId comisionId, Monto monto){
        this.vendedorId = vendedorId;
        this.comisionId = comisionId;
        this.monto = monto;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public ComisionId getComisionId() {
        return comisionId;
    }

    public Monto getMonto() {
        return monto;
    }
}
