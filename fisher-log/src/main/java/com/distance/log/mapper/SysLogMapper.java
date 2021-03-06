package com.distance.log.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.distance.log.model.entity.SysLog;
import com.distance.log.model.query.SysLogQuery;


public interface SysLogMapper extends BaseMapper<SysLog> {

    /**
     * 日志信息分页查询
     * @param query
     */
    IPage<SysLog> pageByQuery(SysLogQuery query);
}
