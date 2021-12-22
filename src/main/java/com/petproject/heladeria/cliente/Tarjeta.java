package com.petproject.heladeria.cliente;

import co.com.sofka.domain.generic.Entity;
import com.petproject.heladeria.cliente.values.Marca;
import com.petproject.heladeria.cliente.values.Saldo;
import com.petproject.heladeria.cliente.values.TarjetaId;
import com.petproject.heladeria.cliente.values.Tipo;

import java.util.Objects;

public class Tarjeta extends Entity<TarjetaId> {

    private Marca marca;
    private Tipo tipo;
    private Saldo saldo;

    public Tarjeta(TarjetaId entityId, Marca marca, Tipo tipo, Saldo saldo) {
        super(entityId);
        this.marca = marca;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public void actualizarSaldo(Saldo saldo){
        this.saldo = Objects.requireNonNull(saldo);
    }

    public Marca marca() {
        return marca;
    }

    public Tipo tipo() {
        return tipo;
    }

    public Saldo saldo() {
        return saldo;
    }
}
