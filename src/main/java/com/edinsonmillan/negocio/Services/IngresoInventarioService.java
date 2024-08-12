
package com.edinsonmillan.negocio.Services;

import com.edinsonmillan.entidad.IngresoInventario;
import com.edinsonmillan.interfaces.IngresoInventarioInterface;
import com.edinsonmillan.negocio.DAO.IngresoInventarioDAO;
import java.util.List;


public class IngresoInventarioService implements IngresoInventarioInterface{
    
    private final IngresoInventarioDAO ingresoInventarioDAO;
    
    public IngresoInventarioService(IngresoInventarioDAO ingresoInventarioDAO) {
        this.ingresoInventarioDAO = ingresoInventarioDAO;
    }

    @Override
    public IngresoInventario realizarIngresoInventario(IngresoInventario ingresoInventario) {
        return this.ingresoInventarioDAO.realizarIngresoInventario(ingresoInventario);
    }

    @Override
    public IngresoInventario buscarIngresoInventario(int idIngreso) {
        return this.ingresoInventarioDAO.buscarIngresoInventario(idIngreso);
    }

    @Override
    public List<IngresoInventario> obtenerTodosLosIngresos() {
        return this.ingresoInventarioDAO.obtenerTodosLosIngresos();
    }

    @Override
    public List<IngresoInventario> buscarIngresosPorFecha(String fechaInicio, String fechaFin) {
        return this.ingresoInventarioDAO.buscarIngresosPorFecha(fechaInicio, fechaFin);
    }
    
}
