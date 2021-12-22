package com.petproject.heladeria.vendedor.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.cliente.values.Celular;
import com.petproject.heladeria.cliente.values.Correo;
import com.petproject.heladeria.cliente.values.Nombre;
import com.petproject.heladeria.vendedor.values.VendedorId;

public class CrearVendedor extends Command {

    private final VendedorId entityId;
    private final Nombre nombre;
    private final Correo correo;
    private final Celular celular;

    public CrearVendedor(VendedorId entityId, Nombre nombre, Correo correo, Celular celular){
        this.entityId = entityId;
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
    }

    public VendedorId getEntityId() {
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
