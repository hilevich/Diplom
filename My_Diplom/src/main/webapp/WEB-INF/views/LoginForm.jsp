<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>FormLogin</title>
<link rel="stylesheet" type="text/css" href="C:/MyWorkspace/My_Diplom/src/main/webapp/WEB-INF/resources/reset.css">
<link rel="stylesheet" type="text/css" href="C:/MyWorkspace/My_Diplom/src/main/webapp/WEB-INF/resources/structure.css">
</head>
<body>

	
<form class="box login" action="login" method="post">
	<fieldset class="boxBody">


		<label>Username: </label> 
		<input type="text" name="username" placeholder="enter your username" required="required" /> 
			<label>Password:</label> 
			<input type="password" name="password" placeholder="enter your password" required="required" />
			
			</fieldset>
			
		<footer>
		<button type="submit" class="btnLogin">Login</button>
		</footer>
	</form>