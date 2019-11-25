/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_pcr;

import Pertemuan11.AksesJdbcOdbc;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lab330-32
 */
public class PegawaiHome {

    public boolean create(Pegawai pegawai) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/fahtur", "root", "");

        try {

            String insert = "insert into pegawai values("
                    + "'" + pegawai.getNip() + "',"
                    + "'" + pegawai.getNamaPegawai() + "',"
                    + "'" + pegawai.getAlamat() + "',"
                    + "'" + pegawai.getJabatan() + "'"
                    + ")";
            akses.connect();
            akses.executeUpdate(insert);
            akses.disconnect();

            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PegawaiHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
