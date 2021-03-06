package com.fisher.gateway.feign;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.distance.common.vo.SysResourceVO;
import com.distance.common.vo.SysUserVo;
import com.distance.gateway.feign.SysResourceService;

import java.util.Set;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysResourceServiceTest {

    @Autowired
    private SysResourceService sysResourceService;

    @Test
    public void testListResourceByRole() {
        Set<SysResourceVO> set = sysResourceService.listResourceByRole("ROLE_ADMIN");
        System.out.println("=============="+set.size());
    }

}