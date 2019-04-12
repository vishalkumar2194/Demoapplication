package com.example.trainingdemo.Controller;

import com.example.trainingdemo.DAO.UserDaoImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.example.trainingdemo.User.Login;
import com.example.trainingdemo.User.User;

@Controller
public class LoginController {

    UserDaoImpl userDao = new UserDaoImpl();

    @RequestMapping(value="/login", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView showLogin(HttpServletRequest req, HttpServletResponse res)
    {
        ModelAndView model = new ModelAndView("login");
        model.addObject("login", new Login());
        return model;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView viewlogin(HttpServletRequest req, HttpServletResponse res, @ModelAttribute("login") Login login)
    {
        ModelAndView model = null;
        User user = userDao.validateUser(login);

        if (null != user) {
            model = new ModelAndView("welcome");
            model.addObject("name", user.getName());
        } else {
            model = new ModelAndView("login");
            model.addObject("message", "Username or Password is wrong!!");
        }

        return model;
    }



}
