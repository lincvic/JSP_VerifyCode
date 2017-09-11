<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/9/5
  Time: 上午10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<script type="text/javascript" src="js/jQuery1.9.1.js"></script>
<script type="text/javascript">
    //更换验证码JS
    function reload(){
        document.getElementById("image").src="<%=request.getContextPath() %>/imageServlet?date="+new Date().getTime();
        $("#checkcode").val("");   // 验证码清空
    }

    function verificode(){
        var text=$.trim($("#checkcode").val());
        $.post("${pageContext.request.contextPath}/verificationServlet",{op:text},function(data){
            data=parseInt($.trim(data));
            if(data>0){
                $("#span").text("验证成功!").css("color","green");
            }else{
                $("#span").text("验证失败!").css("color","red");
                reload();  //验证失败后需要更换验证码
            }
        });
        $("#checkcode").val(""); // 将验证码清空
    }
</script>
<body>
<h1>这是登陆界面</h1>
<form action="doLoginServlet" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="text" name="psw"><br>
    验证码：<input type="text" name="checkcode"  id="checkcode"/>
    <img  src="<%=request.getContextPath() %>/imageServlet" alt="验证码" id="image" />
    <a href="javascript:reload();"><label>换一张</label></a><br>
    <input type="submit" value="确认" onclick="verificode()">

</form>

</body>
</html>
