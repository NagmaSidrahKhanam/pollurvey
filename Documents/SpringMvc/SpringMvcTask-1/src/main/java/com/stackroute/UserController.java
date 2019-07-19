package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
        @RequestMapping("/User")
        public String display(Model model) {
            model.addAttribute("khan");

            return "index";
    }

}