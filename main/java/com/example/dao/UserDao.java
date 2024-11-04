package com.example.dao;

import com.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {

   public int add(User u);
    //添加     public int update(User u);
// 更新, 最好使用条件更新方式书写      public int updatePwd(User u);
//更新密码
 public User  findById(int uid);
// 根据role找
public List<User> findByRole(String role);
public int del(int uid);

public User findByPhone(String phone);

}




