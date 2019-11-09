<%@ page contentType="text/html; charset=utf-8"%>
<%
    String memberId = request.getParameter("memberId");
    session.setAttribute("MEMBER",memberId);
%>
<html>
<head><title>Login</title><head>
<body>
Login process
</body>
</html>