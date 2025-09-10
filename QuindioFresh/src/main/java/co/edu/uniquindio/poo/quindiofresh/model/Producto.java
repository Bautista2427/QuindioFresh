package co.edu.uniquindio.poo.quindiofresh.model;

public class Producto {
    private final String sku;
    private final String nombre;
    private final double precio;

    public Producto(String sku, String nombre, double precio) {
        this.sku = sku;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getSku() {
        return sku;
    }

    @Override
    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}
