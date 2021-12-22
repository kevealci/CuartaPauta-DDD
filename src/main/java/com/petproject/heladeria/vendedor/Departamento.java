package com.petproject.heladeria.vendedor;

import co.com.sofka.domain.generic.Entity;
import com.petproject.heladeria.vendedor.values.Deber;
import com.petproject.heladeria.vendedor.values.DepartamentoId;
import com.petproject.heladeria.vendedor.values.Descripcion;

import java.util.Objects;

public class Departamento extends Entity<DepartamentoId> {

    private Deber deber;
    private Descripcion descripcion;

    public Departamento(DepartamentoId entityId, Deber deber, Descripcion descripcion) {
        super(entityId);
        this.deber = deber;
        this.descripcion = descripcion;
    }

    public void actualizarDeber(Deber deber) { this.deber = Objects.requireNonNull(deber); }

    public void actualizarDescripcion(Descripcion descripcion) { this.descripcion = Objects.requireNonNull(descripcion); }

    public Deber deberes() { return deber; }

    public Descripcion descripcion() { return descripcion; }
}
