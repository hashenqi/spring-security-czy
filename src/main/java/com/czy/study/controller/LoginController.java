package com.czy.study.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author chenzeyao
 * @Date 2022/7/5 17:09
 * @Description
 */
@RestController
public class LoginController {
    @RequestMapping("/index")
    public String index() {
        return "login success";
    }
    @RequestMapping("/hello")
    public String hello() {
        return "hello spring security";
    }

    @RequestMapping("/test")
    public String test() {
        try {
            int a = 1/0;
        }catch (Exception e) {
            throw new RuntimeException("aaa");
        }
        return "hello spring security";
    }

    @RequestMapping("/runtime")
    public String runtime() {
        return "runtime exception";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "hello admin";
    }

    @RequestMapping("/rememberme")
    public String rememberMe(){
        return "remember-me";
    }

    @RequestMapping("/http")
    public String http() {
        return "http Connect";
    }

    @RequestMapping("/https")
    public String https() {
        return "https Connect";
    }

    @RequestMapping("/oauth2-test")
    public DefaultOAuth2User oauth2(){
        return (DefaultOAuth2User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
