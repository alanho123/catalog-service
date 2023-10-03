package com.polarbookshop.catalogservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Jason Ho
 * @since : 2023/9/28
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String getGreeting() {
        return "Welcome to the book catalog!";
    }
}
