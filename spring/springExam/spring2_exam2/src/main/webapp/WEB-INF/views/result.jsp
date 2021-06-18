<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>result</title>
    <style>
        table, th, td { border: 1px solid black; border-collapse: collapse; }
        th { background: darkgray; }
    </style>
</head>
<body>
<table>
    <tr>
        <th>법정동</th>
        <th>지번</th>
        <th>아파트명</th>
        <th>거래금액</th>
        <th>건축년도</th>
        <th>계약년도</th>
        <th>계약월</th>
        <th>계약일</th>
        <th>전용면적</th>
        <th>층</th>
    </tr>
    <c:forEach items="${requestScope.resultList}" var="list">
        <tr>
            <td>${list.dong}</td>
            <td>${list.jibun}</td>
            <td>${list.apartment_name}</td>
            <td>${list.deal_amount}</td>
            <td>${list.build_year}</td>
            <td>${list.deal_year}</td>
            <td>${list.deal_month}</td>
            <td>${list.deal_day}</td>
            <td>${list.area_for_exclusive_use}</td>
            <td>${list.flr}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
