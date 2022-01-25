<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="addok" method="post">
	<table id="edit">
		<tr><td>Title</td><td><input type="text" name="title"/></td></tr>
		<tr><td>Writer</td><td><input type="text" name="writer"/></td></tr>
		<tr><td>Content</td><td><input type="text" name="content"/></td></tr>
	</table>
	<button type="button" onclick="location.href='list'">목록보기</button>
	<button type="submit">등록하기</button>
</form>

</body>
</html>