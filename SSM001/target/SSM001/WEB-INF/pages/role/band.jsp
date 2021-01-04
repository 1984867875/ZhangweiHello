<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/SSM001/res/bootstrap.min.css" style="text/css">
</head>
<body>
<form action="/SSM001/saveRole.do" method="post">
<c:forEach items="${list}" var="r">
 
<label class="checkbox-inline">
    <input type="checkbox" name="rids" id="inlineCheckbox1" <c:if test="${fn:contains(myrole,r.rid)}">checked</c:if> value="${r.rid}"> ${r.rname}
</label>
</c:forEach>
<br/>
<input type="submit" value="确认" class="btn btn-success">
<input type="hidden" value="${uid}" name="uid">
</form>
</body>
</html>