<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 입력</title>
</head>
<body>

	<h2>사용자 추가</h2>
	
	<label>이름 : </label> <input type="text" id="nameInput"> <br>
	<label>생년월일 : </label> <input type="text" id="birthdayInput"> <br>
	<label>이메일 : </label> <input type="text" id="emailInput"> <br>
	<label>자기소개</label> <br>
	<textarea cols="40" rows="7" name="introduce" id="introduceInput"></textarea> <br>
	<button type="button" id="addBtn">추가</button>
	
	<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
	
	<script>
		$(document).ready(function() {
			// 추가 버튼을 클릭하면
			
			$("#addBtn").on("click", function() {
				// 사용자가 입력한 내용을 얻어 오고
				let name = $("#nameInput").val();
				let birthday = $("#birthdayInput").val();
				let email = $("#emailInput").val();
				let introduce = $("#introduceInput").val();
				
				// ajax를 통해서 사용자 추가 API를 요청한다.
				$.ajax({
					type:"get"
					, url:"ajax/user/create"
					, data:{"name":name, "birthday":birthday, "email":email, "introduce":introduce}
					, success:function(data) {
						// 응답으로 전달된 값을 통해 다음 과정을 처리한다.
						// 성공시 : {"result":"success"}
						// 실패시 : {"result":"fail"}
						if(data.result == "success") {
							// 성공
							// 리스트 페이지로 이동
							location.href = "ajax/user/list";
						} else {
							// 실패
							alert("추가 실패");
						}
					}
					, error:function() {
						alert("추가 에러");
					}
				});
			});
		});
	
	</script>
</body>
</html>