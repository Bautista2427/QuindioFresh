package co.edu.uniquindio.poo.quindiofresh.model;

import co.edu.uniquindio.poo.quindiofresh.service.INotificacion;

public class NotificacionSMS implements INotificacion {
    public void enviar(String mensaje, Cliente cliente) {
        System.out.println("Enviando SMS a " + cliente.getTelefono() + ": " + mensaje);
    }
}
