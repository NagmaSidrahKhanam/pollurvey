package com.stackroute.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    User user;

    @Autowired
    public UserController(User user) {

        this.user = user;
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ModelAndView login(){
        System.out.println("login");
        ModelAndView modelAndView = new ModelAndView("index.jsp");
        modelAndView.addObject("result","Welcome to stackroute ");
        return modelAndView;
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("username") String username,
                              @RequestParam("password") String password)
    {
        user.setUsername(username);
        user.setPassword(password);
        ModelAndView modelAndView = new ModelAndView("display.jsp");
        modelAndView.addObject("result",user.getUsername());
        return modelAndView;
    }
}