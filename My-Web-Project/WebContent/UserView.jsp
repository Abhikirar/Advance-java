<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="Header.jsp"%>
	<div align="center">
		<form action="UserCtl" method="post">
			<h1>Add User</h1>
			<table>
				<tr>
					<th>First Name</th>
					<td><input type="text" name="firstName" value=""
						placeholder="enter first name"></td>
				</tr>

				<tr>
					<th>lastName</th>
					<td><input type="text" name="lastName" value=""
						placeholder="enter last Name"></td>
				</tr>
				<tr>
					<th>login</th>
					<td><input type="email" name="login" value=""
						placeholder="enter  your email"></td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" name="password" value=""
						placeholder="enter your password"></td>
				</tr>
				<tr>
					<th>dob</th>
					<td><input type="date" name="dob" value=""></td>
				</tr>
				</tr>

				<th></th>
				<td><input type="Submit" name="operation" value="Save"></td>
				</tr>



			</table>

		</form>
	</div>
	<%@ include file="Footer.jsp"%>


</body>
</html>