package com.petproject.heladeria.vendedor;

import co.com.sofka.domain.generic.EventChange;
import com.petproject.heladeria.vendedor.events.*;

import java.util.HashSet;

public class VendedorChange extends EventChange {

    public VendedorChange(Vendedor vendedor){

        apply( (VendedorCreado event) -> {
            vendedor.nombre = event.getNombre();
            vendedor.correo = event.getCorreo();
            vendedor.celular = event.getCelular();
            vendedor.comisiones = new HashSet<>();
        });

        apply( (ComisionAgregada event) -> {
            vendedor.comisiones.add(new Comision(event.getComisionId(),
                    event.getMonto(),
                    event.getDescripcion()));
        });

        apply( (DeberDepartamentoActualizado event) -> {
            vendedor.departamento.actualizarDeber(event.getDeber());
        });

        apply( (DescripcionComisionActualizada event) -> {
            var comision = vendedor.getComisionPorId(event.getComisionId())
                    .orElseThrow( ()-> new IllegalArgumentException("No se encuentra la comision del vendedor"));
            comision.actualizarDescripcion(event.getDescripcion());
        });

        apply( (DescripcionDepartamentoActualizada event) -> {
            vendedor.departamento.actualizarDescripcion(event.getDescripcion());
        });

        apply( (MontoComisionActualizado event) -> {
            var comision = vendedor.getComisionPorId(event.getComisionId())
                    .orElseThrow( ()-> new IllegalArgumentException("No se encuentra la comision del vendedor"));
            comision.actualizarMonto(event.getMonto());
        });
    }
}
