/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan9;

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
public class DaftarMahasiswa extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        try {
            MahasiswaFacade mahasiswaFacade = new MahasiswaFacade();
            Mahasiswa mahasiswa = null;
            Mahasiswa[] daftarmahasiswa = mahasiswaFacade.getDaftarMahasiswa();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DaftarMahasiswa</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Daftar Mahasiswa</h1>");
            out.println("<hr/>");
            out.println("<table border>"
                    + "<tr>"
                    + "<td>NIM</td>"
                    + "<td>Nama Mahasiswa</td>"
                    + "<td>Program Studi</td>"
                    + "</tr>");
            for (Mahasiswa daftarmahasiswa1 : daftarmahasiswa) {
                out.printf("<tr>"
                        + "<td>%s</td>"
                        + "<td>"
                        + "<a href=DataMahasiswa?nim=%s>"
                        + "%s"
                        + "</a>"
                        + "</td>"
                        + "<td>%s</td>"
                        + "</tr>", daftarmahasiswa1.getNim(), daftarmahasiswa1.getNim(),
                        daftarmahasiswa1.getNamaMhs(), daftarmahasiswa1.getProdi());
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
