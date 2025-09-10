package co.edu.uniquindio.poo.quindiofresh.factory;

import co.edu.uniquindio.poo.quindiofresh.model.EnvioExpress;
import co.edu.uniquindio.poo.quindiofresh.service.IEnvio;

public class EnvioExpressFactory extends EnvioFactory {
    @Override
    public IEnvio crearEnvio() {
        return new EnvioExpress();
    }
}