<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1></br>
        jsp调用getAdminById方法:<h1>${appBean.getAdminById('2487227710').email}</h1></br>
        <h1>控制面板!<a href="${pageContext.request.contextPath}/admin/login">后台登录</a></h1></br>
        <h1>控制面板!<a href="${pageContext.request.contextPath}/admin/dashboard">后台首页</a></h1></br>
        <h1>控制面板!<a href="${pageContext.request.contextPath}/admin/admin/list">用户列表</a></h1></br>
    </body>
</html>
