/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pt_pcr.Pegawai;
import pt_pcr.PegawaiHome;
import Pertemuan11.OlahAddPegawai;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Lab330-32
 */
public class OlahAddPegawai extends HttpServlet {

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
        RequestDispatcher dispatcher;

        try {
            String nip =request.getParameter("nip");
            String nama =request.getParameter("nama");
            String alamat =request.getParameter("alamat");
            String jabatan =request.getParameter("jabatan");
            
            Pegawai pegawai = new Pegawai();
            pegawai.setNip(nip);
            pegawai.setNamaPegawai(nama);
            pegawai.setAlamat(alamat);
            pegawai.setJabatan(jabatan);
            
            PegawaiHome home = new PegawaiHome();
            request.setAttribute("dataPegawai", pegawai);
            
            if (home.create(pegawai) == true) {
                dispatcher = getServletContext().getRequestDispatcher("/sukses.jsp");
                dispatcher.forward(request, response);
            } else {
                dispatcher = getServletContext().getRequestDispatcher("/gagal.jsp");
                dispatcher.forward(request, response);
            }
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
