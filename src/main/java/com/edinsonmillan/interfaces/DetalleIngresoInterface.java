
package com.edinsonmillan.interfaces;

import com.edinsonmillan.entidad.*;
import java.util.List;

public interface DetalleIngresoInterface {
    
    void insertarDetallesIngreso(List<DetalleIngreso> detallesIngreso, int idIngreso);
    List<DetalleIngreso> obtenerDetallesIngreso(int idIngreso);
    boolean insertarDetallesIngreso(List<DetalleIngreso> detallesIngreso);
}
