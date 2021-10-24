package com.hsbc.risk.rb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author HDM
 * @Date 2021-09-16 21:52
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public int getUserById(@PathVariable int id) {
        return id;
    }
}