package com.gopersist.study.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contents")
public class ContentController {
    @RequestMapping()
    public String get() {
        return "Contents";
    }
}
