package com.petproject.heladeria.cliente.values;

import co.com.sofka.domain.generic.Identity;

public class EfectivoId extends Identity {
    public EfectivoId(){}

    private EfectivoId(String id){
        super(id);
    }
    public static EfectivoId of(String id){
        return new EfectivoId(id);
    }
}
