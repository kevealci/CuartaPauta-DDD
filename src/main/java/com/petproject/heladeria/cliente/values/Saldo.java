package com.petproject.heladeria.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Saldo implements ValueObject<Double> {
    private final Double value;

    public Saldo(Double value){
        this.value = Objects.requireNonNull(value);
        if(this.value <= 0D){
            throw new IllegalArgumentException("El saldo debe ser mayor a 0");
        }
        if(this.value.toString().length() > 3000D){
            throw new IllegalArgumentException("El saldo no puede ser mayor a 3000");
        }
    }

    @Override
    public Double value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Saldo)) return false;
        Saldo saldo = (Saldo) o;
        return value.equals(saldo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
