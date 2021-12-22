package com.petproject.heladeria.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Header implements ValueObject<String> {

    private final String value;

    public Header(String value){
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El Header no puede estar vacia");
        }
        if(this.value.length() > 50){
            throw new IllegalArgumentException("El Header no debe tener mas de 50 caracteres");
        }
        if(this.value.length() < 4){
            throw new IllegalArgumentException("El Header no debe tener menos de 4 caracteres");
        }
        if(!this.value.matches("^[a-zA-Z ]")){
            throw new IllegalArgumentException("El Header solo puede contener letras");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Header)) return false;
        Header header = (Header) o;
        return value.equals(header.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
