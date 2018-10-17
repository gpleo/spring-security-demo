package com.gopersist.demo.security.jwt.controller;

import com.gopersist.demo.security.jwt.Consts;
import com.gopersist.demo.security.jwt.dto.LoginDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/accounts")
public class LoginController {
    @RequestMapping("/unauthorized")
    public String loginForm() {
        return "Unauthorized";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(@RequestBody LoginDTO entity) {
        if (entity == null || !LoginDTO.connect(entity)) {
            return "登录失败";
        }

        String token = Jwts.builder()
                .setSubject(LoginDTO.USERNAME)
                .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 24 * 1000))
                .signWith(SignatureAlgorithm.HS512, Consts.JWT_SECRET)
                .compact();
        return token;
    }
}
