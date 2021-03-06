package com.distance.back.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.distance.back.model.entity.SysRole;
import com.distance.back.model.query.SysRoleQuery;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {


    /**
     * 分页查询
     * @param query
     * @return
     */
    IPage<SysRole> pageByQuery(SysRoleQuery query);


}
