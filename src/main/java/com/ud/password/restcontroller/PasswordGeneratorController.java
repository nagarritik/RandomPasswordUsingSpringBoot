package com.ud.password.restcontroller;

import com.ud.password.model.Password;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordGeneratorController {
    @Autowired
    private Password password;

    @GetMapping("/")
    public String index(){
        return "Working...";
    }

    @GetMapping("/{length}/{type}")
    public String generate(
            @PathVariable int length,
            @PathVariable int type
    ){
        return password.generate(length,type);
    }
}
