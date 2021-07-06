package com.caput.webservice.web;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class WebController {
    @GetMapping("/")
    public String main() {
        return "main";
    }
}
