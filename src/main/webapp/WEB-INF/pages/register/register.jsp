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
            background-image: url(images/background.png);
            background-repeat: repeat-x;
        }
        -->
    </style>
    <link  rel="stylesheet" type="text/css" href="register/css/style.css"/>

    <link rel="stylesheet" href="common/css/bootstrap.min.css">

</head>
<body>
<table width="1920" border="0" cellpadding="10" class="titlelogo">
    <tr>
        <td><div align="center"><img src="common/images/logo_login.png" width="482" height="89" alt="img" /></div></td>
    </tr>
</table>
<div align="center" class="head_title">新用户注册</div>

<table width="350" height="290" align="center" cellspacing="0" class="LoginTable">
    <tr>
        <td height="230">
            <form id="loginform" name="loginform" method="post" action="registerSubmitAction" onSubmit="return sendlogin()"/>
            <p>用&nbsp户&nbsp名:
                &nbsp<input type="text" id="username" name="username" class="textview1"/>
            </p>
            <p>密&nbsp&nbsp&nbsp&nbsp&nbsp码:
                &nbsp&nbsp<input type="password" id="password" name="password" class="textview1" />
            </p>
            <p>确认密码:&nbsp<input type="password" id="confirm" name="password" class="textview1" />
            </p>
            <table width="320" border="0">
                <tr>
                    <td width="239"><span id="tips" class="tips"></span>
                    <td width="65"><input name="login" class="btn btn-default" type="submit" width="80" height="40" onSubmit="return sendlogin()" value="注册"/></td>
                    <%--<input name="login" type="image" src="./images/login.png" width="80" height="40" onSubmit="return sendlogin()"/>--%>
                </tr>
            </table>
            </form>
        </td>
    </tr>
</table>

<script src="common/js/jquery-ui.js"></script>
<script src="common/js/jquery-2.1.1.min.js"></script>
<script src="common/js/bootstrap.min.js"></script>
<script>
    function sendlogin() {
//        alert($('#username').val());
        if ($('#username').val() == "" || $('#username') == null) {
            $('#tips').css('color', 'red');

            $('#tips').html("用户名不可为空！");
//            $('#username').val("用户名不可为空");
            return false;
        }
        else if ($('#password').val() == "" || $('#password') == null) {
            $('#tips').css('color', 'red');
            $('#tips').html("密码不可为空！");
            return false;
        }
        else if ($('#password').val() != $('#confirm').val()) {
            $('#tips').css('color', 'red');
            $('#tips').html("两次密码不一致！");
            return false;
        }
        else{
            $('#tips').css('color', 'black');

            $('#tips').html("正在注册...");
            return true;;
        }
    }
</script>
</body>
</html>
