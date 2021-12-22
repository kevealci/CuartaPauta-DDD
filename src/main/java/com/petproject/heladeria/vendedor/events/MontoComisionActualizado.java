package com.petproject.heladeria.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.Monto;
import com.petproject.heladeria.vendedor.values.ComisionId;

public class MontoComisionActualizado extends DomainEvent {
    private final ComisionId comisionId;
    private final Monto monto;

    public MontoComisionActualizado(ComisionId comisionId, Monto monto) {
        super("petproject.vendedor.montocomisionactualizado");
        this.comisionId = comisionId;
        this.monto = monto;
    }

    public ComisionId getComisionId() {
        return comisionId;
    }

    public Monto getMonto() {
        return monto;
    }
}
