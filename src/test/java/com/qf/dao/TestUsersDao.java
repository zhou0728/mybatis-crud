package com.qf.dao;

import com.qf.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author ZHOU
 * @create 2020/11/10 17:22
 */
public class TestUsersDao {

    @Test
    public void testSelectAll() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UsersDao mapper = sqlSession.getMapper(UsersDao.class);
        List<Users> users = mapper.selectAll();
        for (Users user : users) {
            System.out.println("user = " + user);
        }

    }

    @Test
    public void testSelectById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UsersDao mapper = sqlSession.getMapper(UsersDao.class);
        Users users = mapper.selectById(17);
        System.out.println("users = " + users);

    }
    @Test
    public void testSelectByName() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UsersDao mapper = sqlSession.getMapper(UsersDao.class);
        List<Users> list = mapper.selectByName("zhou");
        for (Users users : list) {
            System.out.println("users = " + users);
        }

    }

    @Test
    public void testAddByUser() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UsersDao mapper = sqlSession.getMapper(UsersDao.class);
        Users user = new Users();
        user.setUName("dong");
        user.setUPassword("123");
        user.setUSex("女");
        Integer integer = mapper.addByUser(user);
        System.out.println("integer = " + integer+"-------"+user.getUId());

    }
}
