package com.example.springmybatis.controller;

import com.example.springmybatis.entity.User;
import com.example.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (User)表控制层
 *
 * @author manger
 * @since 2020-05-09 22:11:33
 */
@RestController
@RequestMapping("user")
public class UserController {

    Map<String, Object> map = new HashMap();
    /**
     * 服务对象
     */
    @Autowired
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Integer id) {
        return this.userService.queryById(id);
    }

    @GetMapping(value = "selectAll")
    public List<User> getAllUsers() {
        return this.userService.queryAll();
    }

    @GetMapping("test")
    public String test() {
        return "test ok!";
    }


    @PostMapping("save")
    public Map saveUser(User user) {
        this.map.clear();
        String sex = user.getSex();
        if ("1".equals(sex)) {
            user.setSex("男");
        }
        if ("2".equals(sex)) {
            user.setSex("女");
        }
        /*Map validateUserMap = ValidateUser.validateUser(user);
        if(validateUserMap.size()>0){
            this.map.put("msg",validateUserMap);
            return this.map;
        }*/
        try {
            this.userService.insert(user);
            this.map.put("success", true);
        } catch (Exception e) {
            e.printStackTrace();
            this.map.put("success", false);
            this.map.put("mag", e.toString());
        }
        return this.map;
    }
}