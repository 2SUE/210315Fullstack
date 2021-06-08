<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>프로필</title>
</head>
<body>
    <div>
        <c:choose>
            <%-- if 프로필 이미지가 없으면 기본 이미지 --%>
            <c:when test="${empty sessionScope.loginUser.profileImg}">
                <c:set var="img" value="/res/img/noProfileImg.png"></c:set> <!-- pageContext에 담아쥼 -->
            </c:when>

            <%-- else 프로필 이미지가 있으면 해당 이미지 --%>
            <c:otherwise>
                <c:set var="img" value="/img/${sessionScope.loginUser.iuser}/${sessionScope.loginUser.profileImg}"/>
            </c:otherwise>
        </c:choose>
    </div>

    <div>
        <!-- 무조건 post 방식 -->
        <!-- enctype="multipart/form-data" : 파일이나 이미지를 서버로 전송 -->
        <!-- 이미지를 업로드 하면 톰캣 서버로 넘어감! 이클립스에서 안 뜬다~~ -->
        <!-- 내 파일 주소 : C:\study\210315Fullstack\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\BoardVer7\res\img -->
        <!-- cos.jar 라이브러리를 이용해서 파일 업로드 -->
        <form id="frm" action="profile" method="post" enctype="multipart/form-data" onsubmit="return imgChk();">
            <!-- 이미지 파일만 업로드 가능 -->
            이미지 변경 : <input type="file" accept="image/*" name="profileImg">
            <input type="submit" value="이미지 업로드">
        </form>
    </div>

    <div>
        <div><img src="${img}"></div>
        <div>pk : ${sessionScope.loginUser.iuser}</div>
        <div>ID : ${sessionScope.loginUser.uid}</div>
        <div>name : ${sessionScope.loginUser.unm}</div>
    </div>
</body>
</html>
