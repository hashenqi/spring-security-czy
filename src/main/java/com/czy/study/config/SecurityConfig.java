//package com.czy.study.config;
//
//import com.czy.study.handler.MyAuthenticationFailHandler;
//import com.czy.study.handler.MyAuthenticationSuccessHandler;
//import com.czy.study.handler.SavedRequestAwareAuthenticationSuccessHandler;
//import com.czy.study.service.MyUserDetailsServiceImpl;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.provisioning.JdbcUserDetailsManager;
//import org.springframework.security.web.authentication.ExceptionMappingAuthenticationFailureHandler;
//import org.springframework.security.web.util.matcher.AndRequestMatcher;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//import org.springframework.security.web.util.matcher.OrRequestMatcher;
//
//import javax.sql.DataSource;
//import java.nio.charset.StandardCharsets;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @Author chenzeyao
// * @Date 2022/7/5 17:10
// * @Description
// */
//@Configuration
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private DataSource dataSource;
//
//    /**
//     * 配置Auth源，也就是认证源，security自带有JdbcUserDetailsManager和InMemoryUserDetailsManager
//     * 统一由AuthenticationManagerBuilder管理
//     * @param auth
//     * @throws Exception
//     */
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        InMemoryUserDetailsManager使用 =======================================================
////        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
////        manager.createUser(User.withUsername("javaboy")
////                .password("{noop}123").roles("admin").build());
////        manager.createUser(User.withUsername("sang")
////                .password("{noop}123").roles("user").build())
//
//
//
////       JdbcUserDetailsManager 使用=======================================================
////        相关表
////        create table users(username varchar_ignorecase(50) not null primary key, password varchar_ignorecase(500) not null,
////                enabled boolean not null);
////        create table authorities (username varchar_ignorecase(50) not null, authority varchar_ignorecase(50) not null,
////                constraint fk_authorities_users
////        foreign key(username) references users(username));
////        create unique index ix_auth_username on authorities (username,authority);
//
////        相关pom依赖
////<dependency>
////<groupId>org.springframework.boot</groupId>
////<artifactId>spring-boot-starter-jdbc</artifactId>
////</dependency>
////<dependency>
////<groupId>mysql</groupId>
////<artifactId>mysql-connector-java</artifactId>
////</dependency>
//
////        相关数据源yml配置
////        spring:
////        datasource:
////        username:
////        password:
////        url:
////        JdbcUserDetailsManager manager = new JdbcUserDetailsManager(dataSource);
////        if (!manager.userExists("javaboy")) {
////            manager.createUser(User.withUsername("javaboy")
////                    .password("{noop}123").roles("admin").build());
////        }
////        if (!manager.userExists("sang")) {
////            manager.createUser(User.withUsername("sang")
////                    .password("{noop}123").roles("user").build());
////        }
//
////        自定义UserDetailsService接口======================================================
//        MyUserDetailsServiceImpl manager = new MyUserDetailsServiceImpl();
//        auth.userDetailsService(manager);
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        //表示开启权限配置
//        http.authorizeRequests()
//                //所有的请求都要认证后才能访问
//                .anyRequest()
//                .authenticated()
//                .and()
//                //表单登录
//                .formLogin()
//                //登录页面
//                .loginPage("/login.html")
//                //登录确认按钮需要请求的接口
//                .loginProcessingUrl("/doLogin")
//                //登录成功后默认跳转的url
//                .defaultSuccessUrl("/index")
//                //登录成功后的处理，打印日志，url封装后再次跳转等一些操作
////                .successHandler(successHandler())
//                //登录失败后，跳转的url
////                .failureUrl("/login.html")
//                //登录失败后的处理操作
////                .failureHandler(failHandler())
//                //表单中username的属性名
//                .usernameParameter("uname")
//                //表单中密码的属性名
//                .passwordParameter("passwd")
//                .permitAll()
//                .and()
//                // 配置登出
//                .logout()
//                .logoutRequestMatcher(new OrRequestMatcher(
//                        new AntPathRequestMatcher("/logout1","GET"),
//                        new AntPathRequestMatcher("/logout2","POST")
//                ))
//                //是否清除Session
//                .invalidateHttpSession(true)
//                // 是否清除 用户信息
//                .clearAuthentication(true)
//                .defaultLogoutSuccessHandlerFor((req,resp,anth)->{
//                    resp.setContentType(MediaType.APPLICATION_JSON_VALUE);
//                    resp.setStatus(HttpStatus.OK.value());
//                    Map<String, Object> result = new HashMap<>();
//                    result.put("msg", "使用 logout1 注销成功!");
//                    ObjectMapper om = new ObjectMapper();
//                    String s = om.writeValueAsString(result);
//                    resp.getOutputStream().write(s.getBytes(StandardCharsets.UTF_8));
//                },new AntPathRequestMatcher("/logout1","GET"))
//                .defaultLogoutSuccessHandlerFor((req,resp,anth)->{
//                    resp.setContentType(MediaType.APPLICATION_JSON_VALUE);
//                    resp.setStatus(HttpStatus.OK.value());
//                    Map<String, Object> result = new HashMap<>();
//                    result.put("msg", "使用 logout2 注销成功!");
//                    ObjectMapper om = new ObjectMapper();
//                    String s = om.writeValueAsString(result);
//                    resp.getOutputStream().write(s.getBytes(StandardCharsets.UTF_8));
//                },new AntPathRequestMatcher("/logout2","POST"))
//                .logoutSuccessUrl("/login.html")
//                .and()
//                .csrf().disable();
//
//    }
//
//}
