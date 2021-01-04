<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/SSM001/res/bootstrap.min.css" style="text/css">
<script src="/SSM001/res/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("button").click(function(){
		$.ajax({
			type:"post",
			url:"/SSM001/add.do",
			data:{
				rname:$("#rname").val()			
			},dataType:"json",
			success:function(data){
				if(data.mess=="success"){
				location="/SSM001/selectRole.do"
			}else{
				alert(msg);
			}
			}
		})
	})
})


</script>
</head>
<body>
<form action="${pageContext.request.contextPath}/res/save.do" method="post" enctype="multipart/form-data">
  <div class="form-group">
    <label for="resname">资源名称</label>
    <input type="text"  name="rename" class="form-control" id="resname" placeholder="角色名称">
  </div>
  <label for="url">资源名称</label>
  <input type="text"  name="url" class="form-control" id="url" placeholder="角色名称">
  </div>
  <label for="logo">资源名称</label>
  <input type="text"  name="logo" class="form-control" id="logo" placeholder="角色名称">
  </div>
     
  <button type="submit" class="btn btn-default">Submit</button>
</form>
</body>
</html>