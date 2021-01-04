<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body bgcolor="orange">
<p>当前用户${user.uname},角色:<c:forEach items="${user.roles}" var="role">${role.rname},</c:forEach>

</p>
</body>
</html>