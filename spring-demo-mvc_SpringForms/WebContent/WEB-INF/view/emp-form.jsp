<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Form</title>
</head>
<body>
<form:form action="sendData" modelAttribute="emp">
<hr>
firstName :<form:input type="text" path="firstName"/>
<hr>
lastName :<form:input type="text" path="lastName"/>
<hr>
<input type="submit" value="submit">
<hr>

</form:form>
</body>
</html>