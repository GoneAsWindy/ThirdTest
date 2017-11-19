<%--
  Created by IntelliJ IDEA.
  User: 50353
  Date: 2017/11/14
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<title>Insert title here</title>
</head>
<body>

<h3>添加客户</h3>

<form action="${ pageContext.request.contextPath }/customerAction_save" method="post">
  姓名：<input type="text" name="name" /><br/>
  年龄：<input type="text" name="age" /><br/>
  <input type="submit" value="提交"/><br/><span>${msg}</span>
</form>

</body>
</html>
