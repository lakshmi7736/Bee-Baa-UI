package com.Ecomerce.bee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class AppController {
    @GetMapping({"/authentication-login"})
    public String authLogin(){
        return "authentication-login";
    }

    @GetMapping({"/authentication-Otp-login"})
    public String otplogin(){
        return "authentication-Otp-login";
    }

    @GetMapping({"/authentication-register"})
    public String authRegister(){
        return "authentication-register";
    }
}
