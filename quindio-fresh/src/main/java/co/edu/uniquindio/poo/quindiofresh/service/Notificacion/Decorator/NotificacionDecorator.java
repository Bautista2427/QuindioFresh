package co.edu.uniquindio.poo.quindiofresh.service.Notificacion.Decorator;

import co.edu.uniquindio.poo.quindiofresh.service.Notificacion.Notificacion;

public abstract class NotificacionDecorator implements Notificacion {
    protected Notificacion notificacion;

    public NotificacionDecorator(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    @Override
    public void enviar(String mensaje) {
        notificacion.enviar(mensaje);
    }
}