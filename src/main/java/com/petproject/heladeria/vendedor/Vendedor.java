package com.petproject.heladeria.vendedor;

import co.com.sofka.domain.generic.AggregateEvent;
import com.petproject.heladeria.cliente.values.Celular;
import com.petproject.heladeria.cliente.values.Correo;
import com.petproject.heladeria.cliente.values.Monto;
import com.petproject.heladeria.cliente.values.Nombre;
import com.petproject.heladeria.vendedor.events.*;
import com.petproject.heladeria.vendedor.values.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Vendedor extends AggregateEvent<VendedorId> {

    protected Nombre nombre;
    protected Correo correo;
    protected Celular celular;
    protected Departamento departamento;
    protected Set<Comision> comisiones;

    public Vendedor(VendedorId entityId, Nombre nombre, Correo correo, Celular celular) {
        super(entityId);
        appendChange(new VendedorCreado(nombre,correo,celular)).apply();
    }

    private Vendedor(VendedorId vendedorId){
        super(vendedorId);
        subscribe(new VendedorChange(this));
    }

    public void agregarComision(ComisionId comisionId, Monto monto, Descripcion descripcion) {
        Objects.requireNonNull(comisionId);
        Objects.requireNonNull(monto);
        Objects.requireNonNull(descripcion);
        appendChange(new ComisionAgregada(comisionId, monto, descripcion)).apply();
    }

    public void actualizarDescripcionDepartamento(DepartamentoId departamentoId, Descripcion descripcion) {
        Objects.requireNonNull(departamentoId);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionDepartamentoActualizada(departamentoId, descripcion)).apply();
    }

    public void actualizarDeberDepartamento(DepartamentoId departamentoId, Deber deber) {
        Objects.requireNonNull(departamentoId);
        Objects.requireNonNull(deber);
        appendChange(new DeberDepartamentoActualizado(departamentoId,deber)).apply();
    }

    public void actualizarDescripcionComision(ComisionId comisionId, Descripcion descripcion) {
        Objects.requireNonNull(comisionId);
        Objects.requireNonNull(descripcion);
        appendChange(new DescripcionComisionActualizada(comisionId, descripcion)).apply();
    }

    public void actualizarMontoComision(ComisionId comisionId, Monto monto) {
        Objects.requireNonNull(comisionId);
        Objects.requireNonNull(monto);
        appendChange(new MontoComisionActualizado(comisionId,monto)).apply();
    }

    public Optional<Comision> getComisionPorId(ComisionId comisionId){
        return comisiones
                .stream()
                .filter( comision -> comision.identity().equals(comisionId))
                .findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Correo correo() {
        return correo;
    }

    public Celular celular() {
        return celular;
    }

    public Departamento departamento() {
        return departamento;
    }

    public Set<Comision> comisiones() {
        return comisiones;
    }
}
