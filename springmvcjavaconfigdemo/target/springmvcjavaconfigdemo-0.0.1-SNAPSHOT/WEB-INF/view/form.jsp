<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


    111111${model}222222

    <%--form action 默认为 get--%>
    <form action="/form" method="post">
        <input type="text" name="name" placeholder="input name">
        <input type="submit" value="submit">
    </form>


</body>
</html>
