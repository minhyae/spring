<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	$(function() { //body먼저 인식하고, 자바 스크립트 실행
		//클릭이라는 이벤트 발생했을 때 처리해주는 함수 필요 -> 무명함수 작성
		$('.btn1').click(function() {
			console.log('이미지 추가버튼 클릭됨.')
			$('.d1').append('<img src=resources/img/goldenretriever.jpg width=230 height=300>')
		});
		$('.btn2').click(function() {
			console.log('텍스트 추가버튼 클릭됨.')
			$('.d1').append('<font color=palevioletred>귀여운~강아지~</font>')
		});
		
	});
	</script>
</head>
<body>
<img src="resources/img/001.png">
<input type ="button" class="btn1" value="이미지 추가">
<input type ="button" class="btn2" value="텍스트 추가"><br>
<img src="resources/img/goldenretriever.jpg">
<div class="d1"></div>
</body>
</html>