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
            /*background-image: url(./images/background.png);*/
            /*background-repeat: repeat-x;*/
        }
        -->
    </style>
    <link href="./css/style.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="js/jquery-ui.js"></script>
    <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="js/AjaxUtil.js"></script>

</head>
<body>
<table width="1920" border="0" cellpadding="10" class="titlelogo">
    <tr>
        <td><div align="center"><img src="images/logo_login.png" width="482" height="89" alt="img" /></div></td>
    </tr>
</table>
<div align="center" class="head_title">新用户注册</div>
<table width="350" height="290" align="center" cellspacing="0" class="LoginTable">
    <tr>
        <td height="230">
            <form id="loginform" name="loginform" method="post" action="login.do"/>
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
                        <td width="65"><input name="login" type="image" src="./images/login.png" width="80" height="40" onSubmit="return sendlogin()"/></td>
                    </tr>
                </table>
            </form>
            <input name="userlogin" id="userlogin"value="login" type="button" width="80" height="40" onclick="sendAjaxLogin('usercheck')"/>
        </td>
    </tr>
</table>
<table width="320" height="30" border="0" align="center" cellspacing="0" class="OperationTable">
    <tr>
        <td><a href="login.html" class="textview2">登录</a> | <span class="textview2">忘记密码？</span></td>
    </tr>
</table>

<script>
    function sendlogin() {
//        alert($('#username').val());
        if ($('#username').val() == "" || $('#username') == null) {
            $('#tips').css('color', 'red');
            $('#tips').html("用户名不可为空");
//            $('#username').val("用户名不可为空");
            return false;
        }
        else if ($('#password').val() == "" || $('#password') == null) {
            $('#tips').css('color', 'red');
            $('#tips').html("密码不可为空");
            return false;
        }
        else{
            $('#tips').css('color', 'black');
            $('#tips').html("");
            return true;
        }
    }
</script>

<script>
    function sendAjaxLogin(url) {

        var username = $('#username').val();
        var password = $('#password').val();

        if (username == "" || username == null) {
            $('#tips').css('color', 'red');
            $('#tips').html("用户名不可为空");
//            $('#username').val("用户名不可为空");
        }
        else if (password == "" || password == null) {
            $('#tips').css('color', 'red');
            $('#tips').html("密码不可为空");
        }
        else
        {
            createXMLHttpRequest(); //创建XMLHttpRequest对象
            //var object1 = document.getElementById(objectID);
            var username = $('#username').val();
            var password = $('#password').val();

            XMLHttpReq.open('POST', url, true);

            XMLHttpReq.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            XMLHttpReq.send("username="+username + "&" + "password=" + password);

            XMLHttpReq.onreadystatechange = processResponseAjax;
        }
    }

    //执行获取Json数据后的操作
    function processResponseAjax(){
        if (XMLHttpReq.readyState == 4) {
            if (XMLHttpReq.status == 200) {
//                    alert("success");
                var result = XMLHttpReq.responseText;
                if(result == "failure")
                {
                    $('#tips').css('color', 'red');
                    $('#tips').html("密码错误或用户名不存在！");
                }
                else
                {
                    $('#tips').html("");
                    $('#loginform').submit();
                }
//                    alert(result);
            }
        }
    }
</script>

</body>
</html>