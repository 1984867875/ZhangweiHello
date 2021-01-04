<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<c:forEach items="${user.roles}" var="role">
    <c:forEach items="${role.resources}" var="res">
<a href="/SSM001${res.url}" target="center">${res.rename}</a><br/>

</c:forEach>

</c:forEach>
</body>
</html>