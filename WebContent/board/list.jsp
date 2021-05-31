<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/layout.css">
</head>
<body>
<%-- <c:if test="${login.id == null }">
	<script>
	alert('로그인해주세요');
		location.href= "${pageContext.request.contextPath}/auth/login.jsp"
	
	</script>

</c:if> --%>
	<%@ include file="/layout/header.jsp" %>
	<section>
	<%@ include file="/layout/aside.jsp" %>
	<article>
    	<div id="content">
                <br>
                <h1>리스트</h1>
                <table border="1">
	                <tr>
		                <th>번호</th>
		                <th>아이디</th>
		                <th>제목</th>
		                <th>시간</th>
	                </tr>
	                <c:forEach var="board" items="${list}">
	                <tr>
	        	        <td>${board.bno}</td>
	    	            <td><a href="${pageContext.request.contextPath}/board/read.do?bno=${board.bno}">${board.id}</a></td>
		                <td>${board.title}</td>
		                <td><fmt:formatDate value="${board.writeDate}" pattern="yyyy.MM.dd HH:mm" /></td>
	                </tr>
	                </c:forEach>
                </table>
        </div>
    </article>
	</section>

</body>
</html>