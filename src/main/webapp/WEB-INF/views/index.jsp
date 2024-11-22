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
    <link rel="stylesheet" href="static/css/component.css"/>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <script type="text/javascript" src="static/js/jquery-3.7.1.min.js"></script>
    <script type="text/javascript" src="static/js/common.js"></script>
</head>
<body>
<div class="full-container">
    <jsp:include page="header.jsp"/>
    <div class="body-container">
        <jsp:include page="sideMenu.jsp"/>
        <jsp:include page="content.jsp"/>
    </div>
</div>
</body>
</html>
