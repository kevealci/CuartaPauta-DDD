package com.petproject.heladeria.vendedor;

import co.com.sofka.domain.generic.Entity;
import com.petproject.heladeria.cliente.values.Monto;
import com.petproject.heladeria.vendedor.values.ComisionId;
import com.petproject.heladeria.vendedor.values.Descripcion;

import java.util.Objects;

public class Comision extends Entity<ComisionId> {
    private Monto monto;
    private Descripcion descripcion;

    public Comision(ComisionId entityId, Monto monto, Descripcion descripcion) {
        super(entityId);
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public void actualizarMonto(Monto monto){ this.monto = Objects.requireNonNull(monto); }

    public void actualizarDescripcion(Descripcion descripcion) { this.descripcion = Objects.requireNonNull(descripcion); }

    public Monto monto() { return monto; }

    public Descripcion descripcion() { return descripcion; }
}
