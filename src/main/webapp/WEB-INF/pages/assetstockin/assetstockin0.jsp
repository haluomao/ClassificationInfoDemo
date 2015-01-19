﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
          pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>资产入库</title>

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
                            资产编号:
                            <input type="text" class="form-control" placeholder="资产编号" name="assetNo" id="search_assetNo">
                            &nbsp;
                            &nbsp;
                            资产名称:
                            <input type="text" class="form-control" placeholder="资产名称" name="assetName" id="search_assetName">
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
        </div>

        <!-- 数据列表 -->
        <div class="panel-body">
            <table class="table" id="tableList"></table>
            <div id="pager"></div>
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

<script id="locale" src="common/js/i18n/grid.locale-en.js" type="text/javascript"></script>
<script src="common/js/jquery.jqGrid.min.js"></script>

<script src="common/js/ui.multiselect.js"></script>
<script src="common/js/jquery.searchFilter.js"></script>
<script src="common/js/jquery.tablednd.js"></script>

<script src="common/js/AjaxUtil.js"></script>
<script src="common/js/cancojs.js"></script>
<script>
var cartGoods=[];
var rowDataIds=[];
    $(function() {
//        if((screen.width==1024)&&(screen.height==768)){
//            document.getElementById("locale").src="common/js/i18n/grid.locale-cn.js"; //判断分辨率是1024x768调用default1.css
//        }else document.getElementById("locale").src="common/js/i18n/grid.locale-en.js"; //判断分辨率是1024x768调用default1.css

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

        $("#tableList").jqGrid({
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
            sortorder: "asc",
            onSelectRow: updateCart,
            loadComplete: updateSelection,
            onSelectAll:updateCartAll,
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

            afterSubmit: function (response, postdata) {
                var json = response.responseText;
                var result = eval("(" + json + ")"), success = false;
                if ("success" == result.editResponse.status) {
                    success = true;
                    clearCart();
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
                    clearCart();
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
                    clearCart();
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
            //document.getElementById("locale").src="common/js/i18n/grid.locale-cn.js";//ok
        });

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
        var var1 = $("#search_assetNo").val();
        var var2 = $("#search_assetName").val();
        if (dateCompare() == true)
        {
            var var3 = $("#search_startDate").val();
            var var4 = $("#search_endDate").val();
            $("#tableList").jqGrid('setGridParam',{url:"assetstockinSelect?assetNo="+var1+"&assetName="+var2+"&search_startDate="+var3+"&search_endDate="+var4 , page:1}).trigger("reloadGrid");
        }
        //@CodeGen end
    }
    function enableAutosubmit(state){
        flAuto = state;
        $("#submitButton").attr("disabled",state);
    }

    $(document).ready(function () {
        dropdownOpen();
    });

    function dropdownOpen() {
        var $dropdownLi = $('div.dropdown');

        $dropdownLi.mouseover(function () {
            $(this).addClass('open');
        }).mouseout(function () {
            $(this).removeClass('open');
        });
    }

</script>

</body>
</html>