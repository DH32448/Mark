package com.example.dao;
import com.example.entity.Mark;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Mapper
public interface MarkDao {

    // 插入记录
    void addMark(@Param("sno") String sno, @Param("cno") String cno, @Param("score") BigDecimal score,
                 @Param("tpost") Date tpost, @Param("tid") int tid);

    // 删除记录
    void deleteMark(@Param("id") int id);

    // 更新记录
    void updateMark(@Param("id") int id, @Param("sno") String sno, @Param("cno") String cno,
                    @Param("score") BigDecimal score, @Param("tpost") Date tpost, @Param("tid") int tid);

    // 根据 ID 查询记录
    Mark getMarkById(@Param("id") int id);

    // 查询所有记录
    List<Mark> getAllMarks();
}