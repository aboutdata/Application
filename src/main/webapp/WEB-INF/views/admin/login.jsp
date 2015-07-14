<%-- 
    Document   : login
    Created on : 2015-7-14, 13:41:06
    Author     : Administrator
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
        <meta charset="utf-8" />
        <title>登录-安好互联网医院</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />
        <!-- bootstrap & fontawesome -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/admin/css/bootstrap.min.css" />
        <!--[if lte IE 9]>
                <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/admin/css/ace-part2.min.css" />
        <![endif]-->
        <!--[if lte IE 9]>
          <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/admin/css/ace-ie.min.css" />
        <![endif]-->
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->

        <!--[if lt IE 9]>
        <script src="${pageContext.request.contextPath}/assets/admin/js/html5shiv.js"></script>
        <script src="${pageContext.request.contextPath}/assets/admin/js/respond.min.js"></script>
        <![endif]-->
        <style>
            *{margin:0;padding: 0;}
            body{background: #FAFFFF}
            .loginBox{width:420px;height:235px;padding:0 20px;border:1px solid #fff; color:#000; margin-top:40px; border-radius:8px;background: white;box-shadow:0 0 15px #00BFFF; background: -moz-linear-gradient(top, #fff, #efefef 8%);background: -webkit-gradient(linear, 0 0, 0 100%, from(#f6f6f6), to(#f4f4f4));font:11px/1.5em 'Microsoft YaHei' ;position: absolute;left:50%;top:50%;margin-left:-210px;margin-top:-115px;}
        </style>
    </head>
    <body>
        <div class="container">
            <section class="loginBox row-fluid">
                <br/>
                <form>
                    <div class="form-group">
                        <label for="exampleInputEmail1">管理员账号</label>
                        <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Email">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">管理员密码</label>
                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                    </div>
                    <div class="checkbox">
                        <label>
                            <input type="checkbox"> 记住密码
                        </label>
                    </div>
                    <button type="submit" class="btn btn-info btn-block">登录</button>
                </form>
            </section><!-- /loginBox -->
        </div> <!-- /container -->
    </body>
</html>
