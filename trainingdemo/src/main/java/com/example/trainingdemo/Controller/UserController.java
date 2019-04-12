package com.example.trainingdemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.example.trainingdemo.DAO.UserDaoImpl;
import com.example.trainingdemo.User.User;

@Controller
public class UserController {

    UserDaoImpl userDao = new UserDaoImpl();

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView model = new ModelAndView("register");
        model.addObject("user", new User());
        return model;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
                                @ModelAttribute("user") User user) {
        userDao.register(user);
        return new ModelAndView("welcome", "name", user.getName());
    }
}
