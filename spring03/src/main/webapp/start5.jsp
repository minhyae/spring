<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<script type="text/javascript" src="resources/js/jquery-3.4.1.js"></script>
<script type="text/javascript">

	$(function() {
			correct ='apple'
			$('.ans').keyup(function() {
				answer = $('.ans').val()
				if(correct == answer){
					$('.a1').text('정답입니다.')
				}else{
					$('.a1').text('정답이 아닙니다.')
				}
			});
		});
		
	
</script>
</head>
<body>
오늘은 3일차 입니다.<br>
과일이름 입력: <input type="text" name="ans" class="ans"><br>
<div class="a1" style ="color: red"></div>
</body>
</html>