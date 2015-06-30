/**
 * importacion de librerias necesarias.
 *  
 */
package controlador;

import java.io.IOException;  
import java.io.PrintWriter;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;

/**
 *
 * @author Jorge Armando Londoño Ocampo
 */
@WebServlet(name = "guardar", urlPatterns = {"/guardar"})
public class guardar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet identifica la respuesta del servlet.java (correcto.jsp) en caso de no haber error en la transacion de datos 
     * @param response servlet response (argumento que recibe el servlet para ejecutar la transacion)
     * @throws ServletException. definido asi en caso de error en algun servlet en especifico 
     * 
     */
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        //varibles locales importando la clase Usuarios.java (asi definida en la base de datos)
        String nombre = request.getParameter("nombre");
        String direcion = request.getParameter("direcion");
        modelo.Usuarios usuario = new modelo.Usuarios();
        usuario.setNombre(nombre);
        usuario.setDirecion(direcion);
        
        EntityManager em;
        EntityManagerFactory emf;
        
        
        // "weboracle( nombre del proyecto)", "weboraclePU (nombre de la persistencia de datos 'persistence.xml' ) "
        emf = Persistence.createEntityManagerFactory("weboraclePU");
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(usuario); 
        em.flush();
        em.getTransaction().commit();
        response.sendRedirect("correcto.jsp");
        
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
