package com.example.springmybatis.validate;

import com.example.springmybatis.entity.User;

import java.util.HashMap;
import java.util.Map;

public class ValidateUser {
    public static Map<String, String> map =new HashMap();
    public static Map validateUser(User user){
        Integer age = user.getAge();
        if(age>=120 || age <=0){
            map.put("age","年龄不正确");
            //return map;
        }
        String name = user.getName();
        if(name.length()>5 || name==null){
            map.put("name","名字不符合规则");
        }
        String tel = user.getTel();
        if(tel.length()!=11 || tel.length()!=7){
            map.put("tel","电话号码不正确");
        }
        return map;
    }
}
