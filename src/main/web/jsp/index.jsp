<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
<%
    Calendar calendar = Calendar.getInstance();
    int hour = calendar.get(Calendar.HOUR_OF_DAY);
    String message;

    if (hour >= 6 && hour < 12) {
        message = "Good morning";
    } else if (hour >= 12 && hour < 18) {
        message = "Good afternoon";
    } else if (hour >= 18 && hour < 23) {
        message = "Good evening";
    } else {
        message = "Good night";
    }

    out.println(message + ", user. Current time: " +
            new SimpleDateFormat("HH:mm:ss").format(calendar.getTime()));
%>
</body>
</html>