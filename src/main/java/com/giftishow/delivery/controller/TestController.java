package com.giftishow.delivery.controller;

import com.giftishow.delivery.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/test")
    public String test(Model model) {
        User user = new User("test1", "1111");
        model.addAttribute("user", user);
        return "test";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
