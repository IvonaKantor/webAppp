<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>JSP Page</title>
</head>
<body>
<h1>Click to know what time is now</h1>

<form method="post">
    <button type="submit" name="press">Press Me</button>
</form>
<%
    if ("POST".equals(request.getMethod()) && request.getParameter("press") != null) {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);

        if (hour >= 6 && hour < 12) {
%>
<jsp:include page="morning.jsp"/>
<%
} else if (hour >= 12 && hour < 18) {
%>
<jsp:include page="afternoon.jsp"/>
<%
} else if (hour >= 18 && hour < 23) {
%>
<jsp:include page="evening.jsp"/>
<%
} else {
%>
<jsp:include page="night.jsp"/>
<%
        }
    }
%>
<br>
<hr>
<jsp:include page="days.jsp"/>
<hr>
</body>
</html>