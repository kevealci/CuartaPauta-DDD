package com.petproject.heladeria.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.Marca;
import com.petproject.heladeria.cliente.values.Saldo;
import com.petproject.heladeria.cliente.values.TarjetaId;
import com.petproject.heladeria.cliente.values.Tipo;

public class TarjetaAgregada extends DomainEvent {
    private final TarjetaId tarjetaId;
    private final Marca marca;
    private final Tipo tipo;
    private final Saldo saldo;

    public TarjetaAgregada(TarjetaId tarjetaId, Marca marca, Tipo tipo, Saldo saldo) {
        super("petproject.cliente.tarjetaagregada");
        this.tarjetaId = tarjetaId;
        this.marca = marca;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public TarjetaId getTarjetaId() { return tarjetaId; }

    public Marca getMarca() {
        return marca;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}
