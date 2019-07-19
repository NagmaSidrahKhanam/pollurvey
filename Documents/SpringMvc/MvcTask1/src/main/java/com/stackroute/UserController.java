package com.stackroute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    public User user;
    @RequestMapping(value = "/welcome")
    public ModelAndView welcome() {
        ModelAndView mav = new ModelAndView("user");
        mav.addObject("user", new User("khan",20));
        return mav;
    }
//        @RequestMapping("/display")
//        public String display(Model model) {
//            model.addAttribute("khan");
//            return "index";
//    }

//    public String display()
//    {
//        return "index";
//    }
}