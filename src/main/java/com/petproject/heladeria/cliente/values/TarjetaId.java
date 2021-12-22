package com.petproject.heladeria.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class TarjetaId extends Identity {
    public TarjetaId(){}

    private TarjetaId(String id){
        super(id);
    }
    public static TarjetaId of(String id){
        return new TarjetaId(id);
    }
}
