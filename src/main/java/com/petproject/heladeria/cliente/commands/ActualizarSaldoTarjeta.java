package com.petproject.heladeria.cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.ClienteId;
import com.petproject.heladeria.cliente.values.Saldo;
import com.petproject.heladeria.cliente.values.TarjetaId;

public class ActualizarSaldoTarjeta extends Command {

    private final ClienteId clienteId;
    private final TarjetaId tarjetaId;
    private final Saldo saldo;

    public ActualizarSaldoTarjeta(ClienteId clienteId, TarjetaId tarjetaId, Saldo saldo){
        this.clienteId = clienteId;
        this.tarjetaId = tarjetaId;
        this.saldo = saldo;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public TarjetaId getTarjetaId() {
        return tarjetaId;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}
