package com.petproject.heladeria.vendedor.values;

import co.com.sofka.domain.generic.Identity;

public class ComisionId extends Identity {
    public ComisionId(){}
    private ComisionId(String id){
        super(id);
    }
    public static ComisionId of(String id){
        return new ComisionId(id);
    }
}
