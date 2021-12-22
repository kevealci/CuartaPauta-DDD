package com.petproject.heladeria.vendedor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {
    private final String value;

    public Descripcion(String value){
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("La descripcion no puede estar vacio");
        }
        if(this.value.length() > 500){
            throw new IllegalArgumentException("La descripcion no debe tener mas de 500 caracteres");
        }
        if(this.value.length() < 4){
            throw new IllegalArgumentException("La descripcion no debe tener menos de 4 caracteres");
        }
        if(!this.value.matches("^[a-zA-Z ]")){
            throw new IllegalArgumentException("La descripcion solo puede contener letras");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Descripcion)) return false;
        Descripcion that = (Descripcion) o;
        return value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
