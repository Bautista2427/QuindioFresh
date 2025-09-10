package co.edu.uniquindio.poo.quindiofresh.service;

import co.edu.uniquindio.poo.quindiofresh.model.Cliente;

public interface INotificacion {
    void enviar(String mensaje, Cliente cliente);
}
