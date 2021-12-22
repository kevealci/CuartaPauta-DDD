package com.petproject.heladeria.venta.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.vendedor.values.Descripcion;
import com.petproject.heladeria.venta.values.ProductoId;

public class DescripcionProductoActualizada extends DomainEvent {
    private final ProductoId productoId;
    private final Descripcion descripcion;

    public DescripcionProductoActualizada(ProductoId productoId, Descripcion descripcion) {
        super("petproject.venta.descripcionproductoactualizada");
        this.productoId = productoId;
        this.descripcion = descripcion;
    }

    public ProductoId getProductoId() {
        return productoId;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }
}
