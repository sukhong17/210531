<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="./login.do" method="post">
	${msg}<br>
		id : <input type="text" name="id">
		password : <input type="password" name="password">
		<input type="submit" value="전송">
	
	</form>

</body>
</html>