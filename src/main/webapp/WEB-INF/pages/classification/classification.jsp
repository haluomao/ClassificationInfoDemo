﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
          pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>资产管理系统</title>

    <link rel="stylesheet" type="text/css" href="common/css/jquery-ui.css">
    <link rel="stylesheet" type="text/css" href="common/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" media="screen" href="common/css/font_awesome/css/font-awesome.css"/>
    <%--<link rel="stylesheet" type="text/css" media="screen" href="common/css/jquery-ui.theme.css" />--%>
    <link rel="stylesheet" type="text/css" media="screen" href="common/css/ui.jqgrid.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="common/css/searchFilter.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="common/css/ui.multiselect.css" />

    <%--<link rel="stylesheet" type="text/css" media="screen" href="classification/css/main.css"/>--%>

</head>

<body style="overflow:auto; background-color:#FAFAFA">
<!-- header -->
<div class="header">
    <nav class="navbar navbar-default" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#"><img src="common/images/logo.png" height="24px" padding-left="3px" width="auto"></a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">张三<b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">修改密码</a></li>
                            <li class="divider"></li>
                            <li><a href="#">注销</a></li>
                        </ul>
                    </li>
                    <li><a href="#">未读消息<span class="badge">5</span></a></li>
                </ul>
                <ul class="nav navbar-nav navbar-right">
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="检索">
                        </div>
                        <button type="submit" class="btn btn-default hidden">Submit</button>
                    </form>
                </ul>
            </div>
        </div>
    </nav>
</div>

<!-- container -->
<div class="container">
    <div class="panel panel-default">
        <div class="panel-heading">
        <div class="row">
            <div class="col-lg-12">
                <i class="fa fa-list-alt fa-lg fa-fw"></i><span style="color:#999999;font-size:12px;">&nbsp;检索条件</span>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <form class="navbar-form navbar-left" role="search_list">
                        <div class="form-group">
                            资产名称:
                            <input type="text" class="form-control" placeholder="资产名称" name="className" id="search_className">
                            &nbsp;
                            &nbsp;
                            创建人:
                            <input type="text" class="form-control" placeholder="创建人" name="createMan" id="search_createMan">
                            &nbsp;
                            &nbsp;
                            <div id="compareDate">创建日期：</div>
                            <%--创建日期：<input type='text' class="form-control" placeholder="起始日期" name="startDate" id="search_startDate"/>---%>
                            <%--<input type='text' class="form-control" placeholder="结束日期" name="endDate" id="search_endDate" />--%>
                            &nbsp;
                            &nbsp;
                            &nbsp;
                            &nbsp;
                            <%--<button type="submit" class="btn btn-default hidden">Submit</button>--%>
                            <div class="btn-group">
                                <button type="button" class="btn btn-success" onclick="gridReload()">检索</button>
                                <button type="reset" class="btn btn-primary">重置</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="col-lg-12">&nbsp;</div>
         </div>
        </div>

        <div class="panel-body">
            <table class="table" id="tableList"></table>
            <div id="pager"></div>
                <%--<table class="table">--%>
                    <%--<tr>--%>
                        <%--<th><input type="checkbox"/></th>--%>
                        <%--<th>审核状态</th>--%>
                        <%--<th>标题</th>--%>
                        <%--<th>作者</th>--%>
                        <%--<th>创建时间</th>--%>
                        <%--<th>详情</th>--%>
                    <%--</tr>--%>
                    <%--<tr>--%>
                        <%--<td><input type="checkbox"/></td>--%>
                        <%--<td><span class="label label-success">已通过</span></td>--%>
                        <%--<td><a href="#">虎式真是太强了，应该削弱</a></td>--%>
                        <%--<td><a href="#">王者祝福</a></td>--%>
                        <%--<td>2013年12月18日 10:52</td>--%>
                        <%--<td>--%>
                            <%--<a class="detail-link" data-toggle="collapse" data-parent="#accordion" href="#collapse8">--%>
                                <%--<span class="glyphicon glyphicon-chevron-down"></span>--%>
                            <%--</a>--%>
                        <%--</td>--%>
                    <%--</tr>--%>
                    <%--<tr id="collapse8" class="collapse">--%>
                        <%--<td colspan="10">--%>
                        <%--</td>--%>
                    <%--</tr>--%>
                <%--</table>--%>
        </div>
    </div>
</div>
<!-- footer -->
<div class="footer">
    <div class="panel-footer">
        <div class="container">
            <a href="#"><span style="color:#777777;"><i class="fa fa-at"></i>&nbsp;CancoSoft. All Right Reserved</span></a>
        </div>
    </div>
</div>


<script src="common/js/jquery-2.1.1.min.js"></script>
<script src="common/js/jquery-ui.min.js"></script>
<script src="common/js/bootstrap.min.js"></script>

<script src="common/js/i18n/grid.locale-en.js" type="text/javascript"></script>
<script src="common/js/jquery.jqGrid.min.js"></script>

<script src="common/js/ui.multiselect.js"></script>
<script src="common/js/jquery.searchFilter.js"></script>
<script src="common/js/jquery.tablednd.js"></script>

<script src="common/js/AjaxUtil.js"></script>
<script src="common/js/cancojs.js"></script>
<%--<script src="classification/js/stickUp.min.js"></script>--%>
<script>
    $(function() {
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


        $("#tableList").jqGrid({
            //@CodeGen begin
            url: 'classListSelectM',
            editurl: 'classListEdit',
            colNames: ['ID', '资产名','状态名','创建人','创建日期'],
            colModel: [
                {name: 'classId', index: 'classId', width: 100, sortable: true, key:true, hidden:true},
                {name: 'className', index: 'className', width: 200, sortable: true, align:"left", editable:true,
                    editrules:{required:true}},
                {name: 'defaultStatName', index: 'defaultStatName', width: 200, sortable: true, align:"left", editable:true,
                    editrules:{required:true}},
                {name: 'createMan', index: 'createMan', width: 200, sortable: true, align:"left", editable:true,
                    editrules:{required:true}},
                {name: 'createDate', index: 'createDate', width: 200, sortable: true, align: "left", editable: false,
                    editoptions:date_options,editrules:{required:true, date:true},
                    formatter:'date',formatoptions:{srcformat:'Y-m-d H:i:s', newformat:'Y-m-d'}}
            ],
            jsonReader : {
                page: "currentpage",
                total: "totalpage",
                records: "records",
                root: "rows",     //返回数据
                userdata: "userdata" //其他参数
            },
            caption: "数据列表", //表格名称
            sortname: 'classId',
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
            height: '300px'
        });



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
            }
        }

        $("#tableList").jqGrid('navGrid', '#pager',
                {search: false, edit: true, add: true, del: true,
                    alertcap: "操作错误",
                    alerttext: "请选择行" }, //options
                edit_options,// edit options
                add_options,// add options
                del_options, // del options
                {closeOnEscape:true}, // search options
                {height:250,jqModal:false,closeOnEscape:true} // view options
        );

        $(window).resize(function() {
            $("#tableList").setGridWidth($("body .container").width()-40);
            $("#ui-datepicker-div").css("left",$("#compareDate").offset().left);
        });

//        $("#search_startDate").datepicker({dateFormat:'yy-mm-dd'});
//        $("#search_endDate").datepicker({dateFormat:'yy-mm-dd'});
    });

    var timeoutHnd;
    var flAuto = false;

    function doSearch(ev){
        if(!flAuto)
            return;
        if(timeoutHnd)
            clearTimeout(timeoutHnd);
        timeoutHnd = setTimeout(gridReload,500);
    }

    function gridReload(){
        //@CodeGen begin
        var var1 = $("#search_className").val();
        var var2 = $("#search_createMan").val();
        if (dateCompare() == true)
        {
            var var3 = $("#search_startDate").val();
            var var4 = $("#search_endDate").val();
            $("#tableList").jqGrid('setGridParam',{url:"classListSelectM?className="+var1+"&createMan="+var2+"&search_startDate="+var3+"&search_endDate="+var4 , page:1}).trigger("reloadGrid");
        }
        //@CodeGen end
    }
    function enableAutosubmit(state){
        flAuto = state;
        $("#submitButton").attr("disabled",state);
    }

</script>

</body>
</html>