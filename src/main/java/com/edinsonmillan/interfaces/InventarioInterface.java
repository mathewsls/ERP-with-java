package com.edinsonmillan.interfaces;


import com.edinsonmillan.entidad.*;
import java.util.List;

public interface InventarioInterface {

    void agregarInventario(Inventario inventario);
    void actualizarInventario(Inventario inventario);
    void eliminarInventario(int idProducto);
    Inventario buscarInventario(int idProducto);
    List<Inventario> obtenerTodosLosInventarios();
    List<Inventario> buscarInventarioPorCriterio(String valorBusqueda);

}
