$(function() {

    $("#compareDate").append("<input type='text' class='form-control' placeholder='起始于' id='search_startDate'/>-")
        .append("<input type='text' class='form-control'  placeholder='结束于' id='search_endDate' />")
        .css("display","inline")
        .on("change", dateCompare);
    $("#search_startDate").datepicker({dateFormat: 'yy-mm-dd'});
    $("#search_endDate").datepicker({dateFormat: 'yy-mm-dd'});

    $("#compareNum").append("<input type='text' placeholder='起始于' id='search_startNum'/>-");
    $("#compareNum").append("<input type='text' placeholder='结束于' id='search_endNum' />");
    $("#compareNum").on("change", compareNum);
});

function dateCompare(){
    var startdate=new Date(($("#search_startDate").val()).replace(/-/g,"/"));
    var enddate=new Date(($("#search_endDate").val()).replace(/-/g,"/"));
    var date = new Date();
    if(startdate > enddate)
    {
        alert("起始日期不得大于截止日期！");
        $("#search_endDate").val("");
        return false;
    }
    else
        return true;
}
function compareNum(){
    var a = $("#search_startNum").val();
    var b = $("#search_endNum").val();
    if(a=="" || b=="") return;

    a = Number(a.replace(/,/g,""));
    b = Number(b.replace(/,/g,""));
    if(typeof(a)!="number" || typeof(b)!="number"|| isNaN(a) || isNaN(b))
    {
        alert("非数字");
        return false;
    }
    if(a > b)
    {
        alert("起始值不得大于结束值！");
        $("#search_endNum").val("")
        return false;
    }
    else{
        return true;
    }
}