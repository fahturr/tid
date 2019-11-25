/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lab330-32
 */
public class OlahInputHidden extends HttpServlet {

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
        String nama = request.getParameter("nama");
        String jurusan = request.getParameter("jur");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OlahInputHidden</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=OlahInputHidden2 method=POST>");
            out.println(strSelectJurSMA(jurusan));
            out.printf("<input type=hidden name=nama value=\"%s\">", nama);
            out.printf("<input type=hidden name=jur value=%s>", jurusan);
            out.println("<input type=submit value=Kirim>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    private String strSelectJurSMA(String jur) {
        switch (jur) {
            case "IPA":
                return "<select name=pil>"
                        + "<option value=TK>Teknik Komputer</option>"
                        + "<option value=TI>Teknik Informatika</option>"
                        + "<option value=TE>Teknik Elektronika</option>"
                        + "</select>";
            case "IPS":
                return "<select name=pil>"
                        + "<option value=SI>Sistem Informasi</option>"
                        + "<option value=AKT>Teknik Informatika</option>"
                        + "</select>";
            default:
                return "";
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
