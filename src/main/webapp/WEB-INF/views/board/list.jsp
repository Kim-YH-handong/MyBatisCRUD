<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.company.app.model.BoardVO" %>
<%@page import="java.util.List" %>
<jsp:useBean id="dao" class="com.company.app.repository.BoardDAO"></jsp:useBean>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>boardList</title>
</head>
<script>
	function delete_ok(id){
		var a = confirm("정말로 삭제하시겠습니까?");
		if(a) location.href='deleteok/' + id;
	}
</script>
<body>
	<table>
		<c:forEach items="${list}" var="u">
			<tr>
				<td>${u.getId()}</td>
				<td>${u.getTitle()}</td>
				<td>${u.getWriter()}</td>
				<td>${u.getContent()}</td>
				<td><a href="editform/${u.getId()}">글수정</a></td>
				<td><a href="javascript:delete_ok('${u.getId()}')">글삭제</a></td>
			</tr>
		</c:forEach>
	</table>
	<br/><button type="button" onclick="location.href='add'">새글쓰기</button>
</body>
</html>