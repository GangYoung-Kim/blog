package com.kgy.blog.controller;

import com.kgy.blog.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpRange;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@RestController
public class LoginController {

    @Autowired
    private final LoginService loginService;

    @GetMapping("/req/kakaoLogin")
    public ModelAndView kakaoLogin(Model model){
        ModelAndView mav = new ModelAndView("enterance");

        model.addAttribute("kakaoUrl", loginService.reqUrl());

        return mav;
    }

    @GetMapping("/oauth/redirect")
    public ResponseEntity<?> oauthRedirect(HttpServletRequest req) throws Exception{
        Map<String, Object> kakaoResponse = loginService.getAccessToken(req.getParameter("code"));

        return ResponseEntity.ok().body(kakaoResponse);
    }
}
