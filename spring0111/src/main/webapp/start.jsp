<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	스프링 프로젝트
	<br>
	<!-- a태그로 연결된 페이지는 클라이언트가 요청하게 하는것. => click을 통해! -->
	<!-- 클라이언트가 요청한 서버쪽에 있는 페이지는 브라우저에 꼭 표시가 된다. -->
	<!-- 클라이언트가 요청한 페이지는 반드시 spring의 webapp밑에 있어야 한다. -->

	<a href="food.jsp">내가 좋아하는 음식 페이지</a>
	<br>
	<a href="hobby.jsp">내가 좋아하는 취미 페이지</a>
	<br>
	<hr color="red">

	<form action="check.jsp">
		아이디 <input type="text" name="id"><br>
		 비밀번호 <input type="password" name="password">
		<input type="submit" value="서버로 전송">
	</form>

</body>
</html>