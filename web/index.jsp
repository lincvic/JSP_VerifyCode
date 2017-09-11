<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/9/4
  Time: 上午10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>这是个首页</title>
  </head>
  <body>
  <form action="AddServlet" method="post">
    书名：<input type="text" name="bookName"/>
    <br>
    作者：<input type="text" name="bookAuthor"/>
    <br>
    价格：<input type="text" name="bookPrice"/>
    <br>
    <input type="submit" value="提交">
  </form>
  </body>
</html>
