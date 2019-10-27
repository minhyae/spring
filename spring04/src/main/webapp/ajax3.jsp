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
			//버튼을 클릭하면, 입력한 값을 가지고 온다.
			reValue = $('.reply').val()
			wriValue = $('.writer').val()
			$.ajax({
				url : "server.do", 
				data : {
					reply : reValue,
					writer : wriValue
				},
				success : function(result){
					alert("서버로 통신 성공")
					$('.d1').append('<img src=resources/img/goldenretriever.jpg width=230 height=300>')
					$('.d1').append(result)
				}
			});
		});
		
		
	});
	</script>
</head>
<body>
작성자<input type="text" class="writer" name="writer">
댓글 내용<input type="text" class="reply" name="reply">
<input type ="button" class="btn1" value="댓글달기">

<div class="d1"></div>
</body>
</html>