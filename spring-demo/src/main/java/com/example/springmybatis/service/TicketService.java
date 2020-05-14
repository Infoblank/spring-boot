package com.example.springmybatis.service;

import com.example.springmybatis.entity.Ticket;
import java.util.List;

/**
 * (Ticket)表服务接口
 *
 * @author makejava
 * @since 2020-05-09 22:11:34
 */
public interface TicketService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Ticket queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Ticket> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ticket 实例对象
     * @return 实例对象
     */
    Ticket insert(Ticket ticket);

    /**
     * 修改数据
     *
     * @param ticket 实例对象
     * @return 实例对象
     */
    Ticket update(Ticket ticket);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}