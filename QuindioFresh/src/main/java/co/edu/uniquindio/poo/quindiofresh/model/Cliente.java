package co.edu.uniquindio.poo.quindiofresh.model;

public class Cliente {
    private final String nombre;
    private final String email;
    private final String telefono;

    public Cliente(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
}