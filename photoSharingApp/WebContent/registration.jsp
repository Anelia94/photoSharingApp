<head>
<meta charset="ISO-8859-1">
<title>Register</title>
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
			<form action="Register" method="post">
				<h2>Sign Up</h2>
				<p>
					<input id="username" name="username" type="text"
						placeholder="Username" 
						pattern="[a-zA-Z0-9.-]{4,}"
						title="Must contain at least 4 or more chararacters"
						required>
				</p>
				<p>
					<input id="email" name="email" type="text" placeholder="Email" 
					pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$"
						title="Incorrect email" required>
				</p>
				<p>
					<input id="password" name="password" type="password"
						placeholder="Password"
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
						title="Must contain at least one number and one uppercase and lowercase letter,
						 and at least 8 or more characters"
						required>
				</p>
				<p>
					<input id="rePass" name="rePass" type="password"
						placeholder="Confirm Password" required>
				</p>
				<p>
					<input type="submit" value="Create My Account" id="submit">
				</p>
			</form>
			<br> Already user? <a href="login.jsp">Login</a>
		</fieldSet>
	</div>
</body>
</html>