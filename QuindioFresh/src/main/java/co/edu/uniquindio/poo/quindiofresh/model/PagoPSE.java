package co.edu.uniquindio.poo.quindiofresh.model;

import co.edu.uniquindio.poo.quindiofresh.service.IPago;

public class PagoPSE implements IPago {
    public boolean procesar(double monto) {
        System.out.println("Pago con PSE procesado: $" + monto);
        return true;
    }
}
