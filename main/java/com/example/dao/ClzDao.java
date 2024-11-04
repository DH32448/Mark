package com.example.dao;

import com.example.entity.Clz;
import com.example.entity.Task;
import com.example.entity.User;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClzDao {

  // 插入班级
  void addClass(@Param("clzno") int clzno, @Param("clzname") String clzname);

  // 删除班级
  void deleteClass(@Param("clzno") int clzno);

  // 更新班级名称
  void updateClass(@Param("clzno") int clzno, @Param("clzname") String clzname);

  // 根据班级编号查询班级
  Clz getClassById(@Param("clzno") int clzno);

  // 查询所有班级
   List<Clz> getAllClasses();
}
