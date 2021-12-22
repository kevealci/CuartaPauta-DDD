package com.petproject.heladeria.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.events.*;
import com.petproject.heladeria.cliente.values.*;
import com.petproject.heladeria.vendedor.Comision;
import com.petproject.heladeria.vendedor.values.ComisionId;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Cliente extends AggregateEvent<ClienteId> {

    protected Nombre nombre;
    protected Correo correo;
    protected Celular celular;
    protected Efectivo efectivo;
    protected Set<Tarjeta> tarjetas;

    public Cliente(ClienteId entityId, Nombre nombre, Correo correo, Celular celular) {
        super(entityId);
        appendChange(new ClienteCreado(nombre,correo,celular)).apply();
    }

    private Cliente(ClienteId entityId){
        super(entityId);
        subscribe(new ClienteChange(this));
    }

    public static Cliente from(ClienteId clienteId, List<DomainEvent> events){
        var cliente = new Cliente(clienteId);
        events.forEach(cliente::applyEvent);
        return cliente;
    }

    public void agregarTarjeta(TarjetaId entityId, Marca marca, Tipo tipo, Saldo saldo){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(marca);
        Objects.requireNonNull(tipo);
        Objects.requireNonNull(saldo);
        appendChange(new TarjetaAgregada(entityId, marca, tipo, saldo)).apply();
    }

    public void cambiarCelular(Celular celular){
        Objects.requireNonNull(celular);
        appendChange(new CelularCambiado(celular)).apply();
    }

    public void actualizarMontoDeUnEfectivo(EfectivoId efectivoId, Monto monto){
        Objects.requireNonNull(efectivoId);
        Objects.requireNonNull(monto);
        appendChange(new MontoDeEfectivoActualizado(efectivoId, monto)).apply();
    }

    public void actualizarMonedaDeUnEfectivo(EfectivoId efectivoId, Moneda moneda){
        Objects.requireNonNull(efectivoId);
        Objects.requireNonNull(moneda);
        appendChange(new MonedaDeUnEfectivoActualizada(efectivoId, moneda)).apply();
    }

    public void actualizarSaldoTarjeta(TarjetaId tarjetaId, Saldo saldo){
        Objects.requireNonNull(tarjetaId);
        Objects.requireNonNull(saldo);
        appendChange(new SaldoTarjetaActualizado(tarjetaId, saldo)).apply();
    }

    public Optional<Tarjeta> getTarjetaPorId(TarjetaId tarjetaId){
        return tarjetas
                .stream()
                .filter( tarjeta -> tarjeta.identity().equals(tarjetaId))
                .findFirst();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Correo correo() { return correo; }

    public Celular celular() { return celular; }

    public Efectivo efectivo() {
        return efectivo;
    }

    public Set<Tarjeta> tarjetas() {
        return tarjetas;
    }

}
