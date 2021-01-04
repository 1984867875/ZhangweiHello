<%--
  Created by IntelliJ IDEA.
  User: 19848
  Date: 2021/1/1
  Time: 1:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload.jsp" method="post"></form>
     <input type="file" name="file" multiple>
     <input type="file" name="file" multiple>
     <input type="text" name="zw">
     <input type="submit" value="上传">
</body>
</html>
