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
	width: 100%;
}

/*スクロール用*/
thead.scrollHead, tbody.scrollBody {
	display: block;
}

tbody.scrollBody {
	overflow-y: scroll;
	height: 2000px;
}

/*幅調整*/
td, th {
	table-layout: fixed;
}

.name {		width: 200px;}
.kname {	width: 200px;}
.hp {		width: 50px;}
.atk {		width: 50px;}
.def {		width: 50px;}
.spd {		width: 50px;}
.criticalRate {		width: 50px;}
.criticalDamage {	width: 50px;}
.resist {	width: 50px;}
.accuracy {	width: 50px;}
</style>
</head>
<body>
	<div class="blocka">
		とけびのサマナーズウォールーンツール<BR> <a href=".">トップ</a>
	</div>
	<div class="blockb">
		<table>
			<thead class="scrollHead">
				<tr>
					<th class="name">名前</th>
					<th class="hp">体力</th>
					<th class="atk">攻撃力</th>
					<th class="def">防御力</th>
					<th class="spd">攻撃速度</th>
					<th class="criticalRate">クリ率</th>
					<th class="criticalDamage">クリダメ</th>
					<th class="resist">効果抵抗</th>
					<th class="accuracy">効果的中</th>
				</tr>
			</thead>
			<tbody class="scrollBody">
				<c:forEach var="record" items="${list}">
					<tr>
						<td class="name">${record.getJname()}(${record.getKname()})</td>
						<td class="hp">${record.getHp()}</td>
						<td class="atk">${record.getAtk()}</td>
						<td class="def">${record.getDef()}</td>
						<td class="spd">${record.getSpd()}</td>
						<td class="criticalRate">${record.getCriticalRate()}</td>
						<td class="criticalDamage">${record.getCriticalDamage()}</td>
						<td class="resist">${record.getResist()}</td>
						<td class="accuracy">${record.getAccuracy()}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
