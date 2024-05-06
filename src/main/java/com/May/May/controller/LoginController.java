package com.May.May.controller;

import com.May.May.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping("/login_form")
    public String getPage() {
        return "login_page";
    }
    @GetMapping("/new_login")
    public String afterLogin() {
        return "new_login"; // Assuming afterlogin.html is your page after login
    }
}


