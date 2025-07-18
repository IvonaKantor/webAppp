<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
<table>
    <tr>
        <th>Date (dd.MM.yyyy)</th>
        <th>Day of Week</th>
    </tr>
    <%
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        for (int i = 0; i < 7; i++) {
            out.println("<tr>");
            out.println("<td>" + dateFormat.format(calendar.getTime()) + "</td>");
            out.println("<td>" + calendar.get(Calendar.DAY_OF_WEEK) + "</td>");
            out.println("</tr>");

            calendar.add(Calendar.DATE, 1);
        }
    %>
</table>
</body>
</html>