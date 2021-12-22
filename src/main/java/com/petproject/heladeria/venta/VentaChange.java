package com.petproject.heladeria.venta;

import co.com.sofka.domain.generic.EventChange;
import com.petproject.heladeria.venta.events.*;

import java.util.HashSet;

public class VentaChange extends EventChange {

    public VentaChange(Venta venta) {

        apply( (VentaCreada event) -> {
            venta.clienteId = event.getClienteId();
            venta.vendedorId = event.getVendedorId();
            venta.productos = new HashSet<>();
        });

        apply( (BodyFacturaActualizado event) -> {
            venta.factura.actualizarBody(event.getBody());
        });

        apply( (ClienteAsociado event) -> {
            venta.clienteId = event.getClienteId();
        });

        apply( (DescripcionProductoActualizada event) -> {
            var producto = venta.getProductoPorId(event.getProductoId())
                    .orElseThrow( () -> new IllegalArgumentException("Producto no encontrado en la venta"));
            producto.actualizarDescripcion(event.getDescripcion());
        });

        apply( (FooterFacturaActualizado event) -> {
            venta.factura.actualizarFooter(event.getFooter());
        });

        apply( (HeaderFacturaActualizado event) -> {
            venta.factura.actualizarHeader(event.getHeader());
        });

        apply( (PrecioProductoActualizado event) -> {
            var producto = venta.getProductoPorId(event.getProductoId())
                    .orElseThrow( () -> new IllegalArgumentException("Producto no encontrado en la venta"));
            producto.actualizarPrecio(event.getPrecio());
        });

        apply( (VendedorAsociado event) -> {
            venta.vendedorId = event.getVendedorId();
        });
    }
}
