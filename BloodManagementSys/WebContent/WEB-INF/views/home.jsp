<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
</head>
<body>
<h1>Welcome to HomePage</h1>

<h3>Donate/request</h3>
<form action="${pageContext.request.contextPath}/req" method="post">
    Request<select name="reqType">
    <option value="donate" >Donor</option>
     <option value="requestor" >Requestor</option>
     </select>
     <button input type="submit">Submit</button>
</form>
</body>
</html>