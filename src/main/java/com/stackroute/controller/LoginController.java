package com.stackroute.controller;
import com.stackroute.controller.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class LoginController
{
    @RequestMapping("login")
    public ModelAndView login(HttpServletRequest req, HttpServletResponse res)
    {
        String username = req.getParameter("first");
        String password = req.getParameter("UserPassword");
        User user = new User(username, password);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("display");
        return mv;
    }
}