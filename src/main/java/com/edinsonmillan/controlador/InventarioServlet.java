
package com.edinsonmillan.controlador;


import com.edinsonmillan.negocio.DAO.InventarioDAO;
import com.edinsonmillan.entidad.*;
import com.edinsonmillan.negocio.DAO.ProductoDAO;
import com.edinsonmillan.negocio.Services.CategoriaService;
import com.edinsonmillan.negocio.Services.InventarioService;
import com.edinsonmillan.negocio.Services.ProductoService;
import com.edinsonmillan.negocio.Services.ProveedorService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;




public class InventarioServlet extends HttpServlet {
    
    InventarioService inventarioService = new InventarioService(new InventarioDAO(new ProductoService(new ProductoDAO(new CategoriaService(), new ProveedorService()))));


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {
        response.setContentType("text/html;charset=UTF-8");
        
        String accion = request.getParameter("accion");

        try {
            if (accion != null) {
                switch (accion) {

                    case "listar":
                        listarInventario(request, response);
                        break;

                    default:
                        response.sendRedirect("inventarios.jsp");
                }

            } else {
                response.sendRedirect("inventarios.jsp");
            }
        } catch (Exception e) {
            response.sendRedirect("inventarios.jsp");
        }

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void listarInventario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        List<Inventario> inventarios = inventarioService.obtenerTodosLosInventarios();
        request.setAttribute("inventarios", inventarios);
        request.getRequestDispatcher("vista/inventario/inventarios.jsp").forward(request, response);
    }

}
