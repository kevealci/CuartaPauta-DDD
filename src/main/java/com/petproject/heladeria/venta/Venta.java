package com.petproject.heladeria.venta;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.petproject.heladeria.cliente.values.ClienteId;
import com.petproject.heladeria.vendedor.values.Descripcion;
import com.petproject.heladeria.vendedor.values.VendedorId;
import com.petproject.heladeria.venta.events.*;
import com.petproject.heladeria.venta.values.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public class Venta extends AggregateEvent<VentaId> {

    protected ClienteId clienteId;
    protected VendedorId vendedorId;
    protected Factura factura;
    protected Set<Producto> productos;

    public Venta(VentaId ventaId,ClienteId clienteId, VendedorId vendedorId){
        super(ventaId);
        appendChange(new VentaCreada(clienteId,vendedorId)).apply();
    }

    private Venta(VentaId ventaId) {
        super(ventaId);
        subscribe(new VentaChange(this));
    }

    public static Venta from(VentaId ventaId, List<DomainEvent> events) {
        var venta = new Venta(ventaId);
        events.forEach(venta::applyEvent);
        return venta;
    }

    public void asociarVendedor(VendedorId vendedorId) {
        appendChange(new VendedorAsociado(vendedorId)).apply();
    }

    public void asociarCliente(ClienteId clienteId) {
        appendChange(new ClienteAsociado(clienteId)).apply();
    }

    public void actualizarHeaderFactura(FacturaId facturaId, Header header){
        appendChange(new HeaderFacturaActualizado(facturaId,header)).apply();
    }

    public void actualizarBodyFactura(FacturaId facturaId,Body body){
        appendChange(new BodyFacturaActualizado(facturaId,body)).apply();
    }

    public void actualizarFooterFactura(FacturaId facturaId, Footer footer){
        appendChange(new FooterFacturaActualizado(facturaId, footer)).apply();
    }

    public void actualizarDescripcionProducto(ProductoId productoId, Descripcion descripcion){
        appendChange(new DescripcionProductoActualizada(productoId, descripcion)).apply();
    }

    public void actualizarPrecioProducto(ProductoId productoId, Precio precio){
        appendChange(new PrecioProductoActualizado(productoId, precio)).apply();
    }

    public Optional<Producto> getProductoPorId(ProductoId productoId){
        return productos
                .stream()
                .filter( producto -> producto.identity().equals(productoId))
                .findFirst();
    }

    public ClienteId clienteId() { return clienteId; }

    public VendedorId vendedorId() { return vendedorId; }

    public Factura factura() { return factura; }

    public Set<Producto> productos() { return productos; }
}
