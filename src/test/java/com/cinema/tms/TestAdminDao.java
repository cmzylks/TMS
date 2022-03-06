package com.cinema.tms;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cinema.tms.dao.AdminDao;
import com.cinema.tms.entity.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TestAdminDao {
    @Autowired
    private AdminDao adminDao;

    @Test
    void test() {
        List<Admin> adminList = adminDao.selectList(new QueryWrapper<Admin>().eq("admin_id", 1).eq("name","admin"));
        adminList.forEach(admin -> {
            System.out.println(admin);
        });
    }
}
