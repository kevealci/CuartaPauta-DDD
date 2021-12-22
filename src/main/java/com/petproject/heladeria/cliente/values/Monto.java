package com.petproject.heladeria.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Monto implements ValueObject<Double> {
    private final Double value;

    public Monto(Double value){
        this.value = Objects.requireNonNull(value);
        if(this.value <= 0D){
            throw new IllegalArgumentException("El monto debe ser mayor a 0");
        }
        if(this.value.toString().length() > 3000D){
            throw new IllegalArgumentException("El monto no puede ser mayor a 3000");
        }
    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monto)) return false;
        Monto monto = (Monto) o;
        return value.equals(monto.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
