package com.example.spring.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * Thymeleafの式ユーティリティオブジェクト.
 */
@Controller
public class HelloController {

    @RequestMapping("/thymeleaf/hello")
    public String exec(Model model) {
        model.addAttribute("string", "Hello");
        model.addAttribute("stringNull", null);
        model.addAttribute("stringArray", new String[]{"Foo", "Bar", "Baz"});
        model.addAttribute("stringList", Arrays.asList("Hoge", "Fuga", "Piyo"));
        model.addAttribute("STRING", "HELLO");
        model.addAttribute("number", 1000);
        return "thymeleaf/hello";
    }
}