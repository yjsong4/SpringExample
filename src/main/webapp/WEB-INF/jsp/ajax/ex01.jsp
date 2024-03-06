<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJAX 예제</title>
</head>
<body>

	<h2>AJAX 예제</h2>
	
	<button type="button" id="requestBtn">요청</button>
	
	<div id="nameDiv"></div>
	<div id="ageDiv"></div>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	<script>
		$(document).ready(function() {
			
			$("#requestBtn").on("click", function() {

				// /ajax/person 페이지 요청
				$.ajax({
					type:"get"
					, url:"/ajax/person"
					, data:{"name":"송여진", "birthday":"20101010"}
					, success:function(data) {
						
						// {"name":"송여진", "age":10}
						// alert("나이 : " + date.age);
						$("#nameDiv").text(data.name);
						$("#ageDiv").text(data.age);
					}
					, error:function() {
						alert("에러발생");
					}
				});		
			});	
		});
			
	</script>
</body>
</html>