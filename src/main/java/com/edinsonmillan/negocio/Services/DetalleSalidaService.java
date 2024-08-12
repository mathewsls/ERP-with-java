
package com.edinsonmillan.negocio.Services;

import com.edinsonmillan.entidad.DetalleSalida;
import com.edinsonmillan.interfaces.DetalleSalidaInterface;
import com.edinsonmillan.negocio.DAO.DetalleSalidaDAO;
import java.util.List;


public class DetalleSalidaService implements DetalleSalidaInterface{

    
    private final DetalleSalidaDAO salidaDAO = new DetalleSalidaDAO();

   
    @Override
    public void insertarDetallesSalida(List<DetalleSalida> detallesSalida, int idSalida) {
        this.salidaDAO.insertarDetallesSalida(detallesSalida, idSalida);
    }

    @Override
    public List<DetalleSalida> obtenerDetallesSalida(int idSalida) {
        return salidaDAO.obtenerDetallesSalida(idSalida);
    }

    @Override
    public void insertarDetallesSalida(List<DetalleSalida> detallesSalida) {
        salidaDAO.insertarDetallesSalida(detallesSalida);
    }
    
}
