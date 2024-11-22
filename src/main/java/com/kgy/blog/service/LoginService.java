package com.kgy.blog.service;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {

    @Value("${kakao.api.key}")
    private String kakaoKey;

    @Value("${kakao.secret.key}")
    private String kakaoSecretKey;

    @Value("${kakao.redirect.url}")
    private String kakaoRedirectUrl;

    @Value("${kakao.default.url}")
    private String kakaoDefaultUrl;

    @Value("${kakao.api.url}")
    private String apiUrl;

    private final String reqUrl = kakaoDefaultUrl + "oauth/authorize?client_id=" + kakaoKey + "&redirect_uri=" + kakaoRedirectUrl + "&response_type=code";

    public String reqUrl() {
        return reqUrl;
    }

    public Map<String, Object> getAccessToken(String code) throws Exception {

        String accessToken = "";
        String refreshToken = "";
        if(code == null) throw new Exception("FAIL TO AUTHORIZATION");

        try{
            HttpHeaders headers = new HttpHeaders();
            MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
            params.add("grant_type", "authorization_code");
            params.add("code", code);
            params.add("client_id", kakaoKey);
            params.add("client_secret", kakaoSecretKey);
            params.add("redirect_uri", kakaoRedirectUrl);

            RestTemplate restTemplate = new RestTemplate();
            HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity<>(params, headers);

            String tokenUrl = kakaoDefaultUrl + "oauth/token";

            ResponseEntity<String> response = restTemplate.exchange(tokenUrl, HttpMethod.POST, request, String.class);

            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(response.getBody());

            accessToken = (String) jsonObject.get("access_token");
            refreshToken = (String) jsonObject.get("refresh_token");
        } catch (Exception e) {
            throw new Exception("API call failed");
        }

        return getUserInfo(accessToken);
    }

    public Map<String, Object> getUserInfo(String accessToken) throws Exception {
        HttpHeaders headers = new HttpHeaders();

        headers.add("Authorization", "Bearer " + accessToken);
        headers.add("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");

        RestTemplate restTemplate = new RestTemplate();

        HttpEntity<MultiValueMap<String, Object>> request = new HttpEntity<>(null, headers);

        apiUrl = apiUrl + "v2/user/me";

        ResponseEntity<String> response = restTemplate.exchange(apiUrl, HttpMethod.POST, request, String.class);

        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(response.getBody());
        JSONObject account = (JSONObject) jsonObject.get("kakao_account");
        JSONObject profile = (JSONObject) account.get("profile");

        long id = (long) jsonObject.get("id");
        String email = (String) account.get("email");
        String nickname = (String) profile.get("nickname");

        Map<String, Object> result = new HashMap<>();

        result.put("id", id);
        result.put("email", email);
        result.put("nickname", nickname);

        return result;
    }
}
