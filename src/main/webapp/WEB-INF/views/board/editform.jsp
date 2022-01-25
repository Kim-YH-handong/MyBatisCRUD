<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="com.company.app.model.BoardVO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	BoardVO vo = (BoardVO)request.getAttribute("boardVO");
%>
<body>
	<form method="post" action="../editok">
		<input type="hidden" name="id" value = "<%=vo.getId()%>"/>
		<table id="edit">
			<tr>
				<td>Title</td>
				<td><input type="text" name="title" value = "<%=vo.getTitle()%>"/></td>
			</tr>
			<tr>
				<td>Writer</td>
				<td><input type="text" name="writer" value = "<%=vo.getWriter()%>" /></td>
			</tr>
			<tr>
				<td>Content</td>
				<td><input type="text" name="content" value = "<%=vo.getContent()%>"/></td>
			</tr>
		</table>
		<button type="button" onclick="history.back()">취소하기</button>
		<button type="submit">수정하기</button>
	</form>
</body>
</html>