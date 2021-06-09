<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div>${requestScope.errMsg}</div>
<form action="login" method="post">
    <div>
        <label> ID : <input type="text" name="uid" value="sue"></label>
    </div>
    <div>
        <label> PW : <input type="password" name="upw" value="1"></label>
    </div>
    <div>
        <input type="submit" value="로그인">
    </div>
</form>
