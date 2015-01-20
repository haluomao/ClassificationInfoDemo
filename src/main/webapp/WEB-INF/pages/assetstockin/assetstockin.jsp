<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en"><head>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta charset="utf-8" />
    <title>Cancosoft</title>

    <meta name="description" content="Dynamic tables and grids using jqGrid plugin" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    <!-- bootstrap & fontawesome -->
    <link rel="stylesheet" href="assets/css/bootstrap.css" />
    <link rel="stylesheet" href="assets/css/font-awesome.css" />

    <!-- page specific plugin styles -->
    <link rel="stylesheet" href="assets/css/jquery-ui.css" />
    <link rel="stylesheet" href="assets/css/datepicker.css" />
    <link rel="stylesheet" href="assets/css/ui.jqgrid.css" />

    <!-- text fonts -->
    <link rel="stylesheet" href="assets/css/ace-fonts.css" />

    <!-- ace styles -->
    <link rel="stylesheet" href="assets/css/ace.css" class="ace-main-stylesheet" id="main-ace-style" />

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="assets/css/ace-part2.css" class="ace-main-stylesheet" />
    <![endif]-->

    <!--[if lte IE 9]>
    <link rel="stylesheet" href="assets/css/ace-ie.css" />
    <![endif]-->

    <link rel="stylesheet" href="assets/css/style.css" />
    <!-- inline styles related to this page -->

    <!-- ace settings handler -->
    <script src="assets/js/ace-extra.js"></script>

    <!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

    <!--[if lte IE 8]>
    <script src="assets/js/html5shiv.js"></script>
    <script src="assets/js/respond.js"></script>
    <![endif]-->
</head>

<body class="no-skin">
<!-- #section:basics/navbar.layout -->
<div id="navbar" class="navbar navbar-default">
<script type="text/javascript">
    try{ace.settings.check('navbar' , 'fixed')}catch(e){}
</script>

<div class="navbar-container" id="navbar-container">
<!-- #section:basics/sidebar.mobile.toggle -->
<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
    <span class="sr-only">Toggle sidebar</span>

    <span class="icon-bar"></span>

    <span class="icon-bar"></span>

    <span class="icon-bar"></span>
</button>

<!-- /section:basics/sidebar.mobile.toggle -->
<div class="navbar-header pull-left">
    <!-- #section:basics/navbar.layout.brand -->
    <a href="#" class="navbar-brand">
        <small>
            <i class="fa fa-leaf"></i>
            实物资产管理
        </small>
    </a>

    <!-- /section:basics/navbar.layout.brand -->

    <!-- #section:basics/navbar.toggle -->

    <!-- /section:basics/navbar.toggle -->
</div>

<!-- #section:basics/navbar.dropdown -->
<div class="navbar-buttons navbar-header pull-right" role="navigation">
<ul class="nav ace-nav">
<li class="grey">
    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
        <i class="ace-icon fa fa-tasks"></i>
        <span class="badge badge-grey">4</span>
    </a>

    <ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
        <li class="dropdown-header">
            <i class="ace-icon fa fa-check"></i>
            4 Tasks to complete
        </li>

        <li class="dropdown-content ace-scroll" style="position: relative;"><div class="scroll-track" style="display: none;"><div class="scroll-bar"></div></div><div class="scroll-content" style="max-height: 200px;">
            <ul class="dropdown-menu dropdown-navbar">
                <li>
                    <a href="#">
                        <div class="clearfix">
                            <span class="pull-left">Software Update</span>
                            <span class="pull-right">65%</span>
                        </div>

                        <div class="progress progress-mini">
                            <div style="width:65%" class="progress-bar"></div>
                        </div>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <div class="clearfix">
                            <span class="pull-left">Hardware Upgrade</span>
                            <span class="pull-right">35%</span>
                        </div>

                        <div class="progress progress-mini">
                            <div style="width:35%" class="progress-bar progress-bar-danger"></div>
                        </div>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <div class="clearfix">
                            <span class="pull-left">Unit Testing</span>
                            <span class="pull-right">15%</span>
                        </div>

                        <div class="progress progress-mini">
                            <div style="width:15%" class="progress-bar progress-bar-warning"></div>
                        </div>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <div class="clearfix">
                            <span class="pull-left">Bug Fixes</span>
                            <span class="pull-right">90%</span>
                        </div>

                        <div class="progress progress-mini progress-striped active">
                            <div style="width:90%" class="progress-bar progress-bar-success"></div>
                        </div>
                    </a>
                </li>
            </ul>
        </div></li>

        <li class="dropdown-footer">
            <a href="#">
                See tasks with details
                <i class="ace-icon fa fa-arrow-right"></i>
            </a>
        </li>
    </ul>
</li>

<li class="purple">
    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
        <i class="ace-icon fa fa-bell icon-animated-bell"></i>
        <span class="badge badge-important">8</span>
    </a>

    <ul class="dropdown-menu-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-close">
        <li class="dropdown-header">
            <i class="ace-icon fa fa-exclamation-triangle"></i>
            8 Notifications
        </li>

        <li class="dropdown-content ace-scroll" style="position: relative;"><div class="scroll-track" style="display: none;"><div class="scroll-bar"></div></div><div class="scroll-content" style="max-height: 200px;">
            <ul class="dropdown-menu dropdown-navbar navbar-pink">
                <li>
                    <a href="#">
                        <div class="clearfix">
													<span class="pull-left">
														<i class="btn btn-xs no-hover btn-pink fa fa-comment"></i>
														New Comments
													</span>
                            <span class="pull-right badge badge-info">+12</span>
                        </div>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <i class="btn btn-xs btn-primary fa fa-user"></i>
                        Bob just signed up as an editor ...
                    </a>
                </li>

                <li>
                    <a href="#">
                        <div class="clearfix">
													<span class="pull-left">
														<i class="btn btn-xs no-hover btn-success fa fa-shopping-cart"></i>
														New Orders
													</span>
                            <span class="pull-right badge badge-success">+8</span>
                        </div>
                    </a>
                </li>

                <li>
                    <a href="#">
                        <div class="clearfix">
													<span class="pull-left">
														<i class="btn btn-xs no-hover btn-info fa fa-twitter"></i>
														Followers
													</span>
                            <span class="pull-right badge badge-info">+11</span>
                        </div>
                    </a>
                </li>
            </ul>
        </div></li>

        <li class="dropdown-footer">
            <a href="#">
                See all notifications
                <i class="ace-icon fa fa-arrow-right"></i>
            </a>
        </li>
    </ul>
</li>

<li class="green">
    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
        <i class="ace-icon fa fa-envelope icon-animated-vertical"></i>
        <span class="badge badge-success">5</span>
    </a>

    <ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
        <li class="dropdown-header">
            <i class="ace-icon fa fa-envelope-o"></i>
            5 Messages
        </li>

        <li class="dropdown-content ace-scroll" style="position: relative;"><div class="scroll-track" style="display: none;"><div class="scroll-bar"></div></div><div class="scroll-content" style="max-height: 200px;">
            <ul class="dropdown-menu dropdown-navbar">
                <li>
                    <a href="#" class="clearfix">
                        <img src="assets/avatars/avatar.png" class="msg-photo" alt="Alex's Avatar">
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Alex:</span>
														Ciao sociis natoque penatibus et auctor ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>a moment ago</span>
													</span>
												</span>
                    </a>
                </li>

                <li>
                    <a href="#" class="clearfix">
                        <img src="assets/avatars/avatar3.png" class="msg-photo" alt="Susan's Avatar">
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Susan:</span>
														Vestibulum id ligula porta felis euismod ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>20 minutes ago</span>
													</span>
												</span>
                    </a>
                </li>

                <li>
                    <a href="#" class="clearfix">
                        <img src="assets/avatars/avatar4.png" class="msg-photo" alt="Bob's Avatar">
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Bob:</span>
														Nullam quis risus eget urna mollis ornare ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>3:15 pm</span>
													</span>
												</span>
                    </a>
                </li>

                <li>
                    <a href="#" class="clearfix">
                        <img src="assets/avatars/avatar2.png" class="msg-photo" alt="Kate's Avatar">
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Kate:</span>
														Ciao sociis natoque eget urna mollis ornare ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>1:33 pm</span>
													</span>
												</span>
                    </a>
                </li>

                <li>
                    <a href="#" class="clearfix">
                        <img src="assets/avatars/avatar5.png" class="msg-photo" alt="Fred's Avatar">
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Fred:</span>
														Vestibulum id penatibus et auctor  ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>10:09 am</span>
													</span>
												</span>
                    </a>
                </li>
            </ul>
        </div></li>

        <li class="dropdown-footer">
            <a href="inbox.html">
                See all messages
                <i class="ace-icon fa fa-arrow-right"></i>
            </a>
        </li>
    </ul>
</li>

<!-- #section:basics/navbar.user_menu -->
<li class="light-blue">
    <a data-toggle="dropdown" href="#" class="dropdown-toggle">
        <img class="nav-user-photo" src="assets/avatars/user.jpg" alt="Jason's Photo">
								<span class="user-info">
									<small>欢迎,</small>

								</span>

        <i class="ace-icon fa fa-caret-down"></i>
    </a>

    <ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
        <li>
            <a href="#">
                <i class="ace-icon fa fa-cog"></i>
                设置
            </a>
        </li>

        <li>
            <a href="profile.html">
                <i class="ace-icon fa fa-user"></i>
                个人信息
            </a>
        </li>

        <li class="divider"></li>

        <li>
            <a href="#">
                <i class="ace-icon fa fa-power-off"></i>
                登出
            </a>
        </li>
    </ul>
</li>

<!-- /section:basics/navbar.user_menu -->
</ul>
</div>

<!-- /section:basics/navbar.dropdown -->
</div><!-- /.navbar-container -->
</div>

<!-- /section:basics/navbar.layout -->
<div class="main-container" id="main-container">
<script type="text/javascript">
    try{ace.settings.check('main-container' , 'fixed')}catch(e){}
</script>

<!-- #section:basics/sidebar -->
<div id="sidebar" class="sidebar                  responsive">
    <script type="text/javascript">
        try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
    </script>



    <ul class="nav nav-list">
        <li class="">
            <a href="index.html">
                <i class="menu-icon fa fa-tachometer"></i>
                <span class="menu-text"> 控制面板 </span>
            </a>

            <b class="arrow"></b>
        </li>

        <li class="active open">
            <a href="#" class="dropdown-toggle">
                <i class="menu-icon fa fa-list"></i>
                <span class="menu-text"> 数据列表 </span>

                <b class="arrow fa fa-angle-down"></b>
            </a>

            <b class="arrow"></b>

            <ul class="submenu">

                <li >
                    <a href="classification">
                        <i class="menu-icon fa fa-caret-right"></i>
                        资产分类
                    </a>

                    <b class="arrow"></b>
                </li>
                <li class="active">
                    <a href="assetstockin">
                        <i class="menu-icon fa fa-caret-right"></i>
                        资产入库
                    </a>
                    <b class="arrow"></b>
                </li>
            </ul>
        </li>

    </ul><!-- /.nav-list -->

    <!-- #section:basics/sidebar.layout.minimize -->
    <div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
        <i class="ace-icon fa fa-angle-double-left" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
    </div>

    <!-- /section:basics/sidebar.layout.minimize -->
    <script type="text/javascript">
        try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
    </script>
</div>

<!-- /section:basics/sidebar -->
<div class="main-content">
<div class="main-content-inner">
<!-- #section:basics/content.breadcrumbs -->
<div class="breadcrumbs" id="breadcrumbs">
    <script type="text/javascript">
        try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
    </script>

    <ul class="breadcrumb">
        <li>
            <i class="ace-icon fa fa-home home-icon"></i>
            <a href="#">主页</a>
        </li>

        <li>
            <a href="#">数据列表</a>
        </li>
        <li class="active">资产入库</li>
    </ul><!-- /.breadcrumb -->

    <!-- #section:basics/content.searchbox -->
    <div class="nav-search" id="nav-search">
        <form class="form-search">
								<span class="input-icon">
									<input type="text" placeholder="搜索 ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
									<i class="ace-icon fa fa-search nav-search-icon"></i>
								</span>
        </form>
    </div><!-- /.nav-search -->

    <!-- /section:basics/content.searchbox -->
</div>

<!-- /section:basics/content.breadcrumbs -->
<div class="page-content">
    <!-- #section:settings.box -->
    <div class="ace-settings-container" id="ace-settings-container">
        <div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
            <i class="ace-icon fa fa-cog bigger-130"></i>
        </div>

        <div class="ace-settings-box clearfix" id="ace-settings-box">
            <div class="pull-left width-50">
                <!-- #section:settings.skins -->
                <div class="ace-settings-item">
                    <div class="pull-left">
                        <select id="skin-colorpicker" class="hide">
                            <option data-skin="no-skin" value="#438EB9">#438EB9</option>
                            <option data-skin="skin-1" value="#222A2D">#222A2D</option>
                            <option data-skin="skin-2" value="#C6487E">#C6487E</option>
                            <option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
                        </select>
                    </div>
                    <span>&nbsp; Choose Skin</span>
                </div>

                <!-- /section:settings.skins -->

                <!-- #section:settings.navbar -->
                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-navbar" />
                    <label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
                </div>

                <!-- /section:settings.navbar -->

                <!-- #section:settings.sidebar -->
                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-sidebar" />
                    <label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
                </div>

                <!-- /section:settings.sidebar -->

                <!-- #section:settings.breadcrumbs -->
                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-breadcrumbs" />
                    <label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
                </div>

                <!-- /section:settings.breadcrumbs -->

                <!-- #section:settings.rtl -->
                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" />
                    <label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
                </div>

                <!-- /section:settings.rtl -->

                <!-- #section:settings.container -->
                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-add-container" />
                    <label class="lbl" for="ace-settings-add-container">
                        Inside
                        <b>.container</b>
                    </label>
                </div>

                <!-- /section:settings.container -->
            </div><!-- /.pull-left -->

            <div class="pull-left width-50">
                <!-- #section:basics/sidebar.options -->
                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover" />
                    <label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact" />
                    <label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
                </div>

                <div class="ace-settings-item">
                    <input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight" />
                    <label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
                </div>

                <!-- /section:basics/sidebar.options -->
            </div><!-- /.pull-left -->
        </div><!-- /.ace-settings-box -->
    </div><!-- /.ace-settings-container -->

    <!-- /section:settings.box -->
    <div class="page-header">
        <h1>
            资产入库
        </h1>
    </div><!-- /.page-header -->
    <div class="row">
        <div class="col-sm-12">
            <div class="widget-box">
                <div class="widget-header">
                    <h4 class="widget-title">检索条件</h4>
                    <div class="widget-toolbar">
                        <a href="#" data-action="collapse">
                            <i class="ace-icon fa fa-chevron-up"></i>
                        </a>

                    </div>
                </div>

                <div class="widget-body">
                    <div class="widget-main no-padding">
                        <form>
                            <!-- <legend>Form</legend> -->
                            <fieldset>

                                <div class="form-inline col-xs-12 col-md-offset-1 col-md-5" >
                                    <label  for="search_assetNo" >资产编号:</label>
                                    <!-- #section:plugins/input.masked-input -->

                                    <input type="text" id="search_assetNo" placeholder="资产名称"  name="search_assetNo" />

                                </div>

                                <div class="col-xs-12 col-md-6">
                                    <label for="search_assetName">资产名称:</label>
                                    <!-- #section:plugins/input.masked-input -->
                                    <input type="text" id="search_assetName" placeholder="资产名称"  name="search_assetName" />
                                </div>
                                <br>
                                <div class="space space-12"></div>
                                <div class="col-xs-12 col-md-offset-1 col-md-5">
                                    <div class="form-inline">
                                        <label for="search_beginDate"> 创建日期: </label>
                                        <div class="input-group col-xs-6 col-md-6">
                                            <input class="col-xs-12 col-md-12" placeholder="起始于.." type="text" id="search_beginDate" />
                                            <span class="input-group-addon">
                                                <i class="fa fa-arrow-right"></i>
                                            </span>

                                            <input class="col-xs-12 col-md-12" placeholder="截止于.." type="text" id="search_endDate" />
                                        </div>
                                    </div>
                                </div>

                                <!--<label>Label name</label>-->

                                <!--<input type="text" placeholder="Type something…">-->
                                <!--<span class="help-block">Example block-level help text here.</span>-->

                                <!--<label class="pull-right">-->
                                <!--<input type="checkbox" class="ace">-->
                                <!--<span class="lbl"> check me out</span>-->
                                <!--</label>-->
                            </fieldset>

                            <div class="form-actions center">
                                <!--<button type="button" class="btn btn-sm btn-success">-->
                                <!--Submit-->
                                <!--<i class="ace-icon fa fa-arrow-right icon-on-right bigger-110"></i>-->
                                <!--</button>-->
                                <button type="button" class="btn btn-success" onclick="gridReload()">检索</button>
                                <button type="reset" class="btn btn-primary">重置</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
    <!-- 购物车 -->
    <div class="widget-toolbar dropdown">
        <a href="#" class="dropdown-menu-right dropdown-toggle" data-action="cart" data-toggle="dropdown"
           aria-expanded="false">
            <i class="ace-icon fa fa-shopping-cart bigger-120 red"></i>
            <span class="infobox-data-number red">购物车</span>
        </a>

        <ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close"
            style="width:auto;">
            <li class="dropdown-header">
                <i class="ace-icon fa fa-shopping-cart"></i>
                购物车
            </li>

            <li class="dropdown-content ace-scroll" style="position: relative;">
                <div class="scroll-content" style="line-height: 19.5px;background-color: #FFFFFF;">
                    <table id="grid-table-cart"></table>
                    <div id="grid-pager-cart"></div>
                </div>
            </li>
        </ul>
    </div><!-- 购物车 -->
    </div>

    <div class="row">
        <div class="col-xs-12">
            <!-- PAGE CONTENT BEGINS -->


            <table id="tableList"></table>

            <div id="pager"></div>

            <script type="text/javascript">
                var $path_base = "..";//in Ace demo this will be used for editurl parameter
            </script>

            <!-- PAGE CONTENT ENDS -->
        </div><!-- /.col -->
    </div><!-- /.row -->
</div><!-- /.page-content -->
</div>
</div><!-- /.main-content -->

<div class="footer">
    <div class="footer-inner">
        <!-- #section:basics/footer -->
        <div class="footer-content">
						<span class="bigger-120">
							<span class="blue bolder">CancoSoft.</span>
							 All Right Reserved.
						</span>
        </div>

        <!-- /section:basics/footer -->
    </div>
</div>

<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
    <i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
</a>
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
<script src="assets/js/bootstrap.js"></script>

<!-- page specific plugin scripts -->
<script src="assets/js/date-time/bootstrap-datepicker.js"></script>
<script src="assets/js/jqGrid/jquery.jqGrid.src.js"></script>
<script src="assets/js/jqGrid/i18n/grid.locale-en.js"></script>

<!-- ace scripts -->
<script src="assets/js/ace/elements.scroller.js"></script>
<script src="assets/js/ace/elements.colorpicker.js"></script>
<script src="assets/js/ace/elements.fileinput.js"></script>
<script src="assets/js/ace/elements.typeahead.js"></script>
<script src="assets/js/ace/elements.wysiwyg.js"></script>
<script src="assets/js/ace/elements.spinner.js"></script>
<script src="assets/js/ace/elements.treeview.js"></script>
<script src="assets/js/ace/elements.wizard.js"></script>
<script src="assets/js/ace/elements.aside.js"></script>
<script src="assets/js/ace/ace.js"></script>
<script src="assets/js/ace/ace.ajax-content.js"></script>
<script src="assets/js/ace/ace.touch-drag.js"></script>
<script src="assets/js/ace/ace.sidebar.js"></script>
<script src="assets/js/ace/ace.sidebar-scroll-1.js"></script>
<script src="assets/js/ace/ace.submenu-hover.js"></script>
<script src="assets/js/ace/ace.widget-box.js"></script>
<script src="assets/js/ace/ace.settings.js"></script>
<script src="assets/js/ace/ace.settings-rtl.js"></script>
<script src="assets/js/ace/ace.settings-skin.js"></script>
<script src="assets/js/ace/ace.widget-on-reload.js"></script>
<script src="assets/js/ace/ace.searchbox-autocomplete.js"></script>

<script src="common/js/AjaxUtil.js"></script>
<script src="common/js/cancojs.js"></script>
<!-- inline scripts related to this page -->
<script type="text/javascript">

jQuery(function($) {
    var grid_selector = "#tableList";
    var pager_selector = "#pager";

    jQuery("#search_beginDate").datepicker({dateFormat:'yy-mm-dd'});
    jQuery("#search_endDate").datepicker({dateFormat:'yy-mm-dd'});

    //resize to fit page size
    $(window).on('resize.jqGrid', function () {
        $(grid_selector).jqGrid( 'setGridWidth', $(".page-content").width() );
    })
    //resize on sidebar collapse/expand
    var parent_column = $(grid_selector).closest('[class*="col-"]');
    $(document).on('settings.ace.jqGrid' , function(ev, event_name, collapsed) {
        if( event_name === 'sidebar_collapsed' || event_name === 'main_container_fixed' ) {
            //setTimeout is for webkit only to give time for DOM changes and then redraw!!!
            setTimeout(function() {
                $(grid_selector).jqGrid( 'setGridWidth', parent_column.width() );
            }, 0);
        }
    })

    //if your grid is inside another element, for example a tab pane, you should use its parent's width:
    /**
     $(window).on('resize.jqGrid', function () {
					var parent_width = $(grid_selector).closest('.tab-pane').width();
					$(grid_selector).jqGrid( 'setGridWidth', parent_width );
				})
     //and also set width when tab pane becomes visible
     $('#myTab a[data-toggle="tab"]').on('shown.bs.tab', function (e) {
				  if($(e.target).attr('href') == '#mygrid') {
					var parent_width = $(grid_selector).closest('.tab-pane').width();
					$(grid_selector).jqGrid( 'setGridWidth', parent_width );
				  }
				})
     */

    var date_options={
        size:12,
        dataInit:function(element){
            $(element).datepicker({dateFormat:'yy-mm-dd'});
        },
        defaultValue: function(){
            var currentTime = new Date();
            var month = parseInt(currentTime.getMonth() + 1);
            month = month <= 9 ? "0"+month : month;
            var day = currentTime.getDate();
            day = day <= 9 ? "0"+day : day;
            var year = currentTime.getFullYear();
            return year+"-"+month + "-"+day;
        }
    };

    var select_options={
        dataUrl:'assetListSelect'
        ,buildSelect: function(data) {
            var response =  eval(data);
            var s = '<select>';
            var selectedId = $("#tableList").jqGrid("getGridParam", "selrow");
            if(selectedId){
                var rowData = $("#tableList").jqGrid("getRowData", selectedId);
                s += '<option value="'+rowData["assetList.assetId"]+'">'+rowData["assetList.assetNo"]+'</option>';
            }

            if (response && response.length) {
                for (var i = 0, l=response.length; i<l ; i++) {
                    var ri = response[i];
                    s += '<option value="'+ri.assetId+'">'+ri.assetNo+'</option>';
                }
            }
            return s+'</select>';
        }
    };

    function indexOfGoods(cartGoods, rowData){
        for(var i=0; i<cartGoods.length; i++){
            if(rowData["stockInInfoList.stockInInfoId"]==cartGoods[i]["stockInInfoList.stockInInfoId"])
                return i;
        }
        alert("error");
        return -1;
    }
    //选择单条数据
    function updateCart(id,  status){
        var rowData = $("#tableList").jqGrid("getRowData", id);
        if(status){
            rowDataIds.push(id);
            cartGoods.push(rowData);
        }else{

            rowDataIds.splice(rowDataIds.indexOf(id), 1);
            var index = indexOfGoods(cartGoods, rowData);
            cartGoods.splice(index, index<0?0:1);
        }
        $("#grid-table-cart").jqGrid("clearGridData");
        for(var i=0; i<cartGoods.length; i++){
            $("#grid-table-cart").jqGrid("addRowData", i, cartGoods[i]);
        }
        $("#grid-table-cart").trigger("reloadGrid");
    }

    //选择多条数据，一般是全选操作
    function updateCartAll(ids,  status){
        for(var i=0; i<ids.length; i++){
            var id= ids[i];
            var rowData = $("#tableList").jqGrid("getRowData", id);
            if(status){
                if(rowDataIds.indexOf(id)<0) {
                    rowDataIds.push(id);
                    cartGoods.push(rowData);
                }
            }else{
                if(rowDataIds.indexOf(id)>=0) {
                    rowDataIds.splice(rowDataIds.indexOf(id), 1);
                    var index = indexOfGoods(cartGoods, rowData);
                    cartGoods.splice(index, index<0?0:1);
                }
            }
        }
        $("#grid-table-cart").jqGrid("clearGridData");
        for(var i=0; i<cartGoods.length; i++){
            $("#grid-table-cart").jqGrid("addRowData", i, cartGoods[i]);
        }
        $("#grid-table-cart").trigger("reloadGrid");
    }

    //保存翻页时的选择
    function updateSelection(){
        for(var i=0; i<rowDataIds.length; i++){
            $("#tableList").jqGrid("setSelection",rowDataIds[i], false);
        }
    }
    //清空购物车
    function clearCart(){
        rowDataIds = [];
        cartGoods = [];
        $("#grid-table-cart").jqGrid("clearGridData");
    }

    //购物车
    $("#grid-table-cart").jqGrid({
        colNames: ['入库信息主键','资产主键','资产编号','入库单号', '资产创建日期', '资产名', '入库创建人', '入库说明'],//['入库单号', '入库日期', '资产名','购买时间','创建人','说明']
        colModel: [
            {name: 'stockInInfoList.stockInInfoId', index: 'stockInInfoList.stockInInfoId', width: 100, sortable: true, key:true, hidden:true}
            ,{name: 'assetList.assetId', index: 'assetList.assetId', width: 100, sortable: true, hidden:true}
            ,{name: 'assetList.assetNo', index: 'assetList.assetNo', width: 100, sortable: true, align:"left"}
            ,{name: 'stockInList.stockInNo', index: 'stockInList.stockInNo', width: 100, sortable: true, align:"left", editable:true}
            ,{name: 'assetList.assetCreateDate', index: 'assetList.assetCreateDate', width: 100, sortable: true, align:"left", editable:false,
                editoptions:date_options,editrules:{required:true, date:true}
                ,formatter:'date',formatoptions:{srcformat:'Y-m-d H:i:s', newformat:'Y-m-d'}}
            ,{name: 'assetList.assetName', index: 'assetList.assetName', width: 100, sortable: true, align:"left", editable:false,
                editrules:{required:true}}
            ,{name: 'stockInList.stockInCreateMan', index: 'stockInList.stockInCreateMan', width: 100, sortable: true, align:"left", editable:true}
            ,{name: 'stockInList.stockInExplainInfo', index: 'stockInList.stockInExplainInfo', width: 100, sortable: true, align:"left", editable:true
                ,edittype:"textarea", editoptions:{rows:"2",cols:"20"}}
        ],
        caption: "购物清单", //表格名称
        //@CodeGen end
        pager: '#grid-pager-cart',
        rowNum: 10,
        rowList: [10, 20, 30],
        viewrecords: true, //总记录数
        autowidth: true,
        datatype: "local",
        height: '300px'
    });


    jQuery(grid_selector).jqGrid({
        subGridOptions : {
            plusicon : "ace-icon fa fa-plus center bigger-110 blue",
            minusicon  : "ace-icon fa fa-minus center bigger-110 blue",
            openicon : "ace-icon fa fa-chevron-right center orange"
        },
        //for this example we are using local data
        subGridRowExpanded: function (subgridDivId, rowId) {
            var subgridTableId = subgridDivId + "_t";
            $("#" + subgridDivId).html("<table id='" + subgridTableId + "'></table>");
            $("#" + subgridTableId).jqGrid({
                datatype: 'local',
                data: subgrid_data,
                colNames: ['No','Item Name','Qty'],
                colModel: [
                    { name: 'id', width: 50 },
                    { name: 'name', width: 150 },
                    { name: 'qty', width: 50 }
                ]
            });
        },



        url: 'assetstockinSelect',
        editurl: 'assetstockinEdit',
        colNames: ['入库信息主键','资产主键','资产编号','入库单号', '资产创建日期', '资产名', '入库创建人', '入库说明'],//['入库单号', '入库日期', '资产名','购买时间','创建人','说明']
        colModel: [
            {name: 'stockInInfoList.stockInInfoId', index: 'stockInInfoList.stockInInfoId', width: 100, sortable: true, key:true, hidden:true}
            ,{name: 'assetList.assetId', index: 'assetList.assetId', width: 100, sortable: true, hidden:true}
            ,{name: 'assetList.assetNo', index: 'assetList.assetNo', width: 100, sortable: true, align:"left", editable:true
                ,edittype:"select",editoptions:select_options
            }
            ,{name: 'stockInList.stockInNo', index: 'stockInList.stockInNo', width: 100, sortable: true, align:"left", editable:true}
            ,{name: 'assetList.assetCreateDate', index: 'assetList.assetCreateDate', width: 100, sortable: true, align:"left", editable:false,
                editoptions:date_options,editrules:{required:true, date:true}
                ,formatter:'date',formatoptions:{srcformat:'Y-m-d H:i:s', newformat:'Y-m-d'}}
            ,{name: 'assetList.assetName', index: 'assetList.assetName', width: 100, sortable: true, align:"left", editable:false,
                editrules:{required:true}}
            ,{name: 'stockInList.stockInCreateMan', index: 'stockInList.stockInCreateMan', width: 100, sortable: true, align:"left", editable:true}
            ,{name: 'stockInList.stockInExplainInfo', index: 'stockInList.stockInExplainInfo', width: 100, sortable: true, align:"left", editable:true
                ,edittype:"textarea", editoptions:{rows:"2",cols:"20"}}
        ],
        jsonReader : {
            page: "currentpage",
            total: "totalpage",
            records: "records",
            root: "rows",     //返回数据
            userdata: "userdata" //其他参数
        },
        caption: "数据列表", //表格名称
        sortname: 'stockInInfoList.stockInInfoId',
        sortorder: "desc",
        //@CodeGen end
        pager: '#pager',
        rowNum: 10,
        rowList: [10, 20, 30, 50],
        viewrecords: true, //总记录数
        multiselect: true, //多选
        autowidth: true,
        hidegrid: false,
        autoencode: true,
        mtype: 'POST',
        datatype: "json",
        height: 250,

        loadComplete : function() {
            var table = this;
            setTimeout(function(){
                styleCheckbox(table);

                updateActionIcons(table);
                updatePagerIcons(table);
                enableTooltips(table);
            }, 0);
        }

    });
    $(window).triggerHandler('resize.jqGrid');//trigger window resize to make the grid get the correct size

    var add_options={
        addCaption: "添加信息",
        bSubmit: "添加",
        bCancel: "关闭",
        closeAfterAdd:true,
        reloadAfterSubmit:true,
        forceSync:true,
        closeOnEscape:true,
//            beforeSubmit:function(postdata, formid) {
//                if (postdata['no'] == "") {  //验证客户编号不能为空
//                    return[false, "客户编号不能为空" ]
//                }
//            },
        afterSubmit: function (response, postdata) {
            var json = response.responseText;
            var result = eval("(" + json + ")"), success = false;
            if ("success" == result.editResponse.status) {
                success = true;
            }
            return [success, result.editResponse.message, ""];
        },
        recreateForm: true,
        beforeShowForm : function(e) {
            var form = $(e[0]);
            form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
            style_edit_form(form);
        }
        //success:onSuccess,  // post-submit callback,
    };

    var edit_options={
        addCaption: "添加信息",
        editCaption: "修改信息",
        bSubmit: "修改",
        bCancel: "关闭",
        closeAfterEdit:true,
        reloadAfterSubmit:true,
        forceSync:true,
        closeOnEscape:true,
        afterSubmit: function (response, postdata) {
            var json = response.responseText;
            var result = eval("(" + json + ")"), success = false;
            if ("success" == result.editResponse.status) {
                success = true;
            }
            return [success, result.editResponse.message, ""];
        },
        recreateForm: true,
        beforeShowForm : function(e) {
            var form = $(e[0]);
            form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
            style_edit_form(form);
        }
        //success:onSuccess,  // post-submit callback,
    };

    var del_options={
        caption: "删除信息",
        msg: "确定删除选定项?",
        bSubmit: "删除",
        bCancel: "取消",
        jqModal:false,
        reloadAfterSubmit:false,
        forceSync:true,
        closeOnEscape:true,
        afterSubmit: function (response, postdata) {
            var json = response.responseText;
            var result = eval("(" + json + ")"), success = false;
            if ("success" == result.editResponse.status) {
                success = true;
            }
            return [success, result.editResponse.message, ""];
        },
        recreateForm: true,
        beforeShowForm : function(e) {
            var form = $(e[0]);
            form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
            style_edit_form(form);
        }
    }

//    $("#tableList").jqGrid('navGrid', '#pager',
//            {search: false, edit: true, add: true, del: true,
//                alertcap: "操作错误",
//                alerttext: "请选择行" }, //options
//            edit_options,// edit options
//            add_options,// add options
//            del_options, // del options
//            {closeOnEscape:true}, // search options
//            {height:250,jqModal:false,closeOnEscape:true} // view options
//    );



    //enable search/filter toolbar
    //jQuery(grid_selector).jqGrid('filterToolbar',{defaultSearch:true,stringResult:true})
    //jQuery(grid_selector).filterToolbar({});


    //switch element when editing inline
    function aceSwitch( cellvalue, options, cell ) {
        setTimeout(function(){
            $(cell) .find('input[type=checkbox]')
                    .addClass('ace ace-switch ace-switch-5')
                    .after('<span class="lbl"></span>');
        }, 0);
    }
    //enable datepicker
    function pickDate( cellvalue, options, cell ) {
        setTimeout(function(){
            $(cell) .find('input[type=text]')
                    .datepicker({format:'yyyy-mm-dd' , autoclose:true});
        }, 0);
    }


    //navButtons
    jQuery(grid_selector).jqGrid('navGrid',pager_selector,
            { 	//navbar options
                edit: true,
                editicon : 'ace-icon fa fa-pencil blue',
                add: true,
                addicon : 'ace-icon fa fa-plus-circle purple',
                del: true,
                delicon : 'ace-icon fa fa-trash-o red',
                search: false,
                searchicon : 'ace-icon fa fa-search orange',
                refresh: true,
                refreshicon : 'ace-icon fa fa-refresh green',
                view: true,
                viewicon : 'ace-icon fa fa-search-plus grey'
            },
            edit_options,// edit options
            add_options,// add options
            del_options, // del options
            {
                //search form
                recreateForm: true,
                afterShowSearch: function(e){
                    var form = $(e[0]);
                    form.closest('.ui-jqdialog').find('.ui-jqdialog-title').wrap('<div class="widget-header" />')
                    style_search_form(form);
                },
                afterRedraw: function(){
                    style_search_filters($(this));
                }
                ,
                multipleSearch: true
                /**
                 multipleGroup:true,
                 showQuery: true
                 */
            },
            {
                //view record form
                recreateForm: true,
                beforeShowForm: function(e){
                    var form = $(e[0]);
                    form.closest('.ui-jqdialog').find('.ui-jqdialog-title').wrap('<div class="widget-header" />')
                }
            }
    )



    function style_edit_form(form) {
        //enable datepicker on "sdate" field and switches for "stock" field
        form.find('input[name=sdate]').datepicker({format:'yyyy-mm-dd' , autoclose:true})

        form.find('input[name=stock]').addClass('ace ace-switch ace-switch-5').after('<span class="lbl"></span>');
        //don't wrap inside a label element, the checkbox value won't be submitted (POST'ed)
        //.addClass('ace ace-switch ace-switch-5').wrap('<label class="inline" />').after('<span class="lbl"></span>');


        //update buttons classes
        var buttons = form.next().find('.EditButton .fm-button');
        buttons.addClass('btn btn-sm').find('[class*="-icon"]').hide();//ui-icon, s-icon
        buttons.eq(0).addClass('btn-primary').prepend('<i class="ace-icon fa fa-check"></i>');
        buttons.eq(1).prepend('<i class="ace-icon fa fa-times"></i>')

        buttons = form.next().find('.navButton a');
        buttons.find('.ui-icon').hide();
        buttons.eq(0).append('<i class="ace-icon fa fa-chevron-left"></i>');
        buttons.eq(1).append('<i class="ace-icon fa fa-chevron-right"></i>');
    }

    function style_delete_form(form) {
        var buttons = form.next().find('.EditButton .fm-button');
        buttons.addClass('btn btn-sm btn-white btn-round').find('[class*="-icon"]').hide();//ui-icon, s-icon
        buttons.eq(0).addClass('btn-danger').prepend('<i class="ace-icon fa fa-trash-o"></i>');
        buttons.eq(1).addClass('btn-default').prepend('<i class="ace-icon fa fa-times"></i>')
    }

    function style_search_filters(form) {
        form.find('.delete-rule').val('X');
        form.find('.add-rule').addClass('btn btn-xs btn-primary');
        form.find('.add-group').addClass('btn btn-xs btn-success');
        form.find('.delete-group').addClass('btn btn-xs btn-danger');
    }
    function style_search_form(form) {
        var dialog = form.closest('.ui-jqdialog');
        var buttons = dialog.find('.EditTable')
        buttons.find('.EditButton a[id*="_reset"]').addClass('btn btn-sm btn-info').find('.ui-icon').attr('class', 'ace-icon fa fa-retweet');
        buttons.find('.EditButton a[id*="_query"]').addClass('btn btn-sm btn-inverse').find('.ui-icon').attr('class', 'ace-icon fa fa-comment-o');
        buttons.find('.EditButton a[id*="_search"]').addClass('btn btn-sm btn-purple').find('.ui-icon').attr('class', 'ace-icon fa fa-search');
    }

    function beforeDeleteCallback(e) {
        var form = $(e[0]);
        if(form.data('styled')) return false;

        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
        style_delete_form(form);

        form.data('styled', true);
    }

    function beforeEditCallback(e) {
        var form = $(e[0]);
        form.closest('.ui-jqdialog').find('.ui-jqdialog-titlebar').wrapInner('<div class="widget-header" />')
        style_edit_form(form);
    }



    //it causes some flicker when reloading or navigating grid
    //it may be possible to have some custom formatter to do this as the grid is being created to prevent this
    //or go back to default browser checkbox styles for the grid
    function styleCheckbox(table) {
        /**
         $(table).find('input:checkbox').addClass('ace')
         .wrap('<label />')
         .after('<span class="lbl align-top" />')


         $('.ui-jqgrid-labels th[id*="_cb"]:first-child')
         .find('input.cbox[type=checkbox]').addClass('ace')
         .wrap('<label />').after('<span class="lbl align-top" />');
         */
    }


    //unlike navButtons icons, action icons in rows seem to be hard-coded
    //you can change them like this in here if you want
    function updateActionIcons(table) {
        /**
         var replacement =
         {
             'ui-ace-icon fa fa-pencil' : 'ace-icon fa fa-pencil blue',
             'ui-ace-icon fa fa-trash-o' : 'ace-icon fa fa-trash-o red',
             'ui-icon-disk' : 'ace-icon fa fa-check green',
             'ui-icon-cancel' : 'ace-icon fa fa-times red'
         };
         $(table).find('.ui-pg-div span.ui-icon').each(function(){
						var icon = $(this);
						var $class = $.trim(icon.attr('class').replace('ui-icon', ''));
						if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
					})
         */
    }

    //replace icons with FontAwesome icons like above
    function updatePagerIcons(table) {
        var replacement =
        {
            'ui-icon-seek-first' : 'ace-icon fa fa-angle-double-left bigger-140',
            'ui-icon-seek-prev' : 'ace-icon fa fa-angle-left bigger-140',
            'ui-icon-seek-next' : 'ace-icon fa fa-angle-right bigger-140',
            'ui-icon-seek-end' : 'ace-icon fa fa-angle-double-right bigger-140'
        };
        $('.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon').each(function(){
            var icon = $(this);
            var $class = $.trim(icon.attr('class').replace('ui-icon', ''));

            if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
        })
    }

    function enableTooltips(table) {
        $('.navtable .ui-pg-button').tooltip({container:'body'});
        $(table).find('.ui-pg-div').tooltip({container:'body'});
    }

    //var selr = jQuery(grid_selector).jqGrid('getGridParam','selrow');

    $(document).one('ajaxloadstart.page', function(e) {
        $(grid_selector).jqGrid('GridUnload');
        $('.ui-jqdialog').remove();
    });


});
function gridReload(){
    //@CodeGen begin
    var var1 = $("#search_assetNo").val();
    var var2 = $("#search_assetName").val();
    var var3 = $("#search_beginDate").val();
    var var4 = $("#search_endDate").val();
    var startdate=new Date(($("#search_beginDate").val()).replace(/-/g,"/"));
    var enddate=new Date(($("#search_endDate").val()).replace(/-/g,"/"));
    if(startdate > enddate)
    {
        alert("起始日期不得大于截止日期！");
        $("#search_endDate").val("");
        return false;
    }
    else
    {
        $("#tableList").jqGrid('setGridParam',{url:"assetstockinSelect?assetNo="+var1+"&assetName="+var2+"&search_startDate="+var3+"&search_endDate="+var4 , page:1}).trigger("reloadGrid");
    }
    //@CodeGen end
}

</script>

<!-- the following scripts are used in demo only for onpage help and you don't need them -->
<link rel="stylesheet" href="assets/css/ace.onpage-help.css" />

<script type="text/javascript"> ace.vars['base'] = '..'; </script>
<script src="assets/js/ace/elements.onpage-help.js"></script>
<script src="assets/js/ace/ace.onpage-help.js"></script>

</body>
</html>
