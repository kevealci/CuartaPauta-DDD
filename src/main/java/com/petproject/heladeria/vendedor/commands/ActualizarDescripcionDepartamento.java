package com.petproject.heladeria.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.vendedor.values.Deber;
import com.petproject.heladeria.vendedor.values.DepartamentoId;
import com.petproject.heladeria.vendedor.values.VendedorId;

public class ActualizarDescripcionDepartamento extends Command {

    private final VendedorId vendedorId;
    private final DepartamentoId departamentoId;
    private final Deber deber;

    public ActualizarDescripcionDepartamento(VendedorId vendedorId, DepartamentoId departamentoId, Deber deber){
        this.vendedorId = vendedorId;
        this.departamentoId = departamentoId;
        this.deber = deber;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public DepartamentoId getDepartamentoId() {
        return departamentoId;
    }

    public Deber getDeber() {
        return deber;
    }
}
