package co.edu.uniquindio.poo.quindiofresh.model;

import co.edu.uniquindio.poo.quindiofresh.service.INotificacion;

public class NotificacionEmail implements INotificacion {
    @Override
    public void enviar(String mensaje, Cliente cliente) {
        System.out.println("Enviando EMAIL a " + cliente.getEmail() + ": " + mensaje);
    }
}