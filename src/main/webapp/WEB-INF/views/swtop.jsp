<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>SwarHome</title>
<style type="text/css">
div.blockb {
	float: left;
	width: 20%;
}
</style>
</head>
<body>
	<div class="blocka">
		とけびのサマナーズウォールーンツール<BR>
		　<a href="monsterlist">モンスターリスト</a>
	</div>
	<div class="blockb">
		<ul data-role="listview">
			<c:forEach var="record" items="${list}">
				<a href="."><c:out value="${record.getName()}" /></a><BR>
			</c:forEach>
		</ul>
	</div>
	<div class="blockc">コンテンツC</div>


</body>
</html>
