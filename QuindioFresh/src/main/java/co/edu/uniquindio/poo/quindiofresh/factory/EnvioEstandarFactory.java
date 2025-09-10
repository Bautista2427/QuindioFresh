package co.edu.uniquindio.poo.quindiofresh.factory;

import co.edu.uniquindio.poo.quindiofresh.model.EnvioEstandar;
import co.edu.uniquindio.poo.quindiofresh.service.IEnvio;

public class EnvioEstandarFactory extends EnvioFactory {
    @Override
    public IEnvio crearEnvio() {
        return new EnvioEstandar();
    }
}