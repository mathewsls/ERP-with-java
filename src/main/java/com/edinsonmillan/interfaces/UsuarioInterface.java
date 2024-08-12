package com.edinsonmillan.interfaces;

import com.edinsonmillan.entidad.*;
import java.util.List;

public interface UsuarioInterface {

    void agregarUsuario(Usuario usuario);
    void actualizarUsuario(Usuario usuario);
    void cambiarEstadoUsuario(int idUsuario, boolean activo);
    Usuario buscarUsuario(int idUsuario);
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario validarInicioSesion(String correo , String contrasena);
    List<Usuario> buscarUsuariosPorFiltro(String filtro);

}

