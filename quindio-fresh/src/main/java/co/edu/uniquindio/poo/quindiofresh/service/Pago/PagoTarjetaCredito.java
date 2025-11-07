package co.edu.uniquindio.poo.quindiofresh.service.Pago;

public class PagoTarjetaCredito implements MetodoPago{
    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de crédito por un monto de: " + monto);
        return true;
    }
}
