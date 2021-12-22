package com.petproject.heladeria.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.Monto;
import com.petproject.heladeria.vendedor.values.ComisionId;
import com.petproject.heladeria.vendedor.values.Descripcion;
import com.petproject.heladeria.vendedor.values.VendedorId;

public class AgregarComision extends Command {

    private final VendedorId vendedorId;
    private final ComisionId comisionId;
    private final Monto monto;
    private final Descripcion descripcion;

    public AgregarComision(VendedorId vendedorId, ComisionId comisionId, Monto monto, Descripcion descripcion){
        this.vendedorId = vendedorId;
        this.comisionId = comisionId;
        this.monto = monto;
        this.descripcion = descripcion;
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

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
