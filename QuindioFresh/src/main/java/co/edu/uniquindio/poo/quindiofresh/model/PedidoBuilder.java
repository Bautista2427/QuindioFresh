package co.edu.uniquindio.poo.quindiofresh.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PedidoBuilder {
    String id;
    Date fechaCreacion;
    Cliente cliente;
    Map<Producto, Integer> productos = new HashMap<>();
    String direccion;
    String notas;
    String codigoDescuento;

    public PedidoBuilder(String id, Cliente cliente) {
        this.id = id;
        this.fechaCreacion = new Date();
        this.cliente = cliente;
    }

    public PedidoBuilder agregarProducto(Producto p, int cantidad) {
        productos.put(p, cantidad);
        return this;
    }

    public PedidoBuilder direccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    public PedidoBuilder notas(String notas) {
        this.notas = notas;
        return this;
    }

    public PedidoBuilder descuento(String codigo) {
        this.codigoDescuento = codigo;
        return this;
    }

    public Pedido build() {
        return new Pedido(this); // ahora puede acceder al constructor
    }
}