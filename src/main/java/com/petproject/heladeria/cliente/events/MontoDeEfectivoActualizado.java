package com.petproject.heladeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.EfectivoId;
import com.petproject.heladeria.cliente.values.Monto;

public class MontoDeEfectivoActualizado extends DomainEvent {
    private final EfectivoId entityId;
    private final Monto monto;

    public MontoDeEfectivoActualizado(EfectivoId entityId, Monto monto) {
        super("petproject.cliente.montodeefectivoactualizado");
        this.entityId = entityId;
        this.monto = monto;
    }

    public EfectivoId getEntityId() {
        return entityId;
    }

    public Monto getMonto() {
        return monto;
    }
}
