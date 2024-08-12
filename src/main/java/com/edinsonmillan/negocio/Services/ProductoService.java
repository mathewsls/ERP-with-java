package com.edinsonmillan.negocio.Services;


import com.edinsonmillan.negocio.DAO.ProductoDAO;
import com.edinsonmillan.entidad.Producto;
import com.edinsonmillan.interfaces.ProductoInterface;
import com.edinsonmillan.negocio.DTO.EstadisticasIngresoSalidaDTO;
import com.edinsonmillan.negocio.DTO.MovimientoProductoDTO;
import java.util.List;

public class ProductoService implements ProductoInterface{

    private final ProductoDAO productoDAO;

   
    public ProductoService(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }
    
    @Override
    public void agregarProducto(Producto producto) {
        productoDAO.agregarProducto(producto);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        productoDAO.actualizarProducto(producto);
    }
       
    @Override
    public Producto buscarProducto(int idProducto) {
        return productoDAO.buscarProducto(idProducto);
    }

    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return productoDAO.obtenerTodosLosProductos();
    }

    @Override
    public List<Producto> buscarProductoPorCriterio(String valorBusqueda) {
        return productoDAO.buscarProductoPorCriterio(valorBusqueda);
    }

    @Override
    public void cambiarEstadoProducto(int idProducto, boolean activo) {
        productoDAO.cambiarEstadoProducto(idProducto, activo);
    }

    @Override
    public List<MovimientoProductoDTO> obtenerMovimientosGenerales() {
        return productoDAO.obtenerMovimientosGenerales();
    }

    @Override
    public List<MovimientoProductoDTO> obtenerMovimientosPorProductoNombre(String campo_busqueda) {
        return productoDAO.obtenerMovimientosPorProductoNombre(campo_busqueda);
    }

    @Override
    public List<MovimientoProductoDTO> obtenerMovimientosPorProductoNombreTipoMovimiento(String campo_busqueda, String tipo) {
        return productoDAO.obtenerMovimientosPorProductoNombreTipoMovimiento(campo_busqueda, tipo);
    }

    @Override
    public List<EstadisticasIngresoSalidaDTO> obtenerEstadisticasIngresoSalida() {
        return productoDAO.obtenerEstadisticasIngresoSalida();
    }

    @Override
    public List<MovimientoProductoDTO> obtenerMovimientosPorTipoMovimiento(String tipo) {
        return productoDAO.obtenerMovimientosPorTipoMovimiento(tipo);
    }
}
