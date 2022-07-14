package com.czy.study.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author chenzeyao
 * @Date 2022/7/7 16:50
 * @Description
 */
public class MyUserDetailsServiceImpl implements UserDetailsService {
    private static Map<String,String> dbMap = new HashMap<>();
    static {
        dbMap.put("zhangsan","{noop}123");
        dbMap.put("lisi","{noop}123");
        dbMap.put("wangwu","{noop}123");
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String password = dbMap.get(username);
        if (password == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        return User.builder().username(username).password(password).roles("USER_ROLE").build();
    }
}
