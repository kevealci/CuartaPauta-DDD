package com.petproject.heladeria.cliente.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.Celular;
import com.petproject.heladeria.cliente.values.ClienteId;
import com.petproject.heladeria.cliente.values.Correo;
import com.petproject.heladeria.cliente.values.Nombre;

public class CrearCliente extends Command {

    private final ClienteId entityId;
    private final Nombre nombre;
    private final Correo correo;
    private final Celular celular;

    public CrearCliente(ClienteId entityId, Nombre nombre, Correo correo, Celular celular){
        this.entityId = entityId;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }

    public ClienteId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Correo getCorreo() {
        return correo;
    }

    public Celular getCelular() {
        return celular;
    }
}
