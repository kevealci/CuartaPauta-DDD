package com.petproject.heladeria.venta.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Body implements ValueObject<String> {

    private final String value;

    public Body(String value){
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El body no puede estar vacia");
        }
        if(this.value.length() > 50){
            throw new IllegalArgumentException("El Body no debe tener mas de 50 caracteres");
        }
        if(this.value.length() < 4){
            throw new IllegalArgumentException("El Body no debe tener menos de 4 caracteres");
        }
        if(!this.value.matches("^[a-zA-Z ]")){
            throw new IllegalArgumentException("El Body solo puede contener letras");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Body)) return false;
        Body body = (Body) o;
        return value.equals(body.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
