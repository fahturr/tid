<%@page import="pt_pcr.PegawaiHome"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pt_pcr.Pegawai"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList<Pegawai> list = PegawaiHome.selectAll();
        %>
        <h3>Daftar Pegawai</h3>
        <table border="1">
            <tr>
                <td>NIP</td>
                <td>Nama Pegawai</td>
                <td>Alamat</td>
                <td>Jabatan</td>
                <td>Aksi</td>
            </tr>
            <%
                for (int i = 0; i < list.size(); i++) {
                    list.get(i);
            %>
            <tr>
                <td><%= list.get(i).getNip()%></td>
                <td><%= list.get(i).getNamaPegawai()%></td>
                <td><%= list.get(i).getAlamat()%></td>
                <td><%= list.get(i).getJabatan()%></td>
                <td>
                    <a href="formEditPegawai.jsp?nip=<%= list.get(i).getNip()%>" >Edit</a> 
                    |
                    <a href="../OlahHapusPegawai?nip=<%= list.get(i).getNip()%>" >Hapus</a>
                </td>
            </tr>
            <%
                }
            %>
        </table>
        <br>
        <a href="add_pegawai.html">Tambah data lagi</a>
    </body>
</html>
