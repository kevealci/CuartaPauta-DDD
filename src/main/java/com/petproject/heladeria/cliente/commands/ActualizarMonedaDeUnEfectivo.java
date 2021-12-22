package com.petproject.heladeria.cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.ClienteId;
import com.petproject.heladeria.cliente.values.EfectivoId;
import com.petproject.heladeria.cliente.values.Moneda;

public class ActualizarMonedaDeUnEfectivo extends Command {

    private final ClienteId clienteId;
    private final EfectivoId efectivoId;
    private final Moneda moneda;

    public ActualizarMonedaDeUnEfectivo(ClienteId clienteId, EfectivoId efectivoId, Moneda moneda){
        this.clienteId = clienteId;
        this.efectivoId = efectivoId;
        this.moneda = moneda;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public EfectivoId getEfectivoId() {
        return efectivoId;
    }

    public Moneda getMoneda() {
        return moneda;
    }
}
