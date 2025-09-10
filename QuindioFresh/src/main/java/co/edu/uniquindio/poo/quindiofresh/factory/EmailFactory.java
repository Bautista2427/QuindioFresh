package co.edu.uniquindio.poo.quindiofresh.factory;

import co.edu.uniquindio.poo.quindiofresh.model.NotificacionEmail;
import co.edu.uniquindio.poo.quindiofresh.service.INotificacion;

public class EmailFactory extends NotificacionFactory {
    @Override
    public INotificacion crearNotificacion() {
        return new NotificacionEmail();
    }
}