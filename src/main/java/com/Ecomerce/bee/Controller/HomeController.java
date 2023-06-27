package com.Ecomerce.bee.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping({"/"})
    public String home(){
        return "basicTemplates/index";
    }

    @GetMapping({"/Womens"})
    public String women(){
        return "basicTemplates/Womens";
    }

    @GetMapping({"/Mens"})
    public String men(){
        return "basicTemplates/Mens";
    }

    @GetMapping({"/shop"})
    public String shop(){
        return "basicTemplates/shop";
    }

    @GetMapping({"/product-details"})
    public String productDetails(){
        return "basicTemplates/product-details";
    }

    @GetMapping({"/shop-cart"})
    public String shopCart(){
        return "basicTemplates/shop-cart";
    }


    @GetMapping({"/checkout"})
    public String checkOut(){
        return "basicTemplates/checkout";
    }


    @GetMapping({"/blog-details"})
    public String blogDetails(){
        return "basicTemplates/blog-details";
    }


    @GetMapping({"/blog"})
    public String blog(){
        return "basicTemplates/blog";
    }

    @GetMapping({"/contact"})
    public String contact(){
        return "basicTemplates/contact";
    }

}
