<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="resources/css/out.css">
<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">
	//jquery를 이용할 거야.
	//body부분을 먼저 읽고 자바 스크립트를 실행시켜주세요! function실행
	$(function() {
		//input에 입력한 것 가지고 오세요
		//var inputValue = $('input').val() //type선언이 없다. 
		//alert('입력된 값은'+inputVal)
		var idValue = $('#id').val() //id로 받는 경우 #id이름
		alert('입력되어 있는 id는 '+ idValue)
		
		var pwValue  = $('#pw').val()
		alert('입력되어 있는 pw는 '+ pwValue)
		
		//클래스는 .을 사용한다.
		//var ClassValue = $('.in')
	});
	
</script>
</head>
<body>
오늘은 3일차 입니다.<br>
아이디 입력: <input type="text" name="id" value="root" id="id" class="in"><br>
패스워드 입력: <input type="text" name="pw" value="1234" id="pw" class="in">
</body>
</html>