package co.edu.uniquindio.poo.quindiofresh.model;

import co.edu.uniquindio.poo.quindiofresh.service.IEnvio;

public class EnvioExpress implements IEnvio {
    public double calcularCosto() {
        return 15000;
    }
}
