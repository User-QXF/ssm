<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/17
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AccountList</title>
    <style>
        #accountTable td {
            width: 100px;
            text-align: center;
        }
    </style>
    <script>
        function add() {
            location.href = "${pageContext.request.contextPath}/account/addUI.do";
        }
    </script>
</head>
<body>
<table border="1" cellspacing="0" id="accountTable">
    <caption> Account </caption>
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>金额</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${accountList}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.username}</td>
            <td>${account.money}</td>
            <td><button onclick=" if(confirm('你确定要删除吗?')){ location.href ='${pageContext.request.contextPath}/account/del.do?id=${account.id}'}">删除</button></td>
        </tr>
    </c:forEach>

    <tr>
        <td colspan="4">
            <button onclick="add();">添加</button>
        </td>
    </tr>
</table>

</body>
</html>
