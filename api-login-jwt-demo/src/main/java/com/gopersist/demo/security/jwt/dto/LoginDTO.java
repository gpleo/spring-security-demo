package com.gopersist.demo.security.jwt.dto;

import javax.validation.constraints.NotBlank;

public class LoginDTO {
    public static final String USERNAME = "sa";
    public static final String PASSWORD = "sa";

    @NotBlank
    private String username;
    @NotBlank
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean connect(LoginDTO loginDTO) {
        return USERNAME.equals(loginDTO.getUsername()) && PASSWORD.equals(loginDTO.getPassword());
    }
    public static boolean connect(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
