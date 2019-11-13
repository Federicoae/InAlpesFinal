package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import controlador.listarPersonas;

/**
 *
 * @author andre
 */
@WebServlet(urlPatterns = {"/registrarInmueble"})
public class registrarInmueble extends HttpServlet {

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
        int ubicacion = Integer.parseInt(request.getParameter("ubi"));
        int contrato = Integer.parseInt(request.getParameter("con"));
        String direccion = request.getParameter("dir");
        String descripcion = request.getParameter("desc");
        long precio = Long.parseLong(request.getParameter("pre"));
        inmueble in = new inmueble();
        try (PrintWriter out = response.getWriter()) {
            //if(!per.existe(documento,tipo)) {
                if (in.registrar(direccion, ubicacion, contrato, descripcion, precio )) {
                    request.getRequestDispatcher("index.html").forward(request, response);
                } else {
                    request.getRequestDispatcher("registrarIn.jsp").forward(request, response);
                }
            //} else {
                //request.getRequestDispatcher("listarPersonas").forward(request, response);
           // }
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
