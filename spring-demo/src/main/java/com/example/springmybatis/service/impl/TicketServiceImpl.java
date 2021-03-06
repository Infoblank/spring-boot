package com.example.springmybatis.service.impl;

import com.example.springmybatis.entity.Ticket;
import com.example.springmybatis.dao.TicketDao;
import com.example.springmybatis.service.TicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Ticket)表服务实现类
 *
 * @author makejava
 * @since 2020-05-09 22:11:35
 */
@Service("ticketService")
public class TicketServiceImpl implements TicketService {
    @Resource
    private TicketDao ticketDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Ticket queryById(Integer id) {
        return this.ticketDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Ticket> queryAllByLimit(int offset, int limit) {
        return this.ticketDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ticket 实例对象
     * @return 实例对象
     */
    @Override
    public Ticket insert(Ticket ticket) {
        this.ticketDao.insert(ticket);
        return ticket;
    }

    /**
     * 修改数据
     *
     * @param ticket 实例对象
     * @return 实例对象
     */
    @Override
    public Ticket update(Ticket ticket) {
        this.ticketDao.update(ticket);
        return this.queryById(ticket.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ticketDao.deleteById(id) > 0;
    }
}