<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Catalog</title>
</head>
<body>
	<div align="center">
		<nav id="nav">
			<div align="left">
				<span><a href='catalog.jsp'>Catalog</a></span>
				<span><a href='myProfile.jsp'>My Profile</a></span>
			</div>
			<div align="right">
				<span><a href='./LogOutServlet'>LogOut</a></span>
			</div>
		</nav>
		</div>
		<fieldSet>
		<div align="center">
		<form action= "DisplayAllImages" method="get">
		
				<input	type="submit" value="View images">
		
		
		</form>
			</div>
		</fieldSet>
</body>
</html>