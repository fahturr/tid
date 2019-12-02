/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan11;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pt_pcr.Pegawai;
import pt_pcr.PegawaiHome;

/**
 *
 * @author Lab330-32
 */
public class OlahAddPegawai extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher;

        String nip = request.getParameter("nip");
        String nama = request.getParameter("nama");
        String alamat = request.getParameter("alamat");
        String jabatan = request.getParameter("jabatan");

        Pegawai pegawai = new Pegawai();
        pegawai.setNip(nip);
        pegawai.setNamaPegawai(nama);
        pegawai.setAlamat(alamat);
        pegawai.setJabatan(jabatan);

        PegawaiHome home = new PegawaiHome();
        request.setAttribute("dataPegawai", pegawai);

        if (home.create(pegawai) == true) {
            dispatcher = request.getRequestDispatcher("PT_PCR/sukses.jsp");
            dispatcher.forward(request, response);
        } else {
            dispatcher = request.getRequestDispatcher("PT_PCR/gagal.jsp");
            dispatcher.forward(request, response);
        }
    }
}
