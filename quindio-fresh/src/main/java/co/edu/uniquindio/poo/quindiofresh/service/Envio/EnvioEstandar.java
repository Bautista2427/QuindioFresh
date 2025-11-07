package co.edu.uniquindio.poo.quindiofresh.service.Envio;

public class EnvioEstandar implements Envio {

    @Override
    public double calcularCostoEnvio() {
        double costo = 7000;
        System.out.println("Costo de envío estándar: " + costo);
        return costo;
    }

}
