package com.petproject.heladeria.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.vendedor.values.DepartamentoId;
import com.petproject.heladeria.vendedor.values.Descripcion;

public class DescripcionDepartamentoActualizada extends DomainEvent {

    private final DepartamentoId departamentoId;
    private final Descripcion descripcion;

    public DescripcionDepartamentoActualizada(DepartamentoId departamentoId, Descripcion descripcion) {
        super("petproject.vendedor.montodeefectivoactualizado");
        this.departamentoId = departamentoId;
        this.descripcion = descripcion;
    }

    public DepartamentoId getDepartamentoId() {
        return departamentoId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
