package com.petproject.heladeria.cliente;

import co.com.sofka.domain.generic.Entity;
import com.petproject.heladeria.cliente.values.EfectivoId;
import com.petproject.heladeria.cliente.values.Monto;
import com.petproject.heladeria.cliente.values.Moneda;

import java.util.Objects;

public class Efectivo extends Entity<EfectivoId> {
    private Moneda moneda;
    private Monto monto;

    public Efectivo(EfectivoId entityId, Moneda moneda, Monto monto) {
        super(entityId);
        this.moneda = moneda;
        this.monto = monto;
    }

    public void actualizarMoneda(Moneda moneda){
        this.moneda = Objects.requireNonNull(moneda);
    }

    public void actualizarMonto(Monto monto){
        this.monto = Objects.requireNonNull(monto);
    }

    public Moneda moneda() {
        return moneda;
    }

    public Monto monto() {
        return monto;
    }
}
