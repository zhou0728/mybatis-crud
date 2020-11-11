package com.qf.dao;

import com.qf.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author ZHOU
 * @create 2020/11/10 17:15
 */
public interface UsersDao {

    List<Users> selectAll();

    Users selectById(@Param("id")Integer id);

    List<Users> selectByName(@Param("uname")String uname);

    Integer addByUser(Users users);


}
