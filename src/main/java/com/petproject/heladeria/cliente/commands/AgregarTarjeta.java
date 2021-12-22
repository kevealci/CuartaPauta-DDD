package com.petproject.heladeria.cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.*;

public class AgregarTarjeta extends Command {

    private final ClienteId clienteId;
    private final TarjetaId entityId;
    private final Marca marca;
    private final Tipo tipo;
    private final Saldo saldo;

    public AgregarTarjeta(ClienteId clienteId, TarjetaId entityId, Marca marca, Tipo tipo, Saldo saldo){
        this.clienteId = clienteId;
        this.entityId = entityId;
        this.marca = marca;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public TarjetaId getEntityId() {
        return entityId;
    }

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
