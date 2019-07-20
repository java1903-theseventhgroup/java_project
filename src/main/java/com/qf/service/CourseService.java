package com.qf.service;



import com.qf.response.QueryResponseResult;



public interface CourseService {
    QueryResponseResult findAll();                 //查询全部课程
    QueryResponseResult findByAbility(String courseCollege);            //查能力学院的课程
    QueryResponseResult findHomePage();  //专题首页过滤返回 （首页图片，上架时间，书标题，）
}
