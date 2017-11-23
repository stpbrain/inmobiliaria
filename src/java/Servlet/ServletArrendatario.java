/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Controlador.ControlArrendatario;
import Modelo.Departamento;
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
 * Author     : Kathy
 */
@WebServlet(name = "ServletArrendatario", urlPatterns = {"/ServletArrendatario"})
public class ServletArrendatario extends HttpServlet {

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
            String btnIngresar = request.getParameter("btn_guardar");
            
            HttpSession sesion = request.getSession();
            RequestDispatcher dispatcher;
            
            ControlArrendatario ctrlArrendatario = new ControlArrendatario();
            
            if (btnIngresar != null){
                if(ctrlArrendatario.buscarEdificio((String.valueOf(sesion.getAttribute("id_edificio"))))){
                    if(ctrlArrendatario.permisoMunicipal(String.valueOf(sesion.getAttribute("id_edificio")))){
                    Departamento departamento = new Departamento();
                    departamento.setId_edificio(request.getParameter("id_edificio"));
                    departamento.setId_departamento(Integer.parseInt(request.getParameter("id_depto")));
                    departamento.setResidente(request.getParameter("txtResidente"));
                    
                        sesion.setAttribute("registrarCliente", "Cliente Registrado");
                        dispatcher = getServletContext().getRequestDispatcher("/09RegistrarCliente.jsp");
                        dispatcher.forward(request, response); 
                    }
                }
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
