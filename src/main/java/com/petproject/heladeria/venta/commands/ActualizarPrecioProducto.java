package com.petproject.heladeria.venta.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.venta.values.Precio;
import com.petproject.heladeria.venta.values.ProductoId;
import com.petproject.heladeria.venta.values.VentaId;

public class ActualizarPrecioProducto extends Command {

    private final VentaId ventaId;
    private final ProductoId productoId;
    private final Precio precio;

    public ActualizarPrecioProducto(VentaId ventaId, ProductoId productoId, Precio precio ) {
        this.ventaId = ventaId;
        this.productoId = productoId;
        this.precio = precio;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
