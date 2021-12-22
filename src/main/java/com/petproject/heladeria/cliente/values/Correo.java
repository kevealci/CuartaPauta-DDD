package com.petproject.heladeria.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Correo implements ValueObject<String> {
    private final String value;

    public Correo(String value){
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El correo no puede estar vacio");
        }
        if(!this.value.matches("/^(([^<>()\\[\\]\\.,;:\\s@\\”]+(\\.[^<>()\\[\\]\\.,;:\\s@\\”]+)*)|(\\”.+\\”))@(([^<>()[\\]\\.,;:\\s@\\”]+\\.)+[^<>()[\\]\\.,;:\\s@\\”]{2,})$/")){
            throw new IllegalArgumentException("El correo debe contener un @");
        }
        if(this.value.length() > 50){
            throw new IllegalArgumentException("El correo no debe tener mas de 50 caracteres");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Correo)) return false;
        Correo correo = (Correo) o;
        return value.equals(correo.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
