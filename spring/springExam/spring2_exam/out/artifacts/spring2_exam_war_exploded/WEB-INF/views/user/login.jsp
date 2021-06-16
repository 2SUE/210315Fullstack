<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>login</title>
</head>
<body>
    <h1>${requestScope.errMsg}</h1>

  <form method="post">
    <div><label>아이디 : <input type="text" name="uid"></label></div>
    <div><label>비밀번호 : <input type="password" name="upw"></label></div>
    <input type="submit" value="등록">
  </form>

</body>
</html>
