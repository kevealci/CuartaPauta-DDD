package com.petproject.heladeria.vendedor.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Deber implements ValueObject<String> {
    private final String value;

    public Deber(String value){
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("El deber no puede estar vacio");
        }
        if(this.value.length() > 100){
            throw new IllegalArgumentException("El deber no debe tener mas de 100 caracteres");
        }
        if(this.value.length() < 4){
            throw new IllegalArgumentException("El deber no debe tener menos de 4 caracteres");
        }
        if(!this.value.matches("^[a-zA-Z ]")){
            throw new IllegalArgumentException("El deber solo puede contener letras");
        }
    }

    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deber)) return false;
        Deber deber = (Deber) o;
        return value.equals(deber.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
