package com.distance.gen.model.query;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.distance.gen.model.entity.TableInfo;

import lombok.Data;


@Data
public class TableInfoQuery extends Page<TableInfo> {

    private String tableName;


}
