<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
	<!--	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" /> -->
		<meta charset="utf-8" />
		<title>注册成功</title>

		<meta name="description" content="User login page" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="./assets/css/bootstrap.css" />
		<link rel="stylesheet" href="./assets/css/font-awesome.css" />

		<!-- text fonts -->
		<link rel="stylesheet" href="./assets/css/ace-fonts.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="./assets/css/ace.css" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="./assets/css/ace-part2.css" />
		<![endif]-->
		<link rel="stylesheet" href="./assets/css/ace-rtl.css" />

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="./assets/css/ace-ie.css" />
		<![endif]-->

		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

		<!--[if lt IE 9]>
		<script src="./assets/js/html5shiv.js"></script>
		<script src="./assets/js/respond.js"></script>
		<![endif]-->
        <script type="text/javascript" src="./common/js/jquery-ui.js"></script>
        <script type="text/javascript" src="./common/js/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="./common/js/AjaxUtil.js"></script>
	</head>

	<body class="login-layout">
		<div class="main-container">
			<div class="main-content">
				<div class="row">
					<div class="col-sm-10 col-sm-offset-1">
						<div class="login-container">
							<div class="center">
								<h1>
                                    <img src="./assets/img/cancologo.png" width="50px" height="50px">
									<span class="red"></span>
									<span class="white" id="id-text2">实物资产管理系统</span>
								</h1>
								<h4 class="blue" id="id-company-text">&copy; CancoSoft</h4>
							</div>

							<div class="space-6"></div>

							<div class="position-relative">
								<div id="signup-box" class="signup-box visible widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header green lighter bigger">
												<i class="ace-icon fa fa-users green"></i>
												新用户注册
											</h4>

											<div class="space-6"></div>
                                            <h2 class="green text-center"><b>注册成功！</b></h2>
                                            <div class="space-12"></div>
                                            <div class="text-center">
                                                <span class="red" id="totalSecond">5</span>秒后自动跳转回登录界面
                                            </div>
                                            <div class="space-12"></div>
										</div>

										<div class="toolbar center">
                                            <a href="login.html"  class="back-to-login-link">
												<i class="ace-icon fa fa-arrow-left"></i>
                                                返回登录界面
											</a>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.signup-box -->
							</div><!-- /.position-relative -->

							<div class="navbar-fixed-top align-right">
								<br />
                                &nbsp;
                                <span class="grey">界面风格：</span>
								&nbsp;
								<a id="btn-login-dark" href="#">雅黑</a>
								&nbsp;
								<span class="blue">/</span>
								&nbsp;
								<a id="btn-login-blur" href="#">炫彩</a>
								&nbsp;
								<span class="blue">/</span>
								&nbsp;
								<a id="btn-login-light" href="#">简约</a>
								&nbsp; &nbsp; &nbsp;
							</div>
						</div>
					</div><!-- /.col -->
				</div><!-- /.row -->
			</div><!-- /.main-content -->
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
		<script type="text/javascript">
			window.jQuery || document.write("<script src='assets/js/jquery.js'>"+"<"+"/script>");
		</script>


        <script language="javascript" type="text/javascript">
            var second = document.getElementById('totalSecond').textContent;

            if (navigator.appName.indexOf("Explorer") > -1)
            {
                second = document.getElementById('totalSecond').innerText;
            } else
            {
                second = document.getElementById('totalSecond').textContent;
            }

            setInterval("redirect()", 1000);
            function redirect()
            {
                if (second < 0)
                {
                    location.href = 'login.html';
                }
                else
                {
                    if (navigator.appName.indexOf("Explorer") > -1)
                    {
                        document.getElementById('totalSecond').innerText = second--;
                    } else
                    {
                        document.getElementById('totalSecond').textContent = second--;
                    }
                }
            }
        </script>



	</body>
</html>
