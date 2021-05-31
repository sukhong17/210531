<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<aside>
	<br>
	<ul>
	 <c:if test="${!empty login}">
		<li><a href="#" class="tn">게시글 리스트</a></li>
		<li><a href="${pageContext.request.contextPath}/board/write.jsp" class="tn">게시글 쓰기</a></li>
		<li><a href="${pageContext.request.contextPath}/auth/logout" class="tn">로그아웃</a></li>
	 </c:if>
	 <c:if test="${empty login}">
		<li><a href="${pageContext.request.contextPath}/auth/register.jsp" class="tn">회원가입</a></li>
		<li><a href="${pageContext.request.contextPath}/auth/login.jsp" class="tn">로그인</a></li>
	 </c:if>
	</ul>
</aside>