<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/SSM001/res/bootstrap.min.css" style="text/css">
<script src="/SSM001/res/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
     function del(rid){
    	 if(confirm("删除?")){
    		 $.ajax({
    			 type:"post",
    			 url:"/SSM001/delete.do",
    			 dataType:"json",
    			 data:{
    			     rid: rid
    				 
    			 },success:function(data){
    				 if(data.mess=="success"){
    					location.reload();
    				 }else{
    					 alert("系统错误");
    				 }
    				 
    			 },error:function(){
    				 alert("异常")
    			 }
     
    		 })
    		 }	 
}
     //绑定角色
     function bandRole(uid){
    	 location="/SSM001/roleView.do?uid="+uid;
     }
</script>
</head>
<body>
<table class="table table-bordered">
<tr>
  <th>序号</th>
  <th>角色</th>
  <th>操作</th>
</tr>

<c:forEach items="${list}" var="r" varStatus="vas">
<tr><td>${vas.count}</td>
    <td>${r.rname}</td>
    
    <td>
    <a href="javascript:;" onclick="del(${r.rid})" class="btn btn-info">删除</a>
    <a href="javascript:;" onclick="del(${r.rid})" class="btn btn-info">编辑</a>
    <a href="javascript:;" onclick="selectRes(${r.rid})" class="btn btn-info">查看资源</a>
    </td>
</tr>

</c:forEach>
</table>
</body>
</html>