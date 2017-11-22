/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.ControlEdificio;
import Modelo.Edificio;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author papalominos
 */
@WebServlet(name = "ServletEdificio", urlPatterns = {"/ServletEdificio"})
public class ServletEdificio extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
              RequestDispatcher dispatcher = null;
              HttpSession sesion = request.getSession();
            
            
            String btn_guardar = request.getParameter("btn_guardar");
            
            
            if(btn_guardar != null)
            {
              String codigo = request.getParameter("id_edificio");
              String nomb_edificio = request.getParameter("n_edificio");
              String direccion = request.getParameter("direccion");
              String comuna = request.getParameter("comuna");
              int c = Integer.parseInt(comuna);
              String permiso = request.getParameter("permiso");
              int p = Integer.parseInt(permiso);
              
              Edificio e = new Edificio();
              e.setId_edificio(codigo);
              e.setN_edifico(nomb_edificio);
              e.setDireccion(direccion);
              e.setId_comuna(c);
              e.setPosee_permiso(p);
              
              ControlEdificio ce = new ControlEdificio();
              ce.InsertarEdificio(e);
              
              dispatcher = request.getRequestDispatcher("/AdminCentral.jsp");
                dispatcher.forward(request, response);
                
            
            }
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
