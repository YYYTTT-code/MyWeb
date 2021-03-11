package com.atguigu.test;

import com.atguigu.pojo.User;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class jsonTest {
    public static void main(String[] args) {
        User user = new User(1, "name", "com", "hhh");
        Gson gson = new Gson();
        String s = gson.toJson(user);
        System.out.println(s);
        User user1=gson.fromJson(s,User.class);
        System.out.println(user1);

        //测试list类
        user1.setId(2);
        List<User> list=new ArrayList<>();
        list.add(user);
        list.add(user1);
        String s1 = gson.toJson(list);
        System.out.println(s1);
        List<User> list1= gson.fromJson(s1, new UserListType().getType());
        System.out.println(list1);

    }
}
