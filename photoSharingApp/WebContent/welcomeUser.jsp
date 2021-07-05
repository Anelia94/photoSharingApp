<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>

<body>
	<nav id="nav">

		<span><a href='catalog.jsp'>Catalog</a></span> <span><a
			href='myProfile.jsp'>My Profile</a></span>
		<div align="right">
			<span><a href='./LogOutServlet'>LogOut</a></span>
		</div>
	</nav>
	<fieldSet>
	<% String username = request.getParameter("username");
		out.println("Welcome," + username);
		%>
		</fieldSet>
</body>

</html>