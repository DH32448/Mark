package com.example.dao;
import com.example.entity.Course;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface  CourseDao {

    // 插入课程
    void addCourse(@Param("cname") String cname);

    // 删除课程
    void deleteCourse(@Param("cname") String cname);

    // 更新课程名称
    void updateCourse(@Param("oldCname") String oldCname, @Param("newCname") String newCname);

    // 根据课程名称查询课程
    Course getCourseByName(@Param("cname") String cname);

    // 查询所有课程
  List<Course> getAllCourses();
}
