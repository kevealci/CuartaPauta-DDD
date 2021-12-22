package com.petproject.heladeria.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.vendedor.values.Deber;
import com.petproject.heladeria.vendedor.values.DepartamentoId;

public class DeberDepartamentoActualizado extends DomainEvent {
    private final DepartamentoId departamentoId;
    private final Deber deber;

    public DeberDepartamentoActualizado(DepartamentoId departamentoId, Deber deber) {
        super("petproject.vendedor.deberdepartamentoactualizado");
        this.departamentoId = departamentoId;
        this.deber = deber;
    }

    public DepartamentoId getDepartamentoId() {
        return departamentoId;
    }

    public Deber getDeber() {
        return deber;
    }
}
