package com.example.dao;

import com.example.entity.Task;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TaskDao {

    // 插入任务
    void addTask(@Param("kid") int kid, @Param("tid") int tid, @Param("clzno") String clzno, @Param("cno") String cno);

    // 删除任务
    void deleteTask(@Param("kid") int kid);

    // 更新任务
    void updateTask(@Param("kid") int kid, @Param("tid") int tid, @Param("clzno") String clzno, @Param("cno") String cno);

    // 根据 ID 查询任务
    Task getTaskById(@Param("kid") int kid);

    // 查询所有任务
    List<Task> getAllTasks();
}
//public interface TaskDao {
    //@Select("select * from t_task")
  //  public List<TaskEntity> findAll();   //查找全部
 ////   public List<TaskEntity> findByClzno(String clzno);  //根据班级编号查找  -》假设学生用的
  //  public List<TaskEntity> findByTid(int tid);  //根据教师ID 查找        -》假设教师用的
 //  public int  add(TaskEntity task);  //添加
  //  public int remove(TaskEntity kid);   //删除

