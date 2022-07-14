//package com.czy.study.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
//import org.springframework.session.web.http.CookieSerializer;
//import org.springframework.session.web.http.DefaultCookieSerializer;
//
///**
// * @Author chenzeyao
// * @Date 2022/7/12 10:45
// * @Description
// */
//@Configuration
//public class CsrfSecurityConfig extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .formLogin()
//                .loginProcessingUrl("/login.html")
//                .successHandler((req,resp,auth)->{
//                    resp.getWriter().write("login success");
//                })
//                .permitAll()
//                .and()
//                // csrf的信息默认是通过HttpSessionCsrfTokenRepository去存放，然后在后端塞到请求头中
//                // 具体的详情操作可以看CsrfFilter过滤中的doFilterInternal方法
//                .csrf()
//                // 将csrf存放在Cookie,并将httpOnly设置成false，要不然前端读不到Cookie中的CSRF令牌
//                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//    }
//
//    /**
//     * samesite 方式
//     * @return
//     */
//    @Bean
//    public CookieSerializer httpSessionIdResolver() {
//        DefaultCookieSerializer cookieSerializer = new DefaultCookieSerializer();
//        cookieSerializer.setSameSite("strict");
//        return cookieSerializer;
//    }
//}
