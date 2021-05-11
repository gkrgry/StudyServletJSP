<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies){
			out.print("name : " + c.getName() + "<br>");
			out.print("Value : " + c.getValue() + "<br>");
			out.print("---------------------------------");
		}
	%>
	<form action="logout"><input type="submit" value="로그아웃"></form>
	


</body>
</html>