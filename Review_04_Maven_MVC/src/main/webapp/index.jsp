<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> 학점 계산기 </h1>

	<form action="avg.do" method="post">
	
		이름 : <input type="text" name="name" required="required"/><br />
		국어 : <input type="text" name="kor" /><br />
		영어 : <input type="text" name="eng" /><br />
		수학 : <input type="text" name="math" /><br />
		<input type="submit" value="학점 계산하기" />
	</form>
</body>
</html>