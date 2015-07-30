/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author Bonny
 */
public class book extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            int t1 = 1;
            String t2 = request.getParameter("t2");
            String t3 = request.getParameter("t3");
            String t4 = request.getParameter("t4");
            String t5 = request.getParameter("t5");
            String t6 = request.getParameter("t6");

            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            PreparedStatement st1;
            st1 = con.prepareStatement("select * from book");
            ResultSet rs1 = st1.executeQuery();
            while(rs1.next()) {
                t1 = t1 + 1;
                }
            rs1.close();
            
            PreparedStatement st = con.prepareStatement("insert into book values (?,?,?,?,?,?)");
            st.setInt(1, t1);
            st.setString(2, t2);
            st.setString(3, t3);
            st.setString(4, t4);
            st.setString(5, t5);
            st.setString(6, t6);

            st.executeUpdate();
            PreparedStatement st2;
        st2 = con.prepareStatement("delete from cart where prodid=?");
        st2.setString(1, t3);
        st2.execute();
            con.close();
            response.sendRedirect("cart.jsp?b=1");
        } catch(Exception e) {System.out.println("Error: " + e); }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
