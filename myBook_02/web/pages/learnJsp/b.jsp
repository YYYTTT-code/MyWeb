<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 11
  Date: 2021/3/10
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>标题</title>
</head>
<body>
    <%=15.5%><br>
    <%="字符串"%><br>
    <h1>scope.jsp 页面</h1>
    <%
        // 往四个域中都分别保存了数据
        pageContext.setAttribute("key", "pageContext");
        request.setAttribute("key", "request");
        session.setAttribute("key", "session");
        application.setAttribute("key", "application");
    %>
    pageContext 域是否有值：<%=pageContext.getAttribute("key")%> <br>
    request 域是否有值：<%=request.getAttribute("key")%> <br>
    session 域是否有值：<%=session.getAttribute("key")%> <br>
    application 域是否有值：<%=application.getAttribute("key")%> <br>
    <%
        out.print("111");
//        request.getRequestDispatcher("/scope2.jsp").forward(request,response);
    %><br>

    <%

        Map<String,Object> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
//        person.setMap(map);pageContext.setAttribute("p", person);
    %>
    输出 Person：${ map }<br/>

    <br>以下是学习JSTL<br>
    <c:if test="${12==12}">
        JSTL输出成功
    </c:if>

</body>
</html>
