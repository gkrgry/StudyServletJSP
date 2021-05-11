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
		if(session.getAttribute("MemberId") != null){
			response.sendRedirect("loginOk.jsp");
		}
	%>


	<form action="login3.jsp" method="post">
	id : <input type="text" name="mID"><br>
	pw : <input type="text" name="mPW"><br>
	<input type="submit" value="로그인">
	</form>
</body>
</html>