<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html charset=UTF-8">
	<!--	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" /> -->
		<meta charset="utf-8" />
		<title>用户登录</title>

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
								<div id="login-box" class="login-box visible widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header blue lighter bigger">
												<i class="ace-icon fa fa-coffee blue"></i>
												用户登录
											</h4>

											<div class="space-6"></div>

											<form id="loginform" name="loginform" method="post" action="login.do">
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input id="username" name="username" type="text" class="form-control" placeholder="用户名" />
															<i class="ace-icon fa fa-user"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input id="password" name="password" type="password" class="form-control" placeholder="密码" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
													</label>

													<div class="space"></div>

                                                    <div id="tips" class="tips invisible">
                                                        <i class="ace-icon fa fa-info red"></i>
                                                        <span id="errorinfo" class="red lighter smaller">密码错误</span>
                                                    </div>

                                                    <div class="space"></div>

													<div class="clearfix">
														<label class="inline">
															<input type="checkbox" class="ace" />
															<span class="lbl"> 记住密码</span>
														</label>

														<button type="button" class="width-35 pull-right btn btn-sm btn-primary" onclick="sendAjaxLogin('usercheck')">
															<i class="ace-icon fa fa-key"></i>
															<span class="bigger-110">登录</span>
														</button>
													</div>

													<div class="space-4"></div>
												</fieldset>
											</form>

										</div><!-- /.widget-main -->

										<div class="toolbar clearfix">
											<div>
												<a href="#" data-target="#forgot-box" class="forgot-password-link">
													<i class="ace-icon fa fa-arrow-left"></i>
													忘记密码？
												</a>
											</div>

											<div>
												<a id="registerButton" href="#" data-target="#signup-box" class="user-signup-link">
													新用户注册
													<i class="ace-icon fa fa-arrow-right"></i>
												</a>
											</div>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.login-box -->

								<div id="forgot-box" class="forgot-box widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header red lighter bigger">
												<i class="ace-icon fa fa-key"></i>
												找回密码
											</h4>

											<div class="space-6"></div>
											<p>
												请输入您注册时使用的邮箱
											</p>

											<form>
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input type="email" class="form-control" placeholder="输入邮箱" />
															<i class="ace-icon fa fa-envelope"></i>
														</span>
													</label>

													<div class="clearfix">
														<button type="button" class="width-35 pull-right btn btn-sm btn-danger">
															<i class="ace-icon fa fa-lightbulb-o"></i>
															<span class="bigger-110">发送邮件！</span>
														</button>
													</div>
												</fieldset>
											</form>
										</div><!-- /.widget-main -->

										<div class="toolbar center">
											<a href="#" data-target="#login-box" class="back-to-login-link">
												返回登录
												<i class="ace-icon fa fa-arrow-right"></i>
											</a>
										</div>
									</div><!-- /.widget-body -->
								</div><!-- /.forgot-box -->

								<div id="signup-box" class="signup-box widget-box no-border">
									<div class="widget-body">
										<div class="widget-main">
											<h4 class="header green lighter bigger">
												<i class="ace-icon fa fa-users green"></i>
												新用户注册
											</h4>

											<div class="space-填写6"></div>
											<p> 请填写您的注册信息 </p>

											<form id="reg_form" name="reg_form" method="post" action="registerSubmitAction">
												<fieldset>
													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input id="reg_email" name="email" type="email" class="form-control" placeholder="请输入邮箱" />
															<i class="ace-icon fa fa-envelope"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input id="reg_username" name="username" type="text" class="form-control" placeholder="请输入用户名" />
															<i class="ace-icon fa fa-user"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input id="reg_password" name="password" type="password" class="form-control" placeholder="请输入密码" />
															<i class="ace-icon fa fa-lock"></i>
														</span>
													</label>

													<label class="block clearfix">
														<span class="block input-icon input-icon-right">
															<input id="reg_confirm" name="confirm" type="password" class="form-control" placeholder="密码确认" />
															<i class="ace-icon fa fa-retweet"></i>
														</span>
													</label>

													<label class="block">
														<input type="checkbox" class="ace" id="reg_agreecheck" name="reg_agreecheck"/>
														<span class="lbl">
															我已阅读并同意
															<a href="#">用户须知</a>
														</span>
													</label>

                                                    <div class="space-6"></div>

                                                    <div id="reg_tips" class="tips invisible">
                                                        <i class="ace-icon fa fa-info red"></i>
                                                        <span id="reg_errorinfo" class="red lighter smaller"></span>
                                                    </div>

                                                    <div class="space-6"></div>

													<div class="clearfix">
														<button type="reset" class="width-30 pull-left btn btn-sm">
															<i class="ace-icon fa fa-refresh"></i>
															<span class="bigger-110">重置</span>
														</button>

														<button type="button" class="width-65 pull-right btn btn-sm btn-success" onclick="sendRegister()">
															<span class="bigger-110">注册</span>
															<i class="ace-icon fa fa-arrow-right icon-on-right"></i>
														</button>
													</div>
												</fieldset>
											</form>
										</div>

										<div class="toolbar center">
											<a href="#" data-target="#login-box" class="back-to-login-link">
												<i class="ace-icon fa fa-arrow-left"></i>
												返回登录
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

		<!-- <![endif]-->

		<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery1x.js'>"+"<"+"/script>");
</script>
<![endif]-->
		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='assets/js/jquery.mobile.custom.js'>"+"<"+"/script>");
		</script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">
			jQuery(function($) {
			 $(document).on('click', '.toolbar a[data-target]', function(e) {
				e.preventDefault();
				var target = $(this).data('target');
				$('.widget-box.visible').removeClass('visible');//hide others
				$(target).addClass('visible');//show target
			 });
			});
			
			
			
			//you don't need this, just used for changing background
			jQuery(function($) {
			 $('#btn-login-dark').on('click', function(e) {
				$('body').attr('class', 'login-layout');
				$('#id-text2').attr('class', 'white');
				$('#id-company-text').attr('class', 'blue');
				
				e.preventDefault();
			 });
			 $('#btn-login-light').on('click', function(e) {
				$('body').attr('class', 'login-layout light-login');
				$('#id-text2').attr('class', 'grey');
				$('#id-company-text').attr('class', 'blue');
				
				e.preventDefault();
			 });
			 $('#btn-login-blur').on('click', function(e) {
				$('body').attr('class', 'login-layout blur-login');
				$('#id-text2').attr('class', 'white');
				$('#id-company-text').attr('class', 'light-blue');
				
				e.preventDefault();
			 });
			 
			});
		</script>

        <script type="text/javascript">
            function sendlogin() {
//        alert($('#username').val());
                if ($('#username').val() == "" || $('#username') == null) {
//                  $('#tips').css('color', 'red');
                    $('#errorinfo').html("用户名不可为空");
                    $('#tips').css("visibility","visible");
//            $('#username').val("用户名不可为空");
                    return false;
                }
                else if ($('#password').val() == "" || $('#password') == null) {
//                    $('#tips').css('color', 'red');
                    $('#errorinfo').html("密码不可为空");
                    $('#tips').css("visibility","visible");
                    return false;
                }
                else{
//                    $('#tips').css('color', 'black');
                    $('#errorinfo').html("");
                    $('#tips').css("visibility","hidden");
                    return true;
                }
            }

            function sendAjaxLogin(url) {

                var username = $('#username').val();
                var password = $('#password').val();

                if (username == "" || username == null) {
                    $('#errorinfo').html("用户名不可为空");
                    $('#tips').css("visibility","visible");
                }
                else if (password == "" || password == null) {
                    $('#errorinfo').html("密码不可为空");
                    $('#tips').css("visibility","visible");
                }
                else
                {
                    createXMLHttpRequest(); //创建XMLHttpRequest对象
                    $('#tips').css("visibility","hidden");;
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
                            $('#errorinfo').html("密码错误或用户名不存在！");
                            $('#tips').css("visibility","visible");
                        }
                        else
                        {
                            $('#errorinfo').html("");
                            $('#tips').css("visibility","hidden");
                            $('#loginform').submit();
                        }
                    }
                }
            }
        </script>

        <script type="text/javascript">
            function sendRegister() {
                if ($('#reg_email').val() == "" || $('#reg_email') == null) {
                    $('#reg_tips').css("visibility","visible");
                    $('#reg_errorinfo').html("注册邮箱不可为空！");
                }

                else if ($('#reg_username').val() == "" || $('#reg_username') == null) {
                    $('#reg_tips').css("visibility","visible");
                    $('#reg_errorinfo').html("用户名不可为空！");
                }
                else if ($('#reg_password').val() == "" || $('#reg_password') == null) {
                    $('#reg_tips').css("visibility","visible");
                    $('#reg_errorinfo').html("密码不可为空！");
                }

                else if ($('#reg_confirm').val() == "" || $('#reg_confirm') == null) {
                    $('#reg_tips').css("visibility","visible");
                    $('#reg_errorinfo').html("密码确认不可为空！");
                }

                else if ($('#reg_password').val() != $('#reg_confirm').val()) {
                    $('#reg_tips').css("visibility","visible");
                    $('#reg_errorinfo').html("两次密码不一致！");
                }

                else if ($('#reg_agreecheck').is(":checked") == false) {
                    $('#reg_tips').css("visibility","visible");
                    $('#reg_errorinfo').html("请阅读并同意用户须知");
                }

                else{
                    $('#reg_tips').css("visibility","hidden");
                    $('#reg_form').submit();
                }
            }


            $(function (){
                var url = document.URL;
                var urlA = url.split("?");
                var word = urlA[1];
                if(word == "register")
                {
                    lnk = $('#registerButton');
                    lnk.click();
                }
            });
        </script>
	</body>
</html>
