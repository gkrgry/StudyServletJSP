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
		System.out.print("cookies : " + cookies);
		
		if(cookies != null){
			for(Cookie c : cookies){
				if(c.getName().equals("memberId")){
					response.sendRedirect("loginOk.jsp");
				}
			}
		}
	%>

<form action="loginCon" method="post">
	ID : <input type="text" name="id"><br>
	PW : <input type="password" name="pw"><br>
	<input type="submit" value="로그인">
</form>


</body>
</html>