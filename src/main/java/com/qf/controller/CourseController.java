package com.qf.controller;

import com.qf.response.QueryResponseResult;
import com.qf.service.CourseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
//xiugai个啥呀
@Controller
@ResponseBody
@RequestMapping("Course")
public class CourseController {
    @Autowired
    private  CourseService courseService;                                       //查询全部课程表
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    @ApiOperation(value = "课程全部查询接口",notes = "返回的是课程表所有数据")
    public QueryResponseResult findAll(){
        return courseService.findAll();
    }


    @RequestMapping(value = "findByAbility",method = RequestMethod.POST)     //查询课程里边的能力学院
    @ApiOperation(value = "课程对应能力学院查询接口",notes ="返回全部课程能力学院的客程内容")
    public QueryResponseResult findByAbility(String courseCollege){
        return courseService.findByAbility(courseCollege);
    }

    @RequestMapping(value = "findHomePage",method = RequestMethod.POST)     //题首页过滤返回 （首页图片，上架时间，书标题，）
    @ApiOperation(value = "专题首页展示内容接口",notes ="返回专题首页图片，上架时间，书标题，并根据上架时间排序")
    public QueryResponseResult findHomePage() {
        return courseService.findHomePage();
    }

}
