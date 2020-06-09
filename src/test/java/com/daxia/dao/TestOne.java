package com.daxia.dao;

import com.daxia.util.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestOne {

    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    @Test
    //插入数据
    public void insert() {
        String sql = "insert into student(name,sex,age) values(?,?,?)";
        int update = jdbcTemplate.update(sql, "哈哈", "女", 25);
        System.out.println(update);
    }

    @Test
    //删除数据
    public void delect() {
        String sql2 = "delete from student where age=?";
        int update1 = jdbcTemplate.update(sql2, "25");
        System.out.println(update1);
    }

    @Test
    //修改数据
    public void update() {
        String sql3 = "update student set name=? where age=?";
        int update2 = jdbcTemplate.update(sql3, "呵呵", 25);
    }

}
