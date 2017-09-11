<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="sw.wyj.book.Book" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/9/4
  Time: 上午11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是图书信息</title>
</head>
<body>
<h1>书籍信息如下</h1>
<table border="1">
    <tr>
        <td>书名</td>
        <td>作者</td>
        <td>价格</td>
    <c:forEach items="${bookList}" var="book">
    <tr><td>${book.bookName}

    </td><td>${book.bookAuthor}

    </td><td>${book.bookPrice}

    </td></tr>
    </c:forEach>

</table>
<a href="index.jsp">继续添加</a>
</body>
</html>
