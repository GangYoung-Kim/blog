<%--
  Created by IntelliJ IDEA.
  User: gimgang-yeong
  Date: 24. 11. 20.
  Time: 오후 4:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="static/css/init.css" />
  <link rel="stylesheet" href="static/css/component.css" />
  <script type="text/javascript" src="static/js/jquery-3.7.1.min.js"></script>
  <script type="text/javascript" src="static/js/home.js"></script>
  <script type="text/javascript" src="static/js/modal.js"></script>
    <title>Title</title>
</head>
<body>
  <div class="full-container d-flex">
    <div class="left-container">
      <div class="blog-name">
        <h1 class="blog-text">KELOG</h1>
      </div>
    </div>
    <div class="right-container">
      <div class="enter-menu-container">
        <div class="enter-inner-menu">
          <div class="kakao-container e-menu">
            <img id="kLogin" src="/static/img/kakao_icon.png"/>
            <div class="fade-text" id="animatedKakaoText">With Kakao</div>
          </div>
          <div class="naver-container e-menu">
            <img id="nLogin" src="/static/img/naver_icon.png"/>
            <div class="fade-text" id="animatedNaverText">With Naver</div>
          </div>
          <div class="guest-container e-menu">
            <img id="gLogin" src="/static/img/guest_icon.png"/>
            <div class="fade-text" id="animatedGuestText">With Guest</div>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
