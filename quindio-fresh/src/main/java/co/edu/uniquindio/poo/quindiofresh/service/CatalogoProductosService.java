package co.edu.uniquindio.poo.quindiofresh.service;

import co.edu.uniquindio.poo.quindiofresh.model.Minimercado;
import co.edu.uniquindio.poo.quindiofresh.model.Producto;

public class CatalogoProductosService {
    public Producto buscarProducto(String sku) {
        for (Producto producto : Minimercado.getInstancia().getProductos()) {
            if (producto.getSku().equalsIgnoreCase(sku)) {
                return producto;
            }
        }
        return null;
    }
}