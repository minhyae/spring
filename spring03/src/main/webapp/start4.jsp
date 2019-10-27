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
		$('.id').keyup(function() {
			idValue = $('.id').val()
			
			if(idValue.length >= 5){
				$('.d1').text('입력한 id글자가 적당합니다.')
			}else{
				$('.d1').text('입력한 id가 너무 짧습니다. 5글자 이상 입력해 주세요.')
			}//else end
			
		});//keyup end
		
	});//$end
	
</script>
</head>
<body>
오늘은 3일차 입니다.<br>
아이디 입력: <input type="text" name="id" class="id"><br>
<div class ="d1" style= "color: red "></div><br>

</body>
</html>