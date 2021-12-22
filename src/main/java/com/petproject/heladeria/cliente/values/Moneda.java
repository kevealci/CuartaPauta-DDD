package com.petproject.heladeria.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Moneda implements ValueObject<String> {
    private final String value;

    public Moneda(String value){
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("La moneda no puede estar vacia");
        }
        if(this.value.length() > 50){
            throw new IllegalArgumentException("La moneda no debe tener mas de 50 caracteres");
        }
        if(this.value.length() < 4){
            throw new IllegalArgumentException("La moneda no debe tener menos de 4 caracteres");
        }
        if(!this.value.matches("^[a-zA-Z ]")){
            throw new IllegalArgumentException("La moneda solo puede contener letras");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moneda)) return false;
        Moneda moneda = (Moneda) o;
        return value.equals(moneda.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
