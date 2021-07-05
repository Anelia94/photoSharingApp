<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Log in</title>
</head>
<body>
<div align="center">

	<nav id="nav">
<div align="left">
		<span><a href='homePage.jsp'>Home</a></span>
			</div>
		<div align="right">
			<span><a href='login.jsp'>logIn</a></span> <span><a
				href='registration.jsp'>Register</a></span>
		</div>
	</nav>
	<fieldSet>
	<form action="Login" method="post">
		<h2>Log in</h2>
		<p>	
			<input id="username" name="username" type="text"
				placeholder="Username" required>
		</p>
		<p>
			<input id="password" name="password" type="password"
				placeholder="Password" required>
		</p>
		<p>
			<input type="submit" value="Log in" id="submit">
		</p>
	</form>
		</fieldSet>
	</div>
</body>
</html>