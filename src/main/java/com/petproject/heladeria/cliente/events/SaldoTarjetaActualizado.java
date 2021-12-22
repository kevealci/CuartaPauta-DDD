package com.petproject.heladeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.Saldo;
import com.petproject.heladeria.cliente.values.TarjetaId;

public class SaldoTarjetaActualizado extends DomainEvent {
    private final TarjetaId tarjetaId;
    private final Saldo saldo;

    public SaldoTarjetaActualizado(TarjetaId tarjetaId, Saldo saldo) {
        super("petproject.cliente.saldotarjetaactualizado");
        this.tarjetaId = tarjetaId;
        this.saldo = saldo;
    }

    public TarjetaId getTarjetaId() {
        return tarjetaId;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}
