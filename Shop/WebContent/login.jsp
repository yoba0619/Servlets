<html>

<head>
	<title>Please Login</title>


</head>

<body>
<%
String loginError = (String)request.getAttribute("loginError");
if(loginError!=null){
%>
<span style="color:red:"><%=loginError %></span>
<%
}
%>
<form name="LoginForm" method="post" action="/Shop/cs">
	Username: <input type="text" name="username">
	Password: <input type="password" name="password">
	
	<input type="submit" name="action" value="Login">
	<input type="reset" value="reset">
	<input type="hidden" name="page"  value="login">
</form>
</body>

</html>