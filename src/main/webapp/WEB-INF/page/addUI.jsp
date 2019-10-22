<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/17
  Time: 11:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body>
    <form action="/account/add.do" method="post">
        用户姓名:<input type="text" name="username"><br>
        用户金额:<input type="text" name="money"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
