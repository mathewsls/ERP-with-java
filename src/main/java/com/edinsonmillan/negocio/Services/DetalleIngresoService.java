
package com.edinsonmillan.negocio.Services;

import com.edinsonmillan.entidad.DetalleIngreso;
import com.edinsonmillan.interfaces.DetalleIngresoInterface;
import com.edinsonmillan.negocio.DAO.DetalleIngresoDAO;
import java.util.List;


public class DetalleIngresoService implements DetalleIngresoInterface{

    
    private final DetalleIngresoDAO ingresoDAO;

   
    public DetalleIngresoService(DetalleIngresoDAO ingresoDAO) {
        this.ingresoDAO = ingresoDAO;
    }
    
    @Override
    public void insertarDetallesIngreso(List<DetalleIngreso> detallesIngreso, int idIngreso) {
        this.ingresoDAO.insertarDetallesIngreso(detallesIngreso, idIngreso);
    }

    @Override
    public List<DetalleIngreso> obtenerDetallesIngreso(int idIngreso) {
        return this.ingresoDAO.obtenerDetallesIngreso(idIngreso);
    }

    @Override
    public boolean insertarDetallesIngreso(List<DetalleIngreso> detallesIngreso) {
        return this.ingresoDAO.insertarDetallesIngreso(detallesIngreso);
    }
    
}
