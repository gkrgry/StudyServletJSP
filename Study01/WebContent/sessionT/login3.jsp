<% request.setCharacterEncoding("utf-8"); %>
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
		String mName;
		String mNickname;
	%>
	
	<%
		mName = request.getParameter("mID");
		mNickname = request.getParameter("mPW");
	%>
		이름은 : 	<%= mName %>
	
	</form>
</body>
</html>