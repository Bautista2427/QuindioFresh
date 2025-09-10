package co.edu.uniquindio.poo.quindiofresh.factory;

import co.edu.uniquindio.poo.quindiofresh.model.NotificacionSMS;
import co.edu.uniquindio.poo.quindiofresh.service.INotificacion;

public class SMSFactory extends NotificacionFactory {
    @Override
    public INotificacion crearNotificacion() {
        return new NotificacionSMS();
    }
}
