package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping
public class DemoController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    private String index(
            HttpServletRequest request,
            @RequestParam(value = "id", defaultValue = "20")int id) {

        return "Hello, your id is " + id;
    }
}
