<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>리스트</title>
    <link rel="stylesheet" href="/res/css/common.css">
    <link rel="stylesheet" href="/res/css/boardList.css">
    <script defer src="/res/js/boardList.js"></script>
</head>
<body>

    <span>로그인 아이디 : ${sessionScope.loginUser.uid}</span>
    <span><a href="/user/profile">프로필</a></span>

    <table>
        <tr>
            <th>번호</th>
            <th>제목</th>
            <th>글쓴이</th>
            <th>작성일시</th>
        </tr>

        <c:forEach items="${requestScope.list}" var="i">
            <tr class="record" onclick="moveToDetail(${i.iboard})">
                <td>${i.iboard}</td>
                <td>
                    <c:choose>
                        <c:when test="${param.searchType eq 1 || param.searchType eq 2}">
                            ${i.title.replace(param.searchText, '<mark>' += param.searchText += '</mark>')}
                        </c:when>
                        <c:otherwise>
                            ${i.title}
                        </c:otherwise>
                    </c:choose>
                </td>

                <c:choose>
                    <%-- if 프로필 이미지가 없으면 기본 이미지 --%>
                    <c:when test="${empty i.profileImg}">
                        <c:set var="img" value="/res/img/noProfileImg.png"></c:set>
                    </c:when>

                    <%-- else 프로필 이미지가 있으면 해당 이미지 --%>
                    <c:otherwise>
                        <c:set var="img" value="/img/${i.iuser}/${i.profileImg}"/>
                    </c:otherwise>
                </c:choose>

                <td>
                    <c:choose>
                        <c:when test="${param.searchType eq 4}">
                            ${i.writerNm.replace(param.searchText, '<mark>' += param.searchText += '</mark>')}
                        </c:when>
                        <c:otherwise>
                            ${i.writerNm}
                            <img src="${img}" class="profileImg">
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>${i.regdt}</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
