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
			$('.d1').append('')
		});
		
	});
	</script>
</head>
<body>
<input type="text" class="reply" name="reply">
<input type ="button" class="btn1" value="댓글달기">


<div class="d1"></div>
</body>
</html>