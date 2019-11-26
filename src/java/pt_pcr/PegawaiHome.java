/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_pcr;

import Pertemuan11.AksesJdbcOdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lab330-32
 */
public class PegawaiHome {

    public boolean create(Pegawai pegawai) {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();

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

    public static ArrayList<Pegawai> selectAll() {
        AksesJdbcOdbc akses = new AksesJdbcOdbc();
        ArrayList<Pegawai> list = new ArrayList<>();

        try {
            String query = "SELECT * FROM pegawai";
            akses.connect();

            ResultSet rs = akses.executeQuery(query);

            while (rs.next()) {
                Pegawai pegawai = new Pegawai();
                pegawai.setNip(rs.getString(1));
                pegawai.setNamaPegawai(rs.getString(2));
                pegawai.setAlamat(rs.getString(3));
                pegawai.setJabatan(rs.getString(4));
                list.add(pegawai);
            }

            akses.disconnect();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(PegawaiHome.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
