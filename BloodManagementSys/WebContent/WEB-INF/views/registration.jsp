<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/process" method="post">
firstName<input type="text" name="firstname"><br>
lastName<input type="text" name="lastname"><br>
password<input type="text" name="pwd"><br>
city<input type="text" name="city"><br>
bloodGroup<input type="text" name="bloodgroup"><br>
<button type="submit">Submit</button>
</form>
The generated id is ${generatedId}
</body>
</html>