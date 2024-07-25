<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24. 7. 25.
  Time: 오후 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="static/css/init.css" />
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="midContainer">
        <jsp:include page="sideMenu.jsp"/>
    <div class="bodyContainer">
        <jsp:include page="sndHeader.jsp"/>
        <jsp:include page="contentContainer.jsp"/>
    </div>
</div>
</body>
</html>
