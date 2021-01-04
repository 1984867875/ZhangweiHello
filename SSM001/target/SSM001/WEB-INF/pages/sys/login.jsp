<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<script src="/SSM001/res/jquery-3.5.1.min.js">
</script>
<script>
 $(function(){
	 $("#btn").click(function(){
		 $.ajax({
			 type:"post",
			 url:"/SSM001/login.do",
			 dataType:"json",
			 data:{
				 uname:$("#uname").val(),
				 pwd:$("#pwd").val()
				 
			 },success:function(data){
				 if(data.mess=="success"){
					 location="/SSM001/view/main.jsp"
				 }else{
					 alert("错误");
				 }
				 
			 },error:function(){
				 alert("异常")
			 }
			 
			 
			 
			 
		 })
		 
		 
		 
		 
	 })
	  
	 
	 
	 
 })
</script>


</head>
<body>
   用户名： <input id="uname" type="text" >
    密码： <input id="pwd"  type="text"> 
    <input type="button" id="btn">
</body>
</html>