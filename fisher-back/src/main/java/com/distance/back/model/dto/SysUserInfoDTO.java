package com.distance.back.model.dto;

import lombok.Data;

import java.util.List;

import com.distance.back.model.entity.SysUser;

@Data
public class SysUserInfoDTO {

    private SysUser sysUser;

    private List<String> roles;

    private List<String> permissions;
}
