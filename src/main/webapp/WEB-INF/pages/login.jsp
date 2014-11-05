<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户注册</title>

    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <style type="text/css">
        <!--
        body {
            background-image: url(./images/background.png);
            background-repeat: repeat-x;
        }
        -->
    </style>
    <link href="./css/style.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="js/jquery-ui.js"></script>
    <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>

</head>
<body>
<table width="1920" border="0" cellpadding="10" class="titlelogo">
    <tr>
        <td><div align="center"><img src="images/logo_login.png" width="482" height="89" alt="img" /></div></td>
    </tr>
</table>
<table width="320" height="283" align="center" cellspacing="0" class="LoginTable">
    <tr>
        <td height="230">
            <form id="loginform" name="loginform" method="post" action="login.do">
                <p>用户名</p>
            <p>
                <input type="text" id="username" name="username" class="textview1"/>
            </p>
            <p>密码</p>
            <p>
                <input type="password" id="password" name="password" class="textview1" />
            </p>
                <table width="320" border="0">
                    <tr>
                        <td width="239"><span id="tips" class="tips"></span>
                            <input name="login" type="submit" value = "提交" width="60" height="30"/></td>
                        <td width="65"><input name="login" type="image" src="./images/login.png" width="60" height="30" onclick="javascript:sendlogin()"/></td>
                    </tr>
                </table>
            </form>
        </td>
    </tr>
</table>
<table width="320" height="30" border="0" align="center" cellspacing="0" class="OperationTable">
    <tr>
        <td><a href="http://www.iaxure.com/wp-login.php?action=register" class="textview2">注册</a> | <span class="textview2">忘记密码？</span></td>
    </tr>
</table>

<script>
    function sendlogin() {
        alert($("#username").val());
        if ($("#username").length < 1) {
            $("#tips").css('color', 'red');
            $("#tips").val("用户名不可为空");
        }
        else if ($("#password").length < 1) {
            $("#tips").css('color', 'red');
            $("#tips").val("密码不可为空");
        }
        else{
            $("#tips").val("正在登录...");
        }
    }
</script>



</body>
</html>