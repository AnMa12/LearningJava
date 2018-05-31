package com.company.SubIV_ServletHTMLGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class SalariiAngajati extends HttpServlet
{
    Connection conn = null;

    @Override
    public void init() throws ServletException
    {
        //super.init();
        try
        {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Angajati", "radu", "12345");
        } catch (SQLException ex)
        {
        }
    }

    @Override
    public void destroy()
    {
        //super.destroy(); //To change body of generated methods, choose Tools | Templates.
        if(conn != null)
            try {
                conn.close();
            } catch (SQLException ex) {

            }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        //processRequest(request, response);
        try (PrintWriter out = response.getWriter())
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<body>");

            float min = Float.parseFloat(request.getParameter("min"));

            PreparedStatement pst = null;
            ResultSet rs = null;

            try
            {
                pst = conn.prepareStatement("SELECT * FROM Angajati WHERE Salariu > ?");
                pst.setFloat(1 , min);

                rs = pst.executeQuery();

                while(rs.next())
                    out.println("<h1>" + rs.getString("Nume") + " " + rs.getFloat("Salariu") + " " + rs.getInt("Varsta"));

            } catch (SQLException ex)
            {

            }
            finally
            {

                try {
                    if(rs != null)
                        rs.close();
                    if(pst != null)
                        pst.close();
                } catch (SQLException ex) {

                }

            }

            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) {
    }

}
