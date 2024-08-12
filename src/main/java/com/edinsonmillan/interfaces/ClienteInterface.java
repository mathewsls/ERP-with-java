package com.edinsonmillan.interfaces;

import com.edinsonmillan.entidad.*;
import java.util.List;


public interface ClienteInterface {
    
    Cliente buscarClientec (int idCliente);
    List<Cliente> obtenerTodosLosClientes();
}
