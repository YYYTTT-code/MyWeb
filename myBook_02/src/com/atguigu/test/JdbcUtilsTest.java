package com.atguigu.test;

import com.atguigu.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

import static org.junit.Assert.*;

public class JdbcUtilsTest {

    @Test
    public void getConnection() {
        for (int i=0;i<20;i++){
            Connection connection=JdbcUtils.getConnection();
            System.out.println(connection);
            JdbcUtils.close(connection);

        }
    }
}