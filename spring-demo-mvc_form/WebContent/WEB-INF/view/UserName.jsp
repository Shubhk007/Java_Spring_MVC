<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Name</title>
</head>
<body>
<h2>User Name page!</h2>
<hr>
User Name is : ${param.UserName}
<hr>
<a href="${pageContext.request.contextPath}">Go to Homepage</a>
</body>
</html>