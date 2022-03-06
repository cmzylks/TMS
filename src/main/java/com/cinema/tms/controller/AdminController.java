package com.cinema.tms.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @PostMapping(value = "/login")
    public String login(String name, String password) {
        System.out.println(name);
        System.out.println(password);
        JSONObject json = new JSONObject();
        json.put("name", name);
        json.put("password", password);
        return json.toJSONString();
    }
}
