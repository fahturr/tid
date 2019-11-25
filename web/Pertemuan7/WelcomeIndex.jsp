<%-- 
    Document   : WelcomeIndex
    Created on : Oct 21, 2019, 2:39:54 PM
    Author     : Lab330-32
--%>
<%@page import = "java.util.GregorianCalendar" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "java.util.*, java.text.*" %>

<%!
    GregorianCalendar cal = (GregorianCalendar) 
    GregorianCalendar.getInstance();
    Date dtToday = cal.getTime();
%>
<%
    cal.add(Calendar.WEEK_OF_YEAR, 1);
    Date dtNextWeek = cal.getTime();

    cal.setTime(new Date());
    cal.add(Calendar.WEEK_OF_YEAR, -1);
    Date dtPrevWeek = cal.getTime();

    cal.setTime(new Date());
    cal.add(Calendar.MONTH, 1);
    Date dtNextMonth = cal.getTime();

    cal.setTime(new Date());
    cal.add(Calendar.MONTH, -1);
    Date dtPrevMonth = cal.getTime();

    DateFormat fd = DateFormat.getDateInstance(DateFormat.FULL);
    DateFormat ft = DateFormat.getDateInstance(DateFormat.FULL);

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Informasi Waktu:</h1>
        <h2>[<%= ft.format(dtToday)%>]</h2>

        <font size="3">
        <p>
            <i>Minggu Depan</i>
            <b><%= fd.format(dtNextWeek) %></b>
        </p>
        <p>
            <i>Minggu Lalu</i>
            <b><%= fd.format(dtPrevWeek) %></b>
        </p>
        <p>
            <i>Bulan Depan</i>
            <b><%= fd.format(dtNextMonth) %></b>
        </p>
        <p>
            <i>Minggu Lalu</i>
            <b><%= fd.format(dtPrevMonth) %></b>
        </p>
        </font>
    </body>
</html>
