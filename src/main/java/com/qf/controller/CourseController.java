package com.qf.controller;

import com.qf.response.QueryResponseResult;
import com.qf.service.CourseService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("haha")
public class CourseController {
    @Autowired
    private  CourseService courseService;
    @RequestMapping(value = "findAll",method = RequestMethod.GET)
    @ApiOperation(value = "查询全部")
    public QueryResponseResult findAll(){


        return courseService.findAll();
    }



}
