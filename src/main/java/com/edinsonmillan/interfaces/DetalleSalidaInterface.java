
package com.edinsonmillan.interfaces;


import com.edinsonmillan.entidad.*;
import java.util.List;


public interface  DetalleSalidaInterface {
    
    void insertarDetallesSalida(List<DetalleSalida> detallesSalida, int idSalida);
    List<DetalleSalida> obtenerDetallesSalida(int idSalida);
    void insertarDetallesSalida(List<DetalleSalida> detallesSalida);
}
