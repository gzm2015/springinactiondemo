<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/12
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    index
    hello <sec:authentication property="principal.username"></sec:authentication>
    <sec:authentication property="principal.password"></sec:authentication>
</body>
</html>
