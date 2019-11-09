<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link href="resources/css/project.css" type="text/css" rel="stylesheet">
</head>
<body>

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
		<form action="insert">
			<table>
				<tr>
					<td>아이디 :</td>
					<td><input type="text" name="id"></td>
				</tr>
			</table>
			<table>
				<tr>
					<td> 패스워드 :</td>
					<td><input type="text" name="pw"></td>
				</tr>
			</table>
			<table>
				<tr>
					<td> 이름 :</td>
					<td><input type="text" name="name"></td>
				</tr>
			</table>
			<table>
				<tr>
					<td>전화 :</td>
					<td><input type="text" name="tel"></td>
				</tr>
				<tr>
				<td colspan="2"><button type="submit">회원가입 처리</button></td>
				</tr>
			</table>
	
		</form>
	</div>
	</div>
</body>
</html>