﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title> Classification Information </title>

    <link rel="stylesheet" type="text/css" media="screen" href="css/font-awesome.min.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-production.css">
    <link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-skins.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link type="text/css" href="css/jquery-ui.css" rel="stylesheet">

    <style>

    </style>
</head>

<body style="overflow:auto; background-color:#FAFAFA">
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
            <img id="logo_img" src="images/logo.png" width="100px"/>
            <span style="font-weight:700;">佳克实物资产管理软件 V8.0</span>
        </div>
        <div class="col-md-4 col-md-offset-2">
            <div style="height:80px;"></div>
            <input id="search_input" type="text"  placeholder="搜索"/>
            <a href="#"><img id="search_img" src="images/sbutton.png" height="26px"/></a>
        </div>
    </div>
</div>

<div id="searchDiv" class="container-fluid">
    <br>
    <br>
    <div class="row"><div class="col-md-10 col-md-offset-1"><label>检索条件</label></div></div>
    <div class="row">
        <form method="post" action="classListSearchNormalAction">
            <div class="col-md-11 col-md-offset-1">
                资产分类：<input type="text" name="className" id="className" value='<c:if test="${null!=classListFormBean}">${classListFormBean.className}</c:if>'/>
                保管人：<input type="text" name="createMan" id="createMan" />
                <button type="submit">检索</button>
                <button type="button" onclick="classListSearch('classListSearchAction', 1)">Ajax检索</button>
                <br><br>
            </div>
        </form>
    </div>
</div>

<div id="resultDiv" class="container-fluid">
    <div class="col-md-10 col-md-offset-1">
        <div class="jarviswidget jarviswidget-color-blueDark jarviswidget-sortable" id="wid-id-3" data-widget-editbutton="false" role="widget" style="position: relative; opacity: 1;">

            <header role="heading"><div class="jarviswidget-ctrls" role="menu">
                <a href="#" class="button-icon jarviswidget-toggle-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Collapse"><i class="fa fa-minus "></i></a>
                <a href="javascript:void(0);" class="button-icon jarviswidget-fullscreen-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Fullscreen">
                    <i class="fa fa-resize-full "></i></a>
                <a href="javascript:void(0);" class="button-icon jarviswidget-delete-btn" rel="tooltip" title="" data-placement="bottom" data-original-title="Delete"><i class="fa fa-times"></i></a></div>
                <div class="widget-toolbar" role="menu"><a data-toggle="dropdown" class="dropdown-toggle color-box selector" href="javascript:void(0);"></a>
                    <ul class="dropdown-menu arrow-box-up-right color-select pull-right">
                        <li><span class="bg-color-green" data-widget-setstyle="jarviswidget-color-green" rel="tooltip" data-placement="left" data-original-title="Green Grass"></span></li>
                        <li><span class="bg-color-greenDark" data-widget-setstyle="jarviswidget-color-greenDark" rel="tooltip" data-placement="top" data-original-title="Dark Green"></span></li>
                        <li><span class="bg-color-greenLight" data-widget-setstyle="jarviswidget-color-greenLight" rel="tooltip" data-placement="top" data-original-title="Light Green"></span></li>
                        <li><span class="bg-color-purple" data-widget-setstyle="jarviswidget-color-purple" rel="tooltip" data-placement="top" data-original-title="Purple"></span></li>
                        <li><span class="bg-color-magenta" data-widget-setstyle="jarviswidget-color-magenta" rel="tooltip" data-placement="top" data-original-title="Magenta"></span></li>
                        <li><span class="bg-color-pink" data-widget-setstyle="jarviswidget-color-pink" rel="tooltip" data-placement="right" data-original-title="Pink"></span></li>
                        <li><span class="bg-color-pinkDark" data-widget-setstyle="jarviswidget-color-pinkDark" rel="tooltip" data-placement="left" data-original-title="Fade Pink"></span></li>
                        <li><span class="bg-color-blueLight" data-widget-setstyle="jarviswidget-color-blueLight" rel="tooltip" data-placement="top" data-original-title="Light Blue"></span></li>
                        <li><span class="bg-color-teal" data-widget-setstyle="jarviswidget-color-teal" rel="tooltip" data-placement="top" data-original-title="Teal"></span></li>
                        <li><span class="bg-color-blue" data-widget-setstyle="jarviswidget-color-blue" rel="tooltip" data-placement="top" data-original-title="Ocean Blue"></span></li>
                        <li><span class="bg-color-blueDark" data-widget-setstyle="jarviswidget-color-blueDark" rel="tooltip" data-placement="top" data-original-title="Night Sky"></span></li>
                        <li><span class="bg-color-darken" data-widget-setstyle="jarviswidget-color-darken" rel="tooltip" data-placement="right" data-original-title="Night"></span></li>
                        <li><span class="bg-color-yellow" data-widget-setstyle="jarviswidget-color-yellow" rel="tooltip" data-placement="left" data-original-title="Day Light"></span></li><li><span class="bg-color-orange" data-widget-setstyle="jarviswidget-color-orange" rel="tooltip" data-placement="bottom" data-original-title="Orange"></span></li>
                        <li><span class="bg-color-orangeDark" data-widget-setstyle="jarviswidget-color-orangeDark" rel="tooltip" data-placement="bottom" data-original-title="Dark Orange"></span></li><li><span class="bg-color-red" data-widget-setstyle="jarviswidget-color-red" rel="tooltip" data-placement="bottom" data-original-title="Red Rose"></span></li>
                        <li><span class="bg-color-redLight" data-widget-setstyle="jarviswidget-color-redLight" rel="tooltip" data-placement="bottom" data-original-title="Light Red"></span></li>
                        <li><span class="bg-color-white" data-widget-setstyle="jarviswidget-color-white" rel="tooltip" data-placement="right" data-original-title="Purity"></span></li>
                        <li><a href="javascript:void(0);" class="jarviswidget-remove-colors" data-widget-setstyle="" rel="tooltip" data-placement="bottom" data-original-title="Reset widget color to default">Remove</a></li></ul></div>
                <span class="widget-icon"> <i class="fa fa-table"></i> </span>
                <h2>Result List</h2>

                <span class="jarviswidget-loader"><i class="fa fa-refresh fa-spin"></i></span></header>

            <!-- widget div-->
            <div role="content">

                <!-- widget edit box -->
                <div class="jarviswidget-editbox">
                    <!-- This area used as dropdown edit box -->

                </div>
                <!-- end widget edit box -->

                <!-- widget content -->
                <div class="widget-body no-padding">
                    <div class="widget-body-toolbar">

                    </div>
                    <div id="datatable_tabletools_wrapper" class="dataTables_wrapper form-inline" role="grid"><div class="dt-top-row"><div class="DTTT btn-group">
                        <button type="button" class="btn btn-default btn-sm DTTT_button_copy" data-toggle="modal" data-target="#addDiv">新增</button>
                        <a class="btn btn-default btn-sm DTTT_button_copy" id="ToolTables_datatable_tabletools_0"
						data-toggle="modal" data-target=".bs-example-modal-lg">
						<span>Copy</span>
                            <div style="position: absolute; left: 0px; top: 0px; width: 50px; height: 31px; z-index: 99;">
                                <embed id="ZeroClipboard_TableToolsMovie_5" src="js/plugin/datatables/media/swf/copy_csv_xls_pdf.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="50" height="31" name="ZeroClipboard_TableToolsMovie_5" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=5&amp;width=50&amp;height=31" wmode="transparent"></div></a>
                        <a class="btn btn-default btn-sm DTTT_button_print" id="ToolTables_datatable_tabletools_1" title="View print view"><span>Print</span></a>
                        <a class="btn btn-default btn-sm DTTT_button_collection" id="ToolTables_datatable_tabletools_2"><span>Save <span class="caret"></span></span></a></div>
                        <!---->
                        <div id="datatable_tabletools_length" class="dataTables_length"><span class="smart-form">
                                <label class="select" style="width:60px">
                                    <select size="1" name="datatable_tabletools_length" aria-controls="datatable_tabletools" id="listCount"
                                            onchange="classListSearch('classListSearchAction',1)">
                                            <%--onchange="countSelect('pageUpdateAction', ${pageBean.currentPage}, ${pageBean.totalPages}, ${pageBean.listCount}, ${pageBean.cacheBegin})">--%>
                                        <%--onchange="countSelect('pageUpdateAction', '${pageBean.currentPage}', '${pageBean.totalPages}', '${pageBean.listCount}', '${pageBean.cacheBegin}')">--%>
                                        <option value="10" selected="selected">10</option>
                                        <option value="25">25</option>
                                        <option value="50">50</option>
                                        <option value="100">100</option>
                                    </select><i></i></label></span></div>
                    </div>
                        <div class="dt-wrapper">
                            <table id="datatable_tabletools" class="table table-striped table-hover dataTable" aria-describedby="datatable_tabletools_info">
                                <thead>
                                <tr role="row">
                                    <th class="sorting_asc" role="columnheader" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-sort="ascending" aria-label="ID: activate to sort column descending" style="width: 53px;">ID</th>
                                    <th class="sorting" role="columnheader" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Name: activate to sort column ascending" style="width: 115px;">Name</th>
                                    <th class="sorting" role="columnheader" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Status: activate to sort column ascending" style="width: 144px;">Status</th>
                                    <th class="sorting" role="columnheader" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Creator: activate to sort column ascending" style="width: 103px;">Creator</th>
                                    <th class="sorting" role="columnheader" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 139px;">SequenceNo</th>
                                    <th class="sorting" role="columnheader" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Operation: activate to sort column ascending" style="width: 80px;">Operation</th>
                                </tr>
                                </thead>

                                <tbody role="alert" aria-live="polite" aria-relevant="all" id="tablebody">
                                <c:forEach items="${objList}" var="obj" varStatus="status">
                                    <c:if test="${status.count<=10}">
                                    <tr class="odd">
                                        <td class=" sorting_1">${obj.classId}</td>
                                        <td class=" ">${obj.className}</td>
                                        <td class=" ">${obj.defaultStatName}</td>
                                        <td class=" ">${obj.createMan}</td>
                                        <td class=" ">${obj.createDate}</td>
                                        <td class=" ">
                                            <button type="button" onclick="classListDelete('classListDeleteAction', ${obj.classId}, 1)">删除</button>
                                            <button type="button" disabled="disabled" onclick="javascript:updateModifyDiv(${obj})"  data-toggle="modal" data-target="#modifyDiv">修改</button>
                                            <%--<a class="btn btn-default btn-sm DTTT_button_copy" data-toggle="modal" data-target="#addDiv" href="classListModify('classListDModifyAction', ${obj})">修改</a>--%>
                                        </td>
                                    </tr>
                                    </c:if>
                                </c:forEach>
                                </tbody>
                            </table></div>
                        <div class="dt-row dt-bottom-row">
                            <div class="row">
                                <div class="col-sm-6">
                                <div class="dataTables_info" id="totalCount">Showing <c:if test="${null!=pageBean}">${pageBean.totalCount}</c:if> entries.</div>
                                </div>
                                <div class="col-sm-6 text-right">
                                    <div class="dataTables_paginate paging_bootstrap">
                                    <ul class="pagination" id="pageNumbers">
                                        <c:if test="${null==pageBean}"><li><a href="#">Empty</a></li></c:if>
                                        <c:if test="${null!= pageBean}">
                                            <li class="prev disabled"><a href="#">Previous</a></li>
                                            <li class="active"><a href='javascript:classListSearch("classListSearchAction",1)'>1</a></li>
                                            <c:if test="${pageBean.totalPages<2}">
                                                <li class="next disabled"><a href='#'>next</a></li>
                                            </c:if>
                                            <c:if test="${pageBean.totalPages==2}">
                                                <li><a href='javascript:classListSearch("classListSearchAction",2)'>2</a></li>
                                                <li class="next"><a href='javascript:classListSearch("classListSearchAction",2)'>next</a></li>
                                            </c:if>
                                            <c:if test="${pageBean.totalPages>2}">
                                                <li><a href='javascript:classListSearch("classListSearchAction",2)'>2</a></li>
                                                <c:if test="${pageBean.totalPages!=3}"><li><a href='#'>...</a></li></c:if>
                                                <li><a href='javascript:classListSearch("classListSearchAction",<c:out value="${pageBean.totalPages}"/>)'><c:out value="${pageBean.totalPages}"/></a></li>
                                                <li class="next"><a href='javascript:classListSearch("classListSearchAction",2)'>next</a></li>
                                            </c:if>

                                        </c:if>
                                    </ul>

                                </div></div></div></div></div>

                </div>
                <!-- end widget content -->

            </div>
            <!-- end widget div -->
        </div>
    </div>
</div>

<!-- add  model div-->
<div id="addDiv" class="modal fade">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title">新增对象</h4>
      </div>

      <div class="modal-body">
		<div class="col-md-11 col-md-offset-1">
            <form method="post" action="classListAddAction">
			资产分类：<input type="text" name="className" class="form-control" placeholder="class name"><br />
			资产状态：<input type="text" name="defaultStatName" class="form-control" placeholder="status"><br />
			保 管 人：<input type="text" name="createMan" class="form-control" placeholder="create man"><br />
            <input type="submit" class="btn btn-primary" data-dismiss="#addDiv"/>
            </form>
			<%--日期：<input type="text" name="date" id="dateAdd" /><br />--%>
			<%--<button type="button" onclick="classListSearch('classListSearchAction', 1)">添加</button>--%>
		</div>
      </div>
        <div class="modal-footer">
            <%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
            <%--<button type="submit" class="btn btn-primary" data-dismiss="modal">添加</button>--%>
                <%--<input type="submit" class="btn btn-primary" data-dismiss="modal">添加</input>--%>
          </div>
	  </div>
  </div>
</div>
<!--end add model div-->
<!-- modify model div-->
<div id="modifyDiv" class="modal fade">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="#modifyDiv"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title">修改对象</h4>
            </div>

            <div class="modal-body">
                <div class="col-md-11 col-md-offset-1">
                    <form method="post" action="classListModifyAction">
                        <input type="hidden" name="classId" id="classIdModify">
                        资产分类：<input type="text" name="className" class="form-control" placeholder="class name" id="classNameModify"><br />
                        资产状态：<input type="text" name="defaultStatName" class="form-control" placeholder="status" id="defaultStatNameModify"><br />
                        保 管 人：<input type="text" name="createMan" class="form-control" placeholder="create man" id="createManModify"><br />
                        <input type="submit" class="btn btn-primary" data-dismiss="#modifyDiv"/>
                    </form>
                    <%--日期：<input type="text" name="date" id="dateAdd" /><br />--%>
                    <%--<button type="button" onclick="classListSearch('classListSearchAction', 1)">添加</button>--%>
                </div>
            </div>
            <div class="modal-footer">
                <%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
                <%--<button type="submit" class="btn btn-primary" data-dismiss="modal">添加</button>--%>
                <%--<input type="submit" class="btn btn-primary" data-dismiss="modal">添加</input>--%>
            </div>
        </div>
    </div>
</div>
<!--end  modify model div-->

<div id="footer" class="container-fluid">
    <div class="row">
        <div class="col-md-3 col-md-offset-5">
            <span>关于佳克 | 版权说明 | asset365 | R2</span><br/>
        </div>
    </div>
    <div class="row">
        <div class="col-md-8 col-md-offset-4">
            <span>Copyright @1997-2011上海佳克计算机软件有限公司  版权所有</span>
        </div>
    </div>
</div>


<script src="js/jquery-ui.js"></script>
<script src="js/jquery-2.1.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/classListAjax.js"></script>
<script>

    function updateModifyDiv(obj){
        alert("here");
        $('#classIdModify').val(obj.classId);
        $('#classNameModify').val(obj.className);
        $('#defaultStatNameModify').val(obj.defaultStatName);
        $('#createManModify').val(obj.createMan);
    }

    //Ajax 局部更新
    function classListSearch(url, currentPage) {

        var classNameAjax_value = $('#className').val();
        var createManAjax_value = $('#createMan').val();
        var listCount = $('#listCount').find('option:selected').val();

        //需要在js端检测是否在cache中？
        //checkInCache();

        createXMLHttpRequest();
        XMLHttpReq.open('POST', url, true);
        XMLHttpReq.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        XMLHttpReq.send("className="+classNameAjax_value
                + "&" + "createMan=" + createManAjax_value
                + "&" + "currentPage=" + currentPage
                + "&" + "listCount=" + listCount
                + "&" + "cacheBegin=" + listCount*(currentPage-1));
        XMLHttpReq.onreadystatechange = processSearchResponse;
    }

    // Update Bottom Page Numbers.
    function updatePageNumbers(pageBean, jsFunc, url, ulObj){
        //clear <ul> content
        ulObj.empty();

        var totalPages = pageBean.totalPages;
        var currentPage = pageBean.currentPage;

        // prev button
        var prev="";
        prev +='<li class="prev';
        if(currentPage<=1){  prev +=' disabled"><a href="#">Previous</a></li>'; }
        else {prev +='"><a href="javascript:'+jsFunc+'(\''+url+'\', '+(currentPage-1)+')">Previous</a></li>';}
        ulObj.append(prev);

        // numbers button
        for(var i=1; i<=totalPages; i++){
            var content="";
            if(currentPage>4 && i<currentPage-1 && i!=1){
                i=currentPage-2;
                content +='<li><a href="#">...</a></li>';
            }
            else if(currentPage+4<totalPages && i>currentPage+1 && i!=totalPages){
                i=totalPages-1;
                content +='<li><a href="#">...</a></li>';
            }else{
                content +='<li';
                if(currentPage==i){  content +=' class="active"'; }
                content +='><a href="javascript:'+jsFunc+'(\''+url+'\', '+i+')">'+i+'</a></li>';
            }
            ulObj.append(content);
        }

        // next button
        var next="";
        next +='<li class="next';
        if(currentPage>=totalPages){ next +=' disabled"><a href="#">Next</a></li>';}
        else{next +='"><a href="javascript:'+jsFunc+'(\''+url+'\', '+(currentPage+1)+')">Next</a></li>';}

        ulObj.append(next);
    }

    //执行获取Json数据后的操作
    function processSearchResponse(){
        if (XMLHttpReq.readyState == 4) {
            if (XMLHttpReq.status == 200) {
                var result = XMLHttpReq.responseText;
                var json = eval("(" + result + ")");

                $('#tablebody').empty();
                for(var i = 0; i < json.classListFormBean.classLists.length; i++)
                {
                    if(i<json.pageBean.listCount){
                        var obj = json.classListFormBean.classLists[i];
                        $('#tablebody').append('<tr class="odd"></tr>');
                        $('#tablebody>tr:last-child').append('<td class=" sorting_1">' + obj.classId + '</td>');
                        $('#tablebody>tr:last-child').append('<td class=" sorting_1">' + obj.className + '</td>');
                        $('#tablebody>tr:last-child').append('<td class=" sorting_1">' + obj.defaultStatName + '</td>');
                        $('#tablebody>tr:last-child').append('<td class=" sorting_1">' + obj.createMan + '</td>');
                        $('#tablebody>tr:last-child').append('<td class=" sorting_1">' + obj.createDate + '</td>');
                        $('#tablebody>tr:last-child').append('<td class=" ">'
                                +'<button type="button" onclick="classListDelete(\'classListDeleteAction\', '+obj.classId+',1)">删除</button>'
                                +'<button type="button" disabled="disabled" onclick="javascript:updateModifyDiv('+obj+')" data-toggle="modal" data-target="#modifyDiv">修改</button>'
                                + '</td>');
                    }
                }

                //Update buttom info
                document.getElementById('totalCount').innerHTML='Showing '+ json.pageBean.totalCount+' entries.';
                updatePageNumbers(json.pageBean, 'classListSearch', 'classListSearchAction', $('#pageNumbers'));
            }
        }
    }
    function classListDelete(url, id, currentPage){
        if(!confirm("确定删除？")) return;
        var classNameAjax_value = $('#className').val();
        var createManAjax_value = $('#createMan').val();
        var listCount = $('#listCount').find('option:selected').val();

        //需要在js端检测是否在cache中？
        //checkInCache();

        createXMLHttpRequest();
        XMLHttpReq.open('POST', url, true);
        XMLHttpReq.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        XMLHttpReq.send("className="+classNameAjax_value
                + "&" + "createMan=" + createManAjax_value
                + "&" + "currentPage=" + currentPage
                + "&" + "listCount=" + listCount
                + "&" + "cacheBegin=" + listCount*(currentPage-1)
                + "&" + "classId=" + id);
        XMLHttpReq.onreadystatechange = processSearchResponse;
    }

    function countSelect(url, currentPage, totalPages, listCount, cacheBegin){
        document.getElementById("ajaxRes").innerHTML="<p>currentPage="+currentPage+"</p>";
        createXMLHttpRequest();
        XMLHttpReq.open('POST', url, true);
        XMLHttpReq.onreadystatechange = processResponseToPage;
        XMLHttpReq.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        XMLHttpReq.send("currentPage="+currentPage+"&totalPages="+totalPages
                +"&listCount="+listCount+"&cacheBegin="+cacheBegin);
    }

    function processResponseToPage(){
        if (XMLHttpReq.readyState == 4) {
            if (XMLHttpReq.status == 200) {
                alert("success");
                var dataObj = eval("("+XMLHttpReq.responseText+")");
                var inHtml ="";
                var tablebody =document.getElementById("tablebody");
                tablebody.innerHTML="";
                for(var i=0;i<dataObj.length;i++){
                    var obj = dataObj[i];
                    if(i<10) {
                        var tr=document.createElement("tr");
                        var td=new Array();
                        for(var j=0; j<5; j++){td[j]= document.createElement("td");}
                        td[0].innerHTML=obj.classId;
                        td[1].innerHTML=obj.className;
                        td[2].innerHTML=obj.defaultStatName;
                        td[3].innerHTML=obj.createMan;
                        td[4].innerHTML=obj.createDate;
                        for(var j=0; j<5; j++){tr.appendChild(td[j]);}

                        tablebody.appendChild(tr);
                    }
                }
//                    document.getElementById("tbody").innerHTML=inHtml;
                //alert(document.getElementById("tablebody").innerHTML);
                //
                //document.getElementById("ajaxRes").innerHTML=XMLHttpReq.responseText;
            }
        }
    }

    function sendAjaxSearch2(url,objectID, resObjID) {
        createXMLHttpRequest();                                //创建XMLHttpRequest对象
        var object1 = document.getElementById(objectID);
        var object2 = document.getElementById(resObjID);
        XMLHttpReq.open('POST', url, true);
        XMLHttpReq.onreadystatechange = processResponseAjax;
        XMLHttpReq.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
        XMLHttpReq.send("className="+object1.value);//+object1.value
    }

    function processResponseAjax(){
        if (XMLHttpReq.readyState == 4) {
            if (XMLHttpReq.status == 200) {
                alert("success");
                document.getElementById("ajaxRes").innerHTML=XMLHttpReq.responseText;
            }
        }
    }

</script>

</body>
</html>