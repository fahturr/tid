<%-- 
    Document   : ContohScripting
    Created on : Oct 28, 2019, 1:52:14 PM
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
        <!--contoh deklarasi-->
        <%!
            private int luas(int sisi) {
                int hasil = sisi * sisi;
                return hasil;
            }
        %>
        <h1>Luas Persegi Empat = <%= luas(5)%></h1><br>

        <!--contoh lain penerapan scripting declaration-->
        <jsp:declaration>
            private int luas2(int sisi) {
                return sisi * sisi;
            }
        </jsp:declaration>
        <h1>Hasil luas2 = <jsp:expression>luas(10)</jsp:expression></h1>
        
    </body>
</html>
