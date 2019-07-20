package com.qf.dao;

import com.qf.domain.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseDao {
        List<Course> findAll();    //查询全部
}
