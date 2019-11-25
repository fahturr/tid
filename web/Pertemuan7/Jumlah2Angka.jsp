<%-- 
    Document   : Jumlah2Angka
    Created on : Oct 21, 2019, 3:59:30 PM
    Author     : Lab330-32
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            try {
                float angka1 = Float.parseFloat(request.getParameter("angka1"));
                float angka2 = Float.parseFloat(request.getParameter("angka2"));
                float jumlah = angka1 + angka2;
        %>
        <h4>Jumlah dari <%= angka1%> dan <%= angka2 %> adalah <%= jumlah %></h4>
        <%
        } catch (NumberFormatException nfe) {
        %>
        <h4>Ada kesalahan dalam format data yang dikirimkan</h4>
        <h4><a href="Penjumlahan2Angka.html">Ulang Lagi?</a></h4>
        <%
            }
        %>
    </body>
</html>
