package com.edinsonmillan.negocio.Services;

import com.edinsonmillan.negocio.DAO.CategoriaDAO;
import com.edinsonmillan.entidad.Categoria;
import com.edinsonmillan.interfaces.CategoriaInterface;

import java.util.List;

public class CategoriaService implements CategoriaInterface{

    private final CategoriaInterface categoriaDAO;

    public CategoriaService() {
        this.categoriaDAO = new CategoriaDAO();
    }

    @Override
    public Categoria buscarCategoriaPorId(int idCategoria) {
        return categoriaDAO.buscarCategoriaPorId(idCategoria);
    }

    @Override
    public List<Categoria> obtenerTodasLasCategorias() {
        return categoriaDAO.obtenerTodasLasCategorias();
    }
}
