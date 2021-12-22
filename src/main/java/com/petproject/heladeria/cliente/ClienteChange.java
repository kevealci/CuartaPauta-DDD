package com.petproject.heladeria.cliente;

import co.com.sofka.domain.generic.EventChange;
import com.petproject.heladeria.cliente.commands.ActualizarMonedaDeUnEfectivo;
import com.petproject.heladeria.cliente.events.*;

import java.util.HashSet;

public class ClienteChange extends EventChange {

    public ClienteChange(Cliente cliente){

        apply( (ClienteCreado event) -> {
            cliente.nombre = event.getNombre();
            cliente.correo = event.getCorreo();
            cliente.celular = event.getCelular();
            cliente.tarjetas = new HashSet<>();
        } );

        apply( (CelularCambiado event) -> {
            cliente.celular = event.getCelular();
        });

        apply( (MontoDeEfectivoActualizado event) -> {
            cliente.efectivo.actualizarMonto(event.getMonto());
        });

        apply( (TarjetaAgregada event) -> {
            cliente.tarjetas.add(new Tarjeta(event.getTarjetaId(),
                    event.getMarca(),
                    event.getTipo(),
                    event.getSaldo()));
        });

        apply( (MonedaDeUnEfectivoActualizada event) -> {
            cliente.efectivo.actualizarMoneda(event.getMoneda());
        });

        apply( (SaldoTarjetaActualizado event) -> {
            var tarjeta = cliente.getTarjetaPorId(event.getTarjetaId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la tarjeta del cliente"));
            tarjeta.actualizarSaldo(event.getSaldo());
        });

    }
}
