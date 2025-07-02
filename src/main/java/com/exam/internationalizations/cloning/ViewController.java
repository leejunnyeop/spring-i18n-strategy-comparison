package com.exam.internationalizations.cloning;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/ko")
    public String koreanPage(Model model) {
        return "templates_ko/index";
    }

    @GetMapping("/en")
    public String englishPage(Model model) {
        return "templates_en/index";
    }
}
