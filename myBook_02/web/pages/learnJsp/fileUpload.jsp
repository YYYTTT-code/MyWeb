<%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2021/3/10
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试文件上传</title>
</head>
<body>
<form method="post" action="http://localhost:8080/myBook_02/fileServlet" enctype="multipart/form-data">
    名字<input type="text" name="name" value="${cookie.key1.value}"/><br>
    上传<input type="file" name="photo"/><br>
    <input type="submit">
</form>
</body>
</html>
