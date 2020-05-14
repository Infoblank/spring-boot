package com.example.springmybatis;

import com.example.springmybatis.entity.User;
import com.example.springmybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringMybatisApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        User user = new User();
        user.setSex("男");
        user.setAge(65);
        user.setName("黎明");
        user.setTel("2367892789");
        user.setRemark("四大天王之一");
        User insert = userService.insert(user);
        System.out.println(insert);
    }

}
