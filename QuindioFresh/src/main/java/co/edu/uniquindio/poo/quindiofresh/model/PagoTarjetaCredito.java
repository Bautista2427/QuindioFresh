package co.edu.uniquindio.poo.quindiofresh.model;

import co.edu.uniquindio.poo.quindiofresh.service.IPago;

public class PagoTarjetaCredito implements IPago {
    public boolean procesar(double monto) {
        System.out.println("Pago con Tarjeta de Crédito procesado: $" + monto);
        return true;
    }
}
