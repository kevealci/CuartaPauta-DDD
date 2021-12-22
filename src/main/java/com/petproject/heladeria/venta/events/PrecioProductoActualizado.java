package com.petproject.heladeria.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.venta.values.Precio;
import com.petproject.heladeria.venta.values.ProductoId;

public class PrecioProductoActualizado extends DomainEvent {
    private final ProductoId productoId;
    private final Precio precio;

    public PrecioProductoActualizado(ProductoId productoId, Precio precio) {
        super("petproject.venta.precioproductoactualizado");
        this.productoId = productoId;
        this.precio = precio;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
