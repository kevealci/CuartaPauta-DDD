package com.petproject.heladeria.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Marca implements ValueObject<String> {
    private final String value;

    public Marca(String value){
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("La marca no puede estar vacia");
        }
        if(this.value.length() > 50){
            throw new IllegalArgumentException("La marca no debe tener mas de 50 caracteres");
        }
        if(this.value.length() < 4){
            throw new IllegalArgumentException("La marca no debe tener menos de 4 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Marca)) return false;
        Marca marca = (Marca) o;
        return value.equals(marca.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
