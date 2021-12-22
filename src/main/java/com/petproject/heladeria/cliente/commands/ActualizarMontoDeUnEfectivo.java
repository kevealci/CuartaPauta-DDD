package com.petproject.heladeria.cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.ClienteId;
import com.petproject.heladeria.cliente.values.EfectivoId;
import com.petproject.heladeria.cliente.values.Monto;

public class ActualizarMontoDeUnEfectivo extends Command {
    private final ClienteId clienteId;
    private final EfectivoId efectivoId;
    private final Monto monto;

    public ActualizarMontoDeUnEfectivo(ClienteId clienteId, EfectivoId efectivoId, Monto monto) {
        this.clienteId = clienteId;
        this.efectivoId = efectivoId;
        this.monto = monto;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public EfectivoId getEfectivoId() {
        return efectivoId;
    }

    public Monto getMonto() {
        return monto;
    }
}
