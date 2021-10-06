package com.wang.mapper;

import com.wang.pojo.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2021/10/6 0006
 */

//这个注解表示这是mybatis的mapper类
@Mapper
//dao层注解
@Repository
public interface userMapper
{
    List <user> queryUserList();

    user queryUserById(Integer id);

    Integer addUser(user user);

    Integer updateUser(user user);

    Integer delUser(Integer id);
}
