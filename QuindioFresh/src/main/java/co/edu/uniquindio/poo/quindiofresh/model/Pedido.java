package co.edu.uniquindio.poo.quindiofresh.model;

import java.util.Date;
import java.util.Map;

public class Pedido {
    private final String id;
    private Date fechaCreacion;
    private final Cliente cliente;
    private final Map<Producto, Integer> productos;
    private String direccion;
    private String notas;
    private String codigoDescuento;

    Pedido(PedidoBuilder builder) {
        this.id = builder.id;
        this.fechaCreacion = builder.fechaCreacion;
        this.cliente = builder.cliente;
        this.productos = builder.productos;
        this.direccion = builder.direccion;
        this.notas = builder.notas;
        this.codigoDescuento = builder.codigoDescuento;
    }

    public double calcularTotal() {
        return productos.entrySet().stream()
                .mapToDouble(e -> e.getKey().getPrecio() * e.getValue())
                .sum();
    }

    @Override
    public String toString() {
        return "Pedido " + id + " de " + cliente.getNombre() +
                "\nProductos: " + productos +
                "\nTotal: $" + calcularTotal();
    }
}