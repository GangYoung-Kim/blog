<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 24. 7. 25.
  Time: 오후 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css"/>
</head>
<body>
<header role="banner" id="headerArea" class="header">
    <div class="header-logo">
    <!--    <a rel="home" class="header-logo-link ci" href="">Kelog</a>-->
        <input type="checkbox" id="menu-icon">
        <label for="menu-icon">
            <span></span>
            <span></span>
            <span></span>
        </label>
    </div>
    <nav class="nav">
        <ul class="nav-list list-reset">
            <li class="menu-item">
                <a href="#">
                    <span class="menu-item-text">PROFILE</span>
                </a>
            </li>
            <li class="menu-item">
                <a href="#">
                    <span class="menu-item-text">TECH BLOG</span>
                </a>
            </li>
            <li class="menu-item">
                <a href="#">
                    <span class="menu-item-text">PROJECT</span>
                </a>
            </li>
            <li class="menu-item">
                <a href="#">
                    <span class="menu-item-text">CONTACT</span>
                </a>
            </li>
        </ul>
    </nav>
    <div class="nav-search">
        <input id="search-input" class="nav-search-input" type="text" placeholder="제목을 입력하세요.">
        <button id="search-button" class="nav-search-button" aria-label="검색">
						<span class="nav-search-icon" aria-hidden="true">
							<svg xmlns="http://www.w3.org/2000/svg" class="svg" viewBox="0 0 20 20">
								<circle class="magnifier-glasses" cx="8.2" cy="8.2" r="7.2"></circle>
								<path class="magnifier-handle" d="M 8.2 8.2 L 22 22"></path>
							</svg>
						</span>
        </button>
    </div>
</header>
</body>
</html>
