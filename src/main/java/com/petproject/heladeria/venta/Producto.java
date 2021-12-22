package com.petproject.heladeria.venta;

import co.com.sofka.domain.generic.Entity;
import com.petproject.heladeria.cliente.values.Monto;
import com.petproject.heladeria.vendedor.values.Descripcion;
import com.petproject.heladeria.venta.values.Precio;
import com.petproject.heladeria.venta.values.ProductoId;

import java.util.Objects;

public class Producto extends Entity<ProductoId> {
    private Precio precio;
    private Descripcion descripcion;

    public Producto(ProductoId entityId, Precio precio, Descripcion descripcion) {
        super(entityId);
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public void actualizarPrecio(Precio precio){ this.precio = Objects.requireNonNull(precio); }

    public void actualizarDescripcion(Descripcion descripcion){ this.descripcion = Objects.requireNonNull(descripcion); }

    public Precio precio() { return precio; }

    public Descripcion descripcion() { return descripcion; }
}
