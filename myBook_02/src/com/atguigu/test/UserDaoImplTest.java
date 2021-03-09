package com.atguigu.test;

import com.atguigu.dao.impl.UserDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    @Test
    public void queryUserByUsername() {
        UserDaoImpl userDao=new UserDaoImpl();
        System.out.println(userDao.queryUserByUsername("admin"));
    }
}