package com.petproject.heladeria.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.vendedor.values.ComisionId;
import com.petproject.heladeria.vendedor.values.Descripcion;

public class DescripcionComisionActualizada extends DomainEvent {
    private final ComisionId comisionId;
    private final Descripcion descripcion;

    public DescripcionComisionActualizada(ComisionId comisionId, Descripcion descripcion) {
        super("petproject.vendedor.descripcioncomisionactualizada");
        this.comisionId = comisionId;
        this.descripcion = descripcion;
    }

    public ComisionId getComisionId() {
        return comisionId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
