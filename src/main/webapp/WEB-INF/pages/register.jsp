<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户注册</title>
</head>
<body>
<form method="post" action="user.do">
    用户名：<input type="text" name="username">
    密码：<input type="password" name="password">
    确认密码：<input type="password" name="confirm">
    <input type="hidden" name="method" value="reg4">
    <input type="submit" value="注册">
</form>

<form method="post" action="login.do">已有账户??
    用户名：<input type="text" name="username">
    密码：<input type="password" name="password">
    <input type="submit" value="登录">
</form>

</body>
</html>