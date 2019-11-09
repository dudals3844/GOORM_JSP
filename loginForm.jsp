<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head><title>Login</title><head>
<body>
<form action = "<%=request.getContextPath()%>/login.jsp">
ID: <input type="text" name="memberId">
Password: <input type="password" name="password">
<input type="submit" value="login">
</form>
</body>
</html>