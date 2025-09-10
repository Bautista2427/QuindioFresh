package co.edu.uniquindio.poo.quindiofresh.factory;

import co.edu.uniquindio.poo.quindiofresh.model.PagoPSE;
import co.edu.uniquindio.poo.quindiofresh.service.IPago;

public class PSEFactory extends PagoFactory {
    @Override
    public IPago crearPago() {
        return new PagoPSE();
    }
}
