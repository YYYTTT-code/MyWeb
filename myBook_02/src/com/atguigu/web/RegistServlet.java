package com.atguigu.web;

import com.atguigu.pojo.User;
import com.atguigu.service.UserService;
import com.atguigu.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistServlet extends HttpServlet {

    private UserService userService=new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String email =request.getParameter("email");
        String code=request.getParameter("code");
//        System.out.println(code);
//        System.out.println(code!="abcde");
        if(!code.equals("abcde")){
            response.sendRedirect("http://localhost:8080/myBook_02/pages/user/regist.html");
            System.out.println("验证码不对");
        }else {
            if (userService.existUsername(username)){
                response.sendRedirect("http://localhost:8080/myBook_02/pages/user/regist.html");
                System.out.println("用户名存在");
            }else {
                userService.registUser(new User(null,username,password,email));
                System.out.println("注册成功");
                response.sendRedirect("http://localhost:8080/myBook_02/pages/user/regist_success.html");
            }
        }






    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("请使用post请求");

    }
}
