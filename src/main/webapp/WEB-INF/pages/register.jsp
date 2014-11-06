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
<<<<<<< HEAD
            /*background-image: url(./images/background.png);*/
            /*background-repeat: repeat-x;*/
=======
            background-image: url(images/background.png);
            background-repeat: repeat-x;
>>>>>>> 38f6b9dc07dcd717fe283dd877790e0b5e65b211
        }
        -->
    </style>
    <link href="./css/style.css" rel="stylesheet" type="text/css" />
<<<<<<< HEAD

    <script type="text/javascript" src="js/jquery-ui.js"></script>
    <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
    <script type="text/javascript" src="js/AjaxUtil.js"></script>
=======
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <%--<script type="text/javascript" src="js/jquery-ui.js"></script>--%>
    <%--<script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>--%>

>>>>>>> 38f6b9dc07dcd717fe283dd877790e0b5e65b211

</head>
<body>
<table width="1920" border="0" cellpadding="10" class="titlelogo">
    <tr>
        <td><div align="center"><img src="images/logo_login.png" width="482" height="89" alt="img" /></div></td>
    </tr>
</table>
<div align="center" class="head_title">新用户注册</div>
<<<<<<< HEAD
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

=======

<%--<table width="320" height="60" border="0" align="center" cellspacing="10" class="Table3">--%>
    <%--<tr>--%>
        <%--<td><span class="STYLE1">请在这个页面注册</span></td>--%>
    <%--</tr>--%>
<%--</table>--%>

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

<script src="js/jquery-ui.js"></script>
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
>>>>>>> 38f6b9dc07dcd717fe283dd877790e0b5e65b211
<script>
    function sendlogin() {
//        alert($('#username').val());
        if ($('#username').val() == "" || $('#username') == null) {
            $('#tips').css('color', 'red');
<<<<<<< HEAD
            $('#tips').html("用户名不可为空");
=======
            $('#tips').html("用户名不可为空！");
>>>>>>> 38f6b9dc07dcd717fe283dd877790e0b5e65b211
//            $('#username').val("用户名不可为空");
            return false;
        }
        else if ($('#password').val() == "" || $('#password') == null) {
            $('#tips').css('color', 'red');
<<<<<<< HEAD
            $('#tips').html("密码不可为空");
=======
            $('#tips').html("密码不可为空！");
            return false;
        }
        else if ($('#password').val() != $('#confirm').val()) {
            $('#tips').css('color', 'red');
            $('#tips').html("两次密码不一致！");
>>>>>>> 38f6b9dc07dcd717fe283dd877790e0b5e65b211
            return false;
        }
        else{
            $('#tips').css('color', 'black');
<<<<<<< HEAD
            $('#tips').html("");
            return true;
=======
            $('#tips').html("正在注册...");
            return true;;
>>>>>>> 38f6b9dc07dcd717fe283dd877790e0b5e65b211
        }
    }
</script>

<<<<<<< HEAD
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
=======

>>>>>>> 38f6b9dc07dcd717fe283dd877790e0b5e65b211

</body>
<%--<%@ page language="java" contentType="text/html; charset=UTF-8"--%>
         <%--pageEncoding="UTF-8"%>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">--%>
<%--<html>--%>
<%--<head>--%>
    <%--<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">--%>
    <%--<title>用户注册</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<form method="post" action="user.do">--%>
    <%--用户名：<input type="text" name="username">--%>
    <%--密码：<input type="password" name="password">--%>
    <%--确认密码：<input type="password" name="confirm">--%>
    <%--<input type="hidden" name="method" value="reg4">--%>
    <%--<input type="submit" value="注册">--%>
<%--</form>--%>

<%--<form method="post" action="login.do">--%>
    <%--已有账户??<br />--%>
    <%--用户名：<input type="text" name="username" ><br />--%>
    <%--密码：<input type="password" name="password">--%>
    <%--<input type="submit" value="登录">--%>
<%--</form>--%>

<%--</body>--%>
<%--</html>--%>
</html>
