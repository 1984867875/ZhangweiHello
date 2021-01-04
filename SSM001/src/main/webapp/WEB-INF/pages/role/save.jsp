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
<form>
  <div class="form-group">
    <label for="rolename">角色名称</label>
    <input type="text" class="form-control" id="rname" placeholder="角色名称">
  </div>
  
     
  <button type="button" class="btn btn-default">Submit</button>
</form>
</body>
</html>