package co.edu.uniquindio.poo.quindiofresh.factory;

import co.edu.uniquindio.poo.quindiofresh.model.PagoTarjetaCredito;
import co.edu.uniquindio.poo.quindiofresh.service.IPago;

public class TarjetaCreditoFactory extends PagoFactory {
    @Override
    public IPago crearPago() {
        return new PagoTarjetaCredito();
    }
}
