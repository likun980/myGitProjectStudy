package com.daxia.dao;

import com.daxia.domain.Student;
import com.daxia.util.JDBCUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class TestOne {

    JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    //查询数据
    @Test
    public void asd(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
        String sql4="SELECT * FROM student";
        List<Student> students = jdbcTemplate.query(sql4, new BeanPropertyRowMapper<>(Student.class));
        for (Student student : students) {
            System.out.println(student);
        }
    }

    @Test
    //插入数据
    public void insert() {
        String sql = "insert into student(name,sex,age) values(?,?,?)";
        int update = jdbcTemplate.update(sql, "哈哈", "女", 25);
        System.out.println(update);
    }

    @Test
    //修改数据
    public void update() {
        String sql3 = "update student set name=? where age=?";
        int update2 = jdbcTemplate.update(sql3, "呵呵", 25);
        System.out.println(update2);
    }


    @Test
    //删除数据
    public void delect() {
        String sql2 = "delete from student where age=?";
        int update1 = jdbcTemplate.update(sql2, "25");
        System.out.println(update1);
    }


}
