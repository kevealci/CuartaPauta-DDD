package com.petproject.heladeria.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Celular implements ValueObject<Integer> {
    private final Integer value;

    public Celular(Integer value){
        this.value = Objects.requireNonNull(value);
        if(this.value.toString().length() < 10){
            throw new IllegalArgumentException("El numero debe tener 10 digitos");
        }
        if(this.value.toString().length() > 10){
            throw new IllegalArgumentException("El numero debe tener 10 digitos");
        }
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Celular)) return false;
        Celular celular = (Celular) o;
        return value.equals(celular.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
