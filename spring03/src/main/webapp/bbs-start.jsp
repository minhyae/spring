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
		$('.btn').click(function(){
			titleValue = $('.title').val()
			contentValue = $('.content').val()
			writerValue = $('.writer').val()
			
			
			if((titleValue.length >= 2)||(contentValue.length>=2)){
				location.href="bInsert.do?writer="+writerValue
						+"&content="+contentValue
						+"&title="+titleValue
			}else{
				alert('제목과 내용이 너무 짧습니다.2글자 이상 입력해 주세요.')
				}
	
		});
	});
</script>
</head>
<body>
제목<input type ="text" name ="title" class="title" ><br>
내용<input type ="text" name ="content" class="content" ><br>
작성자<input type ="text" name ="writer" class="writer" ><br>
<input type="button" value="작성 완료" class="btn">
</body>
</html>