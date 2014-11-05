<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
	<meta charset="utf-8"/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title> Classification Information </title>
	<!-- 新 Bootstrap 核心 CSS 文件 -->


	<!-- 可选的Bootstrap主题文件（一般不用引入） 
	<link rel="stylesheet" href="E:\Code\JQuery\bootstrap-3.2.0-dist\css/bootstrap-theme.min.css">
	-->
	
	<link rel="stylesheet" type="text/css" media="screen" href="css/font-awesome.min.css">
	<!-- SmartAdmin Styles : Please note (smartadmin-production.css) was created using LESS variables -->
	<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-production.css">
	<link rel="stylesheet" type="text/css" media="screen" href="css/smartadmin-skins.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
	<link type="text/css" href="css/jquery-ui.css" rel="stylesheet">
	
	<style>
		
	</style>
</head>

<body style="overflow:auto;">
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
                <input id="search_input" type="text" value="" />
                <a href="#"><img id="search_img" src="images/sbutton.png" height="26px"/></a>
            </div>
         </div>
	</div>
	
	<div id="searchDiv" class="container-fluid">
        <br>
        <br>
        <div class="row"><div class="col-md-10 col-md-offset-1"><label>检索条件</label></div></div>
        <div class="row">
            <form method="post" action="searchAction">
            <div class="col-md-11 col-md-offset-1">

                    资产分类：<input type="text" name="className"/>
                    保管人：<input type="text" name="createMan" />
                    <button type="submit">检索</button>
                    <button type="reset">重置</button>
                <br><br>
                </div>
            </form>
            </div>
        <div class="row"><div class="col-md-10 col-md-offset-1"><label>测试Ajax</label></div></div>
        <div class="row">
            <div class="col-md-11 col-md-offset-1">
                资产分类：<input type="text" id="classNameAjax"/>
                保管人：<input type="text" name="createMan" />
                <button onclick="sendAjaxSearch('ajaxSearchAction', 'classNameAjax','ajaxRes')">检索</button>
                <br>
                <div id="ajaxRes"></div>
                <br>
            </div>
        </div>
	</div>
	<div id="resultDiv" class="container-fluid">
        <div class="col-md-10 col-md-offset-1">
		<div class="jarviswidget jarviswidget-color-blueDark jarviswidget-sortable" id="wid-id-3" data-widget-editbutton="false" role="widget" style="position: relative; opacity: 1;">
				<!-- widget options:
				usage: <div class="jarviswidget" id="wid-id-0" data-widget-editbutton="false">

				data-widget-colorbutton="false"
				data-widget-editbutton="false"
				data-widget-togglebutton="false"
				data-widget-deletebutton="false"
				data-widget-fullscreenbutton="false"
				data-widget-custombutton="false"
				data-widget-collapsed="true"
				data-widget-sortable="false"
				-->
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
                            <a class="btn btn-default btn-sm DTTT_button_copy" id="ToolTables_datatable_tabletools_0"><span>Copy</span>
                            <div style="position: absolute; left: 0px; top: 0px; width: 50px; height: 31px; z-index: 99;">
                                <embed id="ZeroClipboard_TableToolsMovie_5" src="js/plugin/datatables/media/swf/copy_csv_xls_pdf.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="50" height="31" name="ZeroClipboard_TableToolsMovie_5" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=5&amp;width=50&amp;height=31" wmode="transparent"></div></a>
                            <a class="btn btn-default btn-sm DTTT_button_print" id="ToolTables_datatable_tabletools_1" title="View print view"><span>Print</span></a>
                            <a class="btn btn-default btn-sm DTTT_button_collection" id="ToolTables_datatable_tabletools_2"><span>Save <span class="caret"></span></span></a></div>
                            <!---->
                            <div id="datatable_tabletools_length" class="dataTables_length"><span class="smart-form">
                                <label class="select" style="width:60px">
                                <select size="1" name="datatable_tabletools_length" aria-controls="datatable_tabletools" id="selectListNumber"
                                        onchange="countSelect('pageUpdateAction', ${pageBean.currentPage}, ${pageBean.totalPages}, ${pageBean.listCount}, ${pageBean.cacheBegin})">
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
                                    <th class="sorting" role="columnheader" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Name: activate to sort column ascending" style="width: 145px;">Name</th>
                                    <th class="sorting" role="columnheader" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Status: activate to sort column ascending" style="width: 194px;">Status</th>
                                    <th class="sorting" role="columnheader" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Creator: activate to sort column ascending" style="width: 133px;">Creator</th>
                                    <th class="sorting" role="columnheader" tabindex="0" aria-controls="datatable_tabletools" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 109px;">Date</th></tr>
							</thead>
							
						<tbody role="alert" aria-live="polite" aria-relevant="all" id="tablebody">
                        <tr class="odd">
                            <td class=" ">obj.classId}</td>
                            <td class=" ">obj.className}</td>
                            <td class=" ">obj.defaultStatName}</td>
                            <td class=" ">{obj.createMan}</td>
                            <td class=" ">{obj.createDate}</td>
                        </tr>
                        <c:forEach items="${objList}" var="obj">
                            <tr class="odd">
                                <td class=" sorting_1">${obj.classId}</td>
                                <td class=" ">${obj.className}</td>
                                <td class=" ">${obj.defaultStatName}</td>
                                <td class=" ">${obj.createMan}</td>
                                <td class=" ">${obj.createDate}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                            </table></div>
                            <div class="dt-row dt-bottom-row">
                                <div class="row"><div class="col-sm-6">
                                <div class="dataTables_info" id="datatable_tabletools_info">Showing 1 to 10 of 100 entries</div></div>
                                <div class="col-sm-6 text-right"><div class="dataTables_paginate paging_bootstrap">

                                <ul class="pagination">
                                    <li class="prev disabled"><a href="#">Previous</a></li>
                                    <li class="active"><a href="#">1</a></li>
                                    <li><a href="#">2</a></li>
                                    <li><a href="#">3</a></li>
                                    <li><a href="#">4</a></li>
                                    <li><a href="#">5</a></li>
                                    <li class="next"><a href="#">Next</a></li>
                                </ul>

                                </div></div></div></div></div>

					</div>
					<!-- end widget content -->

				</div>
				<!-- end widget div -->
            </div>
			</div>
	</div>
	<div id="footer" class="container-fluid">
        <div class="row">
            <div class="col-md-3 col-md-offset-5">
            <span>关于佳克 | 版权说明 | asset365 | R2</span><br/>
                </div>
        </div>
        <div class="row">
            <div class="col-md-9 col-md-offset-4">
		<span>Copyright @1997-2011上海佳克计算机软件有限公司  版权所有</span>
                </div>
            </div>
	</div>


	<script src="js/jquery-ui.js"></script>
    <script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
    <script src="js/classListAjax.js"></script>
	<script>
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
//                    $.each(dataObj,function(idx, obj){
//                        if(obj==null){}
//                        else if(idx<10) {
//                            inHtml += '<tr class="odd">';
//                            inHtml += '<td>' + obj.classId + '</td>';
//                            inHtml += '<td>' + obj.className + '</td>';
//                            inHtml += '<td>' + obj.defaultStatName + '</td>';
//                            inHtml += '<td>' + obj.createMan + '</td>';
//                            inHtml += '<td>' + obj.createDate + '</td>';
//                            inHtml += '</tr>';
//                        }
//                    })
//                    document.getElementById("tbody").innerHTML=inHtml;
                    //alert(document.getElementById("tablebody").innerHTML);
                    //
                    //document.getElementById("ajaxRes").innerHTML=XMLHttpReq.responseText;
                }
            }
        }

        function sendAjaxSearch(url,objectID, resObjID) {
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