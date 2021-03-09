package com.atguigu.service;

import com.atguigu.pojo.User;

public interface UserService {
    /*
    * */
    public void  registUser(User user);

    public User login(User user);

    public Boolean existUsername(String username);
}
