package com.petproject.heladeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.EfectivoId;
import com.petproject.heladeria.cliente.values.Moneda;

public class MonedaDeUnEfectivoActualizada extends DomainEvent {
    private final EfectivoId efectivoId;
    private final Moneda moneda;

    public MonedaDeUnEfectivoActualizada(EfectivoId efectivoId, Moneda moneda) {
        super("petproject.cliente.monedadeunefectivoactualizada");
        this.efectivoId = efectivoId;
        this.moneda = moneda;
    }

    public EfectivoId getEfectivoId() {
        return efectivoId;
    }

    public Moneda getMoneda() {
        return moneda;
    }
}
