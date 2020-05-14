package com.example.springmybatis.controller;

import com.example.springmybatis.entity.Ticket;
import com.example.springmybatis.service.TicketService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Ticket)表控制层
 *
 * @author makejava
 * @since 2020-05-09 22:11:35
 */
@RestController
@RequestMapping("ticket")
public class TicketController {
    /**
     * 服务对象
     */
    @Resource
    private TicketService ticketService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Ticket selectOne(Integer id) {
        return this.ticketService.queryById(id);
    }

}