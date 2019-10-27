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
			
			$.ajax({
				url : "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Fwww.chosun.com%2Fsite%2Fdata%2Frss%2Fent.xml&api_key=86dpgv9zvkuzxullnygyhmtfejytcgffsnhxkrjv", 
				data : {
					url :"http://www.chosun.com/site/data/rss/ent.xml" ,
					api_key : "86dpgv9zvkuzxullnygyhmtfejytcgffsnhxkrjv",
					count: 20
				},
					success : function(result){
					alert("조선일보 사이트와 연결성공")
					alert(result)
				}
			});
		});
		
		
	});
	</script>
</head>
<body>

<input type ="button" class="btn1" value="신문기사 긁어오기">
<div class="d1"></div>
</body>
</html>