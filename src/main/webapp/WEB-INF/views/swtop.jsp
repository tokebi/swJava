<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>SwarHome</title>
</head>
<body>

	<ul data-role="listview">
		<li data-role="list-divider">テスト</li>
		<c:forEach var="record" items="${list}">
			<li><c:out value="${record.getName()}" /></li>
		</c:forEach>
	</ul>

</body>
</html>
