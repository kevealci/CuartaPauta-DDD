package com.petproject.heladeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.Celular;

public class CelularCambiado extends DomainEvent {
    private final Celular celular;

    public CelularCambiado(Celular celular) {
        super("petproject.cliente.celularcambiado");
        this.celular = celular;
    }

    public Celular getCelular() {
        return celular;
    }
}
