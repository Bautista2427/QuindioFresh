package co.edu.uniquindio.poo.quindiofresh;

import co.edu.uniquindio.poo.quindiofresh.factory.*;
import co.edu.uniquindio.poo.quindiofresh.model.CatalogoProductos;
import co.edu.uniquindio.poo.quindiofresh.model.Cliente;
import co.edu.uniquindio.poo.quindiofresh.model.Pedido;
import co.edu.uniquindio.poo.quindiofresh.model.PedidoBuilder;
import co.edu.uniquindio.poo.quindiofresh.service.IPago;
import co.edu.uniquindio.poo.quindiofresh.service.IEnvio;
import co.edu.uniquindio.poo.quindiofresh.service.INotificacion;

public class Main {
    public static void main(String[] args) {
        // Acceder al catálogo (Singleton)
        CatalogoProductos catalogo = CatalogoProductos.getInstance();

        // Crear cliente
        Cliente cliente = new Cliente("Juan Pérez", "juan@mail.com", "3001234567");

        // Crear pedido con Builder
        Pedido pedido = new PedidoBuilder("PED001", cliente)
                .agregarProducto(catalogo.getProducto("FR001"), 3)
                .agregarProducto(catalogo.getProducto("CF001"), 1)
                .direccion("Cra 10 #20-30")
                .notas("Entregar en la portería")
                .build();

        System.out.println(pedido);

        // Procesar pago con Factory
        PagoFactory pagoFactory = new TarjetaCreditoFactory();
        IPago pago = pagoFactory.crearPago();
        boolean exito = pago.procesar(pedido.calcularTotal());

        if (exito) {
            // Calcular envío
            EnvioFactory envioFactory = new EnvioEstandarFactory();
            IEnvio envio = envioFactory.crearEnvio();
            double costoEnvio = envio.calcularCosto();

            System.out.println("Costo de envío: $" + costoEnvio);

            // Notificar cliente
            NotificacionFactory notificacionFactory = new EmailFactory();
            INotificacion notificacion = notificacionFactory.crearNotificacion();
            notificacion.enviar("Su pedido fue procesado exitosamente. Total con envío: $" +
                    (pedido.calcularTotal() + costoEnvio), cliente);
        }
    }
}