<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/css/layout.css">
    <title>Document</title>
</head>
<body>
<%@ include file="/layout/header.jsp" %>
    <section>
        <%@ include file="/layout/aside.jsp" %>
        <article>
            <div id="content">
                <br>
                <c:if test="${!empty login}">
  	              <div>
    	                <h1>${login.id}환영합니다.</h1>
        	            <a href="${pageContext.request.contextPath}/board/write.jsp" class="tn">게시글쓰기</a> &nbsp;&nbsp;
            	        <a href="#" class="tn">게시글리스트</a> &nbsp;&nbsp;
                	    <a href="${pageContext.request.contextPath}/auth/logout" class="tn">로그아웃</a> 
                	</div>
                </c:if>
                <c:if test="${login == null }">
                	<div>
	                    <a href="${pageContext.request.contextPath}/auth/register.jsp" class="tn">회원가입</a> &nbsp;&nbsp;
	                    <a href="${pageContext.request.contextPath}/auth/login.jsp" class="tn">로그인</a>
	                </div>
                </c:if>
            </div>
        </article>
    </section>
    <%@ include file="/layout/footer.jsp" %>
</body>
</html>