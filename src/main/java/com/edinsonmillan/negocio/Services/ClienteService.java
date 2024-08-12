
package com.edinsonmillan.negocio.Services;

import com.edinsonmillan.entidad.Cliente;
import com.edinsonmillan.interfaces.ClienteInterface;
import com.edinsonmillan.negocio.DAO.ClienteDAO;
import java.util.List;


public class ClienteService implements ClienteInterface{

    private final ClienteDAO clienteDAO;

    public ClienteService() {
        this.clienteDAO = new ClienteDAO();
    }
    
    @Override
    public Cliente buscarClientec(int idCliente) {
        return this.clienteDAO.buscarClientec(idCliente);
    }

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        return this.clienteDAO.obtenerTodosLosClientes();
    }
    
}
