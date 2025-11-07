package co.edu.uniquindio.poo.quindiofresh.service.Notificacion;

import co.edu.uniquindio.poo.quindiofresh.utils.Adapter.SendGridAdapter;

public class NotificacionFactory {
    public static Notificacion crearNotificacion(String tipo) {
        if (tipo.equalsIgnoreCase("email")) {
            return new NotificacionEmail();
        } else if (tipo.equalsIgnoreCase("sms")) {
            return new NotificacionSms();
        } else if (tipo.equalsIgnoreCase("sendgrid")) {
            return new SendGridAdapter("SG.API_KEY_789", "noreply@quindiofresh.com", "Quindío Fresh");
        }
        throw new IllegalArgumentException("Tipo de notificación no soportado");
    }
}