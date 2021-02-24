package org.example.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description TODO
 * @Author rll
 * @Date 2021-02-24 14:28
 */

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/list")
//    @ResponseBody
    public String list(){
        return "list";
    }
}
