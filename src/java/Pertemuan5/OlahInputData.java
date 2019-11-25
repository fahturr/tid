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
public class OlahInputData extends HttpServlet {

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
        PrintWriter out = response.getWriter();

        String nama = request.getParameter("nama");
        String c = request.getParameter("prodi");
        String d = request.getParameter("jk");
        int nim = Integer.parseInt(request.getParameter("nim"));
        String e = request.getParameter("bahasa1");
        String e1 = request.getParameter("bahasa2");
        String e2 = request.getParameter("bahasa3");
        String e3 = request.getParameter("bahasa4");
        String db[] = request.getParameterValues("db");

        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OlahInputData</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Data Mahasiswa</h1>");
            out.printf("Nama Mahasiswa : %s <br/>"
                    + "Nim : %d <br>", nama, nim);
            out.println("Program Studi : ");
            switch (c) {
                case "TI":
                    out.println("Teknik Informatika");
                    break;
                case "SI":
                    out.println("Sistem Informasi");
                    break;
                case "TK":
                    out.println("Teknik Komputer");
                    break;
                case "TM":
                    out.println("Teknik Mekatronika");
                    break;
                case "TET":
                    out.println("Teknik Elektronika Telekomunikasi");
                    break;
                case "MS":
                    out.println("Teknik Mesin");
                    break;
                case "TE":
                    out.println("Teknik Elektronika");
                    break;
                case "TL":
                    out.println("Teknik Listrik");
                    break;
                case "LK":
                    out.println("Teknik Telekomunikasi");
                    break;
                case "AKT":
                    out.println("Akuntansi");
                    break;
                default:
                    break;
            }
            out.println("<br>");
            out.printf("Jenis Kelamin : %s<br>", d);
            out.println("Bahasa Pemrograman : <br>");
            if (e != null) {
                out.print("PHP<br>");
            }
            if (e1 != null) {
                out.print("JSP<br>");
            }
            if (e2 != null) {
                out.print("Go<br>");
            }
            if (e3 != null) {
                out.print("Javascript<br>");
            }
            out.println("Data Base yang dikuasai : <br>");
            for (int i = 0; i < db.length; i++) {
                out.printf("DB ke-%d:%s<br>", i + 1, db[i]);
            }
            out.println("<form action=OlahInputData method=POST>");
            out.println("Apakan anda kayin dengan isian datanya:<br>"
                    + "<input type=radio name=tanya value=ya>Ya<br>"
                    + "<input type=radio name=tanya value=tidak>Tidak<br>"
                    + "<input type=submit>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
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
        PrintWriter out = response.getWriter();
        String tanya = request.getParameter("tanya");

        try {
            if (tanya.equals("ya")) {
                out.println("Terima Kasih, sudah mendaftar");
            } else if (tanya.equals("tidak")) {
                out.println("Cek kembali isian data anda");
            }
        } finally {
            out.close();
        }
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
