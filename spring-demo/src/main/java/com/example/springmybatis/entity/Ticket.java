package com.example.springmybatis.entity;

import java.io.Serializable;

/**
 * (Ticket)实体类
 *
 * @author makejava
 * @since 2020-05-09 22:11:34
 */
public class Ticket implements Serializable {
    private static final long serialVersionUID = 520883211707067802L;
    
    private Integer id;
    
    private String address;
    
    private String price;
    
    private Integer uid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

}