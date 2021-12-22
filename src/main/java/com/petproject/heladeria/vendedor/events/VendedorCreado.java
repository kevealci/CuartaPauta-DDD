package com.petproject.heladeria.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.Celular;
import com.petproject.heladeria.cliente.values.Correo;
import com.petproject.heladeria.cliente.values.Nombre;

public class VendedorCreado extends DomainEvent {
    private final Nombre nombre;
    private final Correo correo;
    private final Celular celular;

    public VendedorCreado(Nombre nombre, Correo correo, Celular celular) {
        super("petproject.vendedor.vendedorcreado");
        this.nombre = nombre;
        this.correo = correo;
        this.celular = celular;
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
