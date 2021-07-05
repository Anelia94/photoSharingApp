<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Upload Image</title>
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
	<div align="center">
		<h2>Upload Image:</h2>
			<form action="AddImage" method="post" enctype="multipart/form-data">
				Title: <input type="text" name="text"><br> Select
				Image: <input type="file" name="image"><br> <input
					type="submit" value="Upload">
			</form>
			</div>
		</fieldSet>
</body>

</html>