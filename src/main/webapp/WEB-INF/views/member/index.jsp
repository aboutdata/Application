<%-- 
    Document   : index
    Created on : 2015-7-17, 16:47:50
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
        <link rel="stylesheet" href="${pageContext.request.contextPath}/demo/css/jquery.bigautocomplete.css" type="text/css" />
        <title>Jquery实现仿搜索引擎文本框自动补全插件 - Jquery-school</title>

        <script type="text/javascript" src="${pageContext.request.contextPath}/demo/js/jquery-1.7.2.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/demo/js/jquery.bigautocomplete.js"></script>
        <script type="text/javascript">
            $(function () {


//                $("#tt2").bigAutocomplete({width: 604,data:[{title:"中国好声音",result:{ff:"qq"}}], callback: function(data) {
//                        alert(data.result.ff);
//
//                }});


                $("#tt2").bigAutocomplete({width: 604, url: "${pageContext.request.contextPath}/bigAutoComplete/json", callback: function (data) {
                        // alert(data.result.ff);
                        // 
//                        $("#tt2-hidden").val(data.result.id);
                        $("#tt2").prev().val(data.result.id);
                    }});

            })
        </script>

    </head>
    <body>

        <br /><br /><br />
        <center>
            自定义下拉框宽度，列表为：中国好声音、中国移动网上营业厅、中国银行、中国移动、中国好声音第三期、中国好声音 第一期、中国电信网上营业厅、中国工商银行、中国好声音第二期、中国地图
            <br/>
            <br/>
            <br/>
            <br/>
            <br/> 	

            <br/>
            <input type="text" id="tt2-hidden" name="host"/>
            <input type="text" id="tt2" name="host"/>	
           
        </center>	
    </body>
</html>

