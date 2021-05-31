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
                <h1>글쓰기</h1>
                <form action="" method="get" id="pmp">
                	아이디 : <input type="text" name="id" value="${read.id}" disabled> <br>
                	제목 : <input type="text" name="title" value="${read.title}" disabled>  <br> <br>
                	내용 : <br><textarea name="content" rows=15 cols=50 disabled>${read.content}</textarea> <br> <br>
                	<input type="hidden" value="${read.bno }" >
                	<button type="button" onclick="boardList()">목록</button>
                	<button type="button" onclick="boardSubmit()">전송</button>
                	<button type="button" onclick="boardDelete()">삭제</button>
		
		                
                
                </form>
        </div>
    </article>
	</section>
	<script>
	var pmp = document.getElementById('pmp');
	function boardList(){
		history.back();
	//	location.href="${pageContext.request.contextPath}/board/list.do";
	}
	function boardDelete() {
		
	}
	</script>
</body>
</html>