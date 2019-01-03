<%--
  Created by IntelliJ IDEA.
  User: ZHANGAIYU
  Date: 2019/1/3
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
    <form method="get" action="/user/login">
        用户名:<input type="text" name="name"/><br/>
        密码:<input type="password" name="pwd"/><br/>
        <input type="submit" value="登录">
    </form>
</body>
</html>
