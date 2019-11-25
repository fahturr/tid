<%-- 
    Document   : OlahGET
    Created on : Oct 21, 2019, 3:11:26 PM
    Author     : Lab330-32
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    int angka = Integer.parseInt(request.getParameter("no"));
    int angka2 = angka * angka;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pengoolahan Get</title>
    </head>
    <body>
        <h3>Data yang dikirimkan dari halaman CobaGET adalah <%= angka %></h3>
        <h3>Dan hasil kuadratnya adalah <%= angka2 %></h3>
    </body>
</html>
