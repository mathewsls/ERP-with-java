package com.edinsonmillan.interfaces;

import com.edinsonmillan.entidad.*;
import java.util.List;

public interface ProveedorInterface {

    void agregarProveedor(Proveedor proveedor);
    void actualizarProveedor(Proveedor proveedor);
    void eliminarProveedor(int idProveedor);
    Proveedor buscarProveedor(int idProveedor);
    List<Proveedor> obtenerTodosLosProveedores();

}
