<%@page import="java.util.List"%>
<%@page import="com.kgitbank.mvc04.BbsDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div><jsp:include page="top2.jsp"></jsp:include></div>

	<div id="total">
		<!-- 탑 메뉴 들어가는 부분 -->
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<!-- 장바구니 고정시킬 곳  -->
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>

		<div id="content">
			<h3>제품목록 전체 출력</h3>
			<table border="1" bordercolor="red">
				<tr>
					<th>아이디</th>
					<th>제목</th>
					<th>내용</th>
					<th>가격</th>
					<th>대표이미지</th>
				</tr>
				<c:forEach var="dto" items="${list }">
					<tr align="center">
						<td>${dto.id}</td>
						<td><a href="select2?id=${dto.id}">${dto.title}</a></td>
						<td>${dto.content}</td>
						<td>${dto.price}</td>
						<td><img width="200" src=resources/img/${dto.img}></td>
					</tr>
				</c:forEach>
			</table>

		</div>
		<hr color="lime">
		
		<div id="result">
			<c:forEach var="dto2" items="${list }">
		- ${dto.content }, ${dto.writer } <br>
			</c:forEach>

		</div>
	</div>

</body>
</html>