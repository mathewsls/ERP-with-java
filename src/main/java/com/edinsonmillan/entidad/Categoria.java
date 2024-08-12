package com.edinsonmillan.entidad;

public class Categoria {

    private int idCategoria;
    private String nombre;
    private String descripcion;

    public Categoria() {
    }

    public Categoria(int idCategoria, String nombre, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }
    
    public Categoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{"
                + "idCategoria=" + idCategoria
                + ", nombre='" + nombre + '\''
                + ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
