package com.distance.gen.mapper;

import org.apache.ibatis.annotations.Param;

import com.distance.gen.model.entity.ColumnInfo;

import java.util.List;

public interface ColumnInfoMapper {

    /**
     * 查询单个表的列详细信息
     * @param tableName
     * @return
     */
    List<ColumnInfo> listByTableName(@Param("tableName") String tableName);

}
