package com.petproject.heladeria.venta.commands;

import co.com.sofka.domain.generic.Command;
import com.petproject.heladeria.vendedor.values.Descripcion;
import com.petproject.heladeria.venta.values.ProductoId;
import com.petproject.heladeria.venta.values.VentaId;

public class ActualizarDescripcionProducto extends Command {

    private final VentaId ventaId;
    private final ProductoId productoId;
    private final Descripcion descripcion;

    public ActualizarDescripcionProducto(VentaId ventaId, ProductoId productoId, Descripcion descripcion) {
        this.ventaId = ventaId;
        this.productoId = productoId;
        this.descripcion = descripcion;
    }

    public VentaId getVentaId() {
        return ventaId;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
