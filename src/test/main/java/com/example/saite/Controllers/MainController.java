package com.example.saite.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/q")
    public String ee()
    {
        return"8e888";
    }
}
