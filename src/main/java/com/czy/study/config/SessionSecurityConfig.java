//package com.czy.study.config;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContextAware;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.session.SessionInformation;
//import org.springframework.security.web.session.HttpSessionEventPublisher;
//import org.springframework.session.FindByIndexNameSessionRepository;
//import org.springframework.session.security.SpringSessionBackedSessionRegistry;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.nio.charset.StandardCharsets;
//import java.security.Principal;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @Author chenzeyao
// * @Date 2022/7/11 10:47
// * @Description
// */
//@Configuration
//public class SessionSecurityConfig extends WebSecurityConfigurerAdapter implements ApplicationContextAware {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .and()
//                .csrf()
//                .disable()
//                // session管理
//                .sessionManagement()
//                // 最多只允许一个同用户登录
//                .maximumSessions(2)
//                // session注册
//                .sessionRegistry(sessionRegistry());
//    }
//
//    /**
//     * session 共享 ，存放在redis中
//     * @return
//     */
//    @Bean
//    SpringSessionBackedSessionRegistry sessionRegistry(){
//        FindByIndexNameSessionRepository sessionRepository = (FindByIndexNameSessionRepository) this.getApplicationContext().getBean("sessionRepository");
//        return new SpringSessionBackedSessionRegistry(sessionRepository);
//    }
//
//}
