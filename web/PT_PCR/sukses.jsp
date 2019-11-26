<%-- 
    Document   : sukses
    Created on : Nov 25, 2019, 3:01:16 PM
    Author     : Lab330-32
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:useBean id="pegawai" class="pt_pcr.Pegawai" />
    <%
        pegawai = (pt_pcr.Pegawai) request.getAttribute("dataPegawai");
    %>
    <body>
        <h1>Penambahan Data Pegawai</h1>
        <br/> 
        <table>
            <tr>
                <td>NIP</td>
                <td>:</td>
                <td><%= pegawai.getNip()%></td>
            </tr>
            <tr>
                <td>Nama Pegawai</td>
                <td>:</td>
                <td><%= pegawai.getNamaPegawai()%></td>
            </tr>
            <tr>
                <td>Alamat</td>
                <td>:</td>
                <td><%= pegawai.getAlamat()%></td>
            </tr>
            <tr>
                <td>Jabatan</td>
                <td>:</td>
                <td><%= pegawai.getJabatan()%></td>
            </tr>
        </table>
        <br>
        <h3>Berhasil ditambahkan ke database</h3>
        <a href="PT_PCR/add_pegawai.html">Tambah lagi</a><br>
        <a href="PT_PCR/daftar_pegawai.jsp">Lihat daftar Pegawai</a>
    </body>
</html>
