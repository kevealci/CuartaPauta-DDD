package com.petproject.heladeria.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.vendedor.values.ComisionId;
import com.petproject.heladeria.vendedor.values.Descripcion;
import com.petproject.heladeria.vendedor.values.VendedorId;

public class ActualizarDescripcionComision extends Command {

    private final VendedorId vendedorId;
    private final ComisionId comisionId;
    private final Descripcion descripcion;

    public ActualizarDescripcionComision(VendedorId vendedorId, ComisionId comisionId, Descripcion descripcion){
        this.vendedorId = vendedorId;
        this.comisionId = comisionId;
        this.descripcion = descripcion;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public ComisionId getComisionId() {
        return comisionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
