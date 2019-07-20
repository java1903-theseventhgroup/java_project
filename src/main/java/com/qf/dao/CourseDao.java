package com.qf.dao;

import com.qf.domain.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseDao {
        List<Course> findAll();                                             //查询全部
        List<Course> findByAbility(String courseCollege);                   //根据能力学院查询课程
        List<Course> findHomePage();                                        //专题首页过滤返回 （首页图片，上架时间，书标题，）

}
