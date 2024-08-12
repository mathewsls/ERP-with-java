package com.edinsonmillan.interfaces;

import com.edinsonmillan.entidad.*;

import java.util.List;

public interface CategoriaInterface {

    Categoria buscarCategoriaPorId(int idProducto);
    List<Categoria> obtenerTodasLasCategorias();
}
