package com.petproject.heladeria.vendedor.values;

import co.com.sofka.domain.generic.Identity;

public class DepartamentoId extends Identity {
    public DepartamentoId(){}
    private DepartamentoId(String id){
        super(id);
    }
    public static DepartamentoId of(String id){
        return new DepartamentoId(id);
    }
}
