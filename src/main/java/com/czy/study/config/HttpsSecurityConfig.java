//package com.czy.study.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @Author chenzeyao
// * @Date 2022/7/12 15:38
// * @Description
// */
//@Configuration
//public class HttpsSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests().anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .and()
//                .portMapper()
//                .http(8080).mapsTo(8444)
//                .and()
//                .requiresChannel()
//                .antMatchers("/https").requiresSecure()
//                .antMatchers("/http").requiresInsecure()
//                .and()
//                .csrf().disable();
//    }
//}
