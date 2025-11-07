package co.edu.uniquindio.poo.quindiofresh.service.Fachadas;

import co.edu.uniquindio.poo.quindiofresh.model.DTO.ClienteDTO;
import co.edu.uniquindio.poo.quindiofresh.model.DTO.ProductoDTO;
import co.edu.uniquindio.poo.quindiofresh.model.DTO.PedidoDTO;
import co.edu.uniquindio.poo.quindiofresh.model.DTO.ItemPedidoDTO;
import co.edu.uniquindio.poo.quindiofresh.model.DTO.ResumenPedidoDTO;
import co.edu.uniquindio.poo.quindiofresh.service.ClienteService;
import co.edu.uniquindio.poo.quindiofresh.service.ProductoService;
import co.edu.uniquindio.poo.quindiofresh.service.PedidoService;
import co.edu.uniquindio.poo.quindiofresh.service.CatalogoProductosService;

import java.util.List;

/**
 * Facade que actúa como punto de entrada
 * Delega toda la lógica a los servicios correspondientes
 */
public class MinimercadoFacade {

    private final ClienteService clienteService;
    private final ProductoService productoService;
    private final PedidoService pedidoService;

    public MinimercadoFacade() {
        this.clienteService = new ClienteService();
        this.productoService = new ProductoService();
        CatalogoProductosService catalogoProductosService = new CatalogoProductosService();
        this.pedidoService = new PedidoService(catalogoProductosService);
    }

    // ========== DELEGACIÓN SIMPLE A SERVICIOS ==========

    // Clientes
    public List<ClienteDTO> obtenerTodosLosClientes() {
        return clienteService.obtenerTodosLosClientes();
    }

    public ClienteDTO buscarClientePorCedula(String cedula) {
        return clienteService.buscarClientePorCedula(cedula);
    }

    public boolean agregarCliente(ClienteDTO clienteDTO) {
        return clienteService.agregarCliente(clienteDTO);
    }

    public boolean actualizarCliente(ClienteDTO clienteDTO) {
        return clienteService.actualizarCliente(clienteDTO);
    }

    public boolean eliminarCliente(String cedula) {
        return clienteService.eliminarCliente(cedula);
    }

    public boolean existeCliente(String cedula) {
        return clienteService.existeCliente(cedula);
    }

    // Productos
    public List<ProductoDTO> obtenerTodosLosProductos() {
        return productoService.obtenerTodosLosProductos();
    }

    public ProductoDTO buscarProductoPorSku(String sku) {
        return productoService.buscarProductoPorSku(sku);
    }

    public boolean agregarProducto(ProductoDTO productoDTO) {
        return productoService.agregarProducto(productoDTO);
    }

    public boolean actualizarProducto(ProductoDTO productoDTO) {
        return productoService.actualizarProducto(productoDTO);
    }

    public boolean eliminarProducto(String sku) {
        return productoService.eliminarProducto(sku);
    }

    public boolean existeProducto(String sku) {
        return productoService.existeProducto(sku);
    }

    // Pedidos
    public ResumenPedidoDTO procesarPedido(PedidoDTO pedidoDTO) {
        return pedidoService.procesarPedido(pedidoDTO);
    }

    public double calcularSubtotal(List<ItemPedidoDTO> items) {
        return pedidoService.calcularSubtotal(items);
    }

    public double calcularCostoEnvio(String tipoEnvio) {
        return pedidoService.calcularCostoEnvio(tipoEnvio);
    }

    public double calcularTotal(double subtotal, double costoEnvio) {
        return pedidoService.calcularTotal(subtotal, costoEnvio);
    }
}