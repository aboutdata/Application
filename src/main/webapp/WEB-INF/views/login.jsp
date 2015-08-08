<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
   <title>Login</title>
</head>
<body>
    <c:if test="${errorMessage != null}">
       <b style="color: #FF0000">${errorMessage}</b>
    </c:if>
    <form action="${pageContext.request.contextPath}/login" method="post">
    	Username: 
        <input name="username" value="root" type="text"/></br>
    	Password: 
        <input name="password" value="11111" type="password"/></br>
       验证码:
       <input type="text" id="captcha" name="captcha" class="text captcha" maxlength="4" autocomplete="off" />
       
       <img id="captchaImage" class="captchaImage" src="${pageContext.request.contextPath}/admin/common/captcha"/></br>
    	<input name="submit" value="Login" type="submit"/>
    </form>
</body>
</html>