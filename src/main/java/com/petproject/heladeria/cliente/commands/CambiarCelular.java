package com.petproject.heladeria.cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.Celular;
import com.petproject.heladeria.cliente.values.ClienteId;

public class CambiarCelular extends Command {

    private final ClienteId clienteId;
    private final Celular celular;

    public CambiarCelular(ClienteId clienteId, Celular celular){
        this.clienteId = clienteId;
        this.celular = celular;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public Celular getCelular() {
        return celular;
    }
}
