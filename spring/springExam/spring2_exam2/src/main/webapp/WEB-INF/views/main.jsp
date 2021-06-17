<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>안녕</title>
    <meta charset="UTF-8">
</head>
<body>
    <div>
        <form action="/result" method="post">
            <div>
                연도 :
                <select name="deal_year">
                    <c:forEach begin="2000" end="2020" var="year">
                        <option value="${year}">${year}년</option>
                    </c:forEach>
                </select>

                월 :
                <select name="deal_month">
                    <c:forEach begin="1" end="12" var="mon">
                        <option value="${mon}">${mon}월</option>
                    </c:forEach>
                </select>

<<<<<<< HEAD
                일 :
                <select name="deal_day">
                    <c:forEach begin="1" end="31" var="day">
                        <option value="${day}">${day}일</option>
                    </c:forEach>
                </select>

=======
>>>>>>> 44930beee6abc414103c4e0ded1bf9bde9b4a88e
                지역 : 대구시
                <select name="external_cd">
                    <c:forEach items="${requestScope.locationList}" var="item">
                        <option value="${item.external_cd}">${item.local_nm}</option>
                    </c:forEach>
                </select>
                <input type="submit" value="검색">
            </div>
        </form>
    </div>
</body>
</html>