package com.petproject.heladeria.vendedor.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.Monto;
import com.petproject.heladeria.vendedor.values.ComisionId;
import com.petproject.heladeria.vendedor.values.Descripcion;

public class ComisionAgregada extends DomainEvent {
    private final ComisionId comisionId;
    private final Monto monto;
    private final Descripcion descripcion;

    public ComisionAgregada(ComisionId comisionId, Monto monto, Descripcion descripcion) {
        super("petproject.vendedor.comisionagregada");
        this.comisionId = comisionId;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public ComisionId getComisionId() {
        return comisionId;
    }

    public Monto getMonto() {
        return monto;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
