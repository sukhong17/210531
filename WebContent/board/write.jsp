<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/layout.css">
</head>
<body>
<c:if test="${login.id == null }">
	<script>
	alert('로그인해주세요');
		location.href= "${pageContext.request.contextPath}/auth/login.jsp"
	
	</script>

</c:if>
	<%@ include file="/layout/header.jsp" %>
	<section>
	<%@ include file="/layout/aside.jsp" %>
	<article>
    	<div id="content">
                <br>
                <h1>글쓰기</h1>
                <form action="./write.do" method="get">
                	아이디 : <input type="text" name="id" value="${login.id}" readonly> <br>
                	제목 : <input type="text" name="title"> <br> <br>
                	내용 : <br><textarea name="content" rows=15 cols=50></textarea> <br> <br>
                	<button type="submit">전송</button>
                
                
                </form>
        </div>
    </article>
	</section>
	
</body>
</html>