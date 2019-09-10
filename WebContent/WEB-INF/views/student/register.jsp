<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>대학접수</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
<h1>비트대학 접수</h1>
<form id=register_form action="<%=request.getContextPath()%>/student.do">
	이름<input type="text" name="name"/><br/>
	주민번호<input type="text" name="ssn"/><br/>
	국어<input type="text" name="kor"/><br/>
	영어<input type="text" name="eng"/><br/>
	수학<input type="text" name="math"/><br/>
	사회<input type="text" name="soc"/><br/>
	<input type="hidden" name="action" value="register"/>
	<input type="hidden" name="dest" value="login"/>
	<input type="submit" value="전송"/>
	
	
</form>
<script>
$('#register_form').submit(function(){
	alert('테스트 성공');
});
</script>
</body>
</html>