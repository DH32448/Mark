package com.example.controller;

import com.example.dao.UserDao;
import com.example.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.xml.ws.RequestWrapper;

@Controller
@RequestMapping("/HomeController")
public class HomeController {
    @Autowired
    UserDao userDao;

    HomeController(){
        System.out.println("HomeController输出构造被调用");
    }
    @RequestMapping("/gomain")
    public String A( Model model){



        return "/main";
    }
    @PostMapping("/denlu")
    public String denlu(User user,HttpSession session){  System.out.println(user);
        User byPhone = userDao.findByPhone(user.getPhone());
        if (byPhone!= null && byPhone.getPhone().equals(user.getPhone())) {
            session.setAttribute("loggedInUser", byPhone);

            return "forward:/HomeController/gomain";
        } else {
            return "/main";
        }



    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 清除 session 中的用户信息
        session.invalidate();
        return "redirect:/HomeController/gomain";
    }

}
