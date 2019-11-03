<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--지시자 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body style="background: pink;">
	<h3>조회한 결과입니다.</h3>
	검색결과입니다.
	<hr color="red">
	<c:forEach var="result" items="${list2}">
		검색한 id: ${result.id }<br>
		검색한 pw: ${result.pw }<br>
		검색한 name: ${result.name }<br>
		검색한 tel: ${result.tel }<br>
		<hr color="lime">
	</c:forEach>

</body>
</html>