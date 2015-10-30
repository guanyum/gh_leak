package com.canghai1xin.biz.service;

import com.canghai1xin.Application;
import com.canghai1xin.biz.domain.GhHouseDO;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class GhLeakServiceTest {

    @Autowired
    GhLeakService ghLeakService;
    
    @Test
    public void test1() {
        List<GhHouseDO> list = ghLeakService.listAllGhHouse();
        System.out.println("=============");
        System.out.println(list);
        System.out.println("=============");
    }

    @Ignore
    @Test
    public void test2() {
        for (int i = 34; i >= 2; i--) {
            ghLeakService.insert(String.format("3-1-%04d", (i * 100 + 1)));
            ghLeakService.insert(String.format("3-1-%04d", (i * 100 + 2)));
            ghLeakService.insert(String.format("3-1-%04d", (i * 100 + 3)));
            ghLeakService.insert(String.format("3-2-%04d", (i * 100 + 1)));
            ghLeakService.insert(String.format("3-2-%04d", (i * 100 + 2)));
            ghLeakService.insert(String.format("3-2-%04d", (i * 100 + 3)));
        }
    }
}
