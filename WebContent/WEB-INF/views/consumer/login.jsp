<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div>
	<h2>로그인</h2>
	<form action="">
		아이디 <input type="text"/> <br/>
		비밀번호 <input type="text"/> <br/>
		<input type="hidden" name="action" value="login" />
		<input type="hidden" name="dest" value="login" />
		<input type="submit" id="test" value="전송" > 
	</form>
</div>
</body>
</html>