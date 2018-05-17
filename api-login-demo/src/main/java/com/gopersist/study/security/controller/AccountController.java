package com.gopersist.study.security.controller;

import com.gopersist.study.security.dto.LoginDTO;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @RequestMapping("/unauthorized")
    public String loginForm() {
        return "Unauthorized";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(LoginDTO entity) {
        System.out.println(entity.getUsername() + ", " + entity.getPassword());
        Authentication auth = new UsernamePasswordAuthenticationToken(entity.getUsername(), entity.getPassword(),
                Arrays.asList(new SimpleGrantedAuthority("USER")));
        SecurityContextHolder.getContext().setAuthentication(auth);
        return "Logined";
    }
}
