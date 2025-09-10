package co.edu.uniquindio.poo.quindiofresh.model;

import java.util.HashMap;
import java.util.Map;

public class CatalogoProductos {
    private static CatalogoProductos instancia;
    private Map<String, Producto> productos;

    private CatalogoProductos() {
        productos = new HashMap<>();
        // Datos de ejemplo
        productos.put("FR001", new Producto("FR001", "Manzana", 2000));
        productos.put("FR002", new Producto("FR002", "Banano", 1500));
        productos.put("CF001", new Producto("CF001", "Café Especial", 12000));
    }

    public static CatalogoProductos getInstance() {
        if (instancia == null) {
            instancia = new CatalogoProductos();
        }
        return instancia;
    }

    public Producto getProducto(String sku) {
        return productos.get(sku);
    }
}
