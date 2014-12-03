﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
          pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Classification Information </title>
    <link rel="stylesheet" href="common/css/bootstrap.min.css">
    <link type="text/css" href="common/css/jquery-ui.css" rel="stylesheet">
    <%--<link rel="stylesheet" type="text/css" media="screen" href="common/css/jquery-ui.theme.css" />--%>
    <link rel="stylesheet" type="text/css" media="screen" href="common/css/ui.jqgrid.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="common/css/searchFilter.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="common/css/ui.multiselect.css" />
    <style>
        body,html {
            margin: 0;
            padding: 0;
            height:100%;
        }
        #content {
            min-height:100%;
            position: relative;
        }
        #main {
            position: absolute;
            top: 1px;
            bottom: 100px;
            padding: 10px 0;
            width: 100%;
        }
        #footer {
            position: absolute;
            bottom: 1px;
            padding: 10px 0;
            width: 100%;
            text-align: center;
        }
    </style>
</head>

<body style="overflow:auto; background-color:#FAFAFA">
<div id="content">
    <div id="main">
        <!-- User information part -->
        <div id="userinfo">
            <div style="height:10px;"></div>
            <div id="welcome" class="container-fluid">
                <div class="row">
                    <div class="col-md-5 col-md-offset-1"><span>您好，${user.username}|</span>
                        <a href="#">注销</a></div>
                    <div class="col-md-2 col-md-offset-4">
                        <a href="#">帮助中心</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- Banner Part including logo and global search bar. -->
        <div id="banner" class="container-fluid">
            <br>
            <div class="row">
                <div class="col-md-5 col-md-offset-1">
                    <img id="logo_img" src="common/images/logo.png" width="100px"/>
                    <span style="font-weight:700;">佳克实物资产管理软件 V8.0</span>
                </div>
                <div class="col-md-4 col-md-offset-2">
                    <div style="height:80px;"></div>
                    <input id="search_input" type="text"  placeholder="搜索"/>
                    <a href="#"><img id="search_img" src="classification/images/sbutton.png" height="26px"/></a>
                </div>
            </div>
        </div>

        <div id="searchDiv" class="container-fluid">
            <br>
            <br>
            <div class="row"><div class="col-md-10 col-md-offset-1"><label>检索条件</label></div></div>
            <div class="row">
                <div class="col-md-11 col-md-offset-1">
                    资产分类：<input type="text" name="className" id="search_className" />
                    保管人：<input type="text" name="createMan" id="search_createMan" />
                    创建日期：<input type='text' name="startDate" id="search_startDate"  />-
                    <input type='text' name="endDate" id="search_endDate" />
                    <button type="button" onclick="gridReload()">搜索</button>
                    <br><br>
                </div>
                </form>
            </div>
        </div>

        <!-- 列表 begin -->
        <div id="resultDiv" class="container-fluid">
            <div class="col-md-10 col-md-offset-1">
                <table id="tableList"></table>
                <div id="pager"></div>
            </div>
        </div>
        <!-- 列表 end -->
    </div>

    <div id="footer">
        <span>关于佳克 | 版权说明 | asset365 | R2</span><br/>
        <span>Copyright @1997-2011上海佳克计算机软件有限公司  版权所有</span>
    </div>

</div>

<script src="common/js/jquery-2.1.1.min.js"></script>
<script src="common/js/jquery-ui.js"></script>
<script src="common/js/bootstrap.min.js"></script>

<script src="common/js/i18n/grid.locale-en.js" type="text/javascript"></script>
<script src="common/js/jquery.jqGrid.min.js"></script>

<script src="common/js/ui.multiselect.js"></script>
<script src="common/js/jquery.searchFilter.js"></script>
<script src="common/js/jquery.tablednd.js"></script>

<script src="common/js/AjaxUtil.js"></script>
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
                {name: 'createDate', index: 'createDate', width: 200, sortable: true, align: "left", editable: true,
                    editoptions:date_options,editrules:{required:true, time:true},
                    formatter:'date',formatoptions:{srcformat:'Y-m-d H:i:s', newformat:'Y-m-d H:i'}}
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
            beforeSubmit:function(postdata, formid) {
                if (postdata['no'] == "") {  //验证客户编号不能为空
                    return[false, "客户编号不能为空" ]
                }
            },
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
            $("#tableList").setGridWidth($(window).width() * 0.80);
        });

        $("#search_startDate").datepicker({dateFormat:'yy-mm-dd'});
        $("#search_endDate").datepicker({dateFormat:'yy-mm-dd'});
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

    function dateCompare(){
        var startdate=new Date(($("#search_startDate").val()).replace(/-/g,"/"));
        var enddate=new Date(($("#search_endDate").val()).replace(/-/g,"/"));
        var date = new Date();
        if(startdate > enddate)
        {
            alert("起始日期不得大于截止日期！");
            return false;
        }
        else
            return true;
    }
</script>

</body>
</html>