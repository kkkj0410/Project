<%--
  Created by IntelliJ IDEA.
  User: QWER
  Date: 2024-07-24
  Time: 오후 4:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action = "save-post" method = "post">
        title:<textarea cols="50" rows="20" type = "text" name = "title"></textarea>
        content : <textarea cols="50" rows="40" type = "text" name = "content"></textarea>
        <button type="submit">전송</button>
    </form>
</body>
</html>
