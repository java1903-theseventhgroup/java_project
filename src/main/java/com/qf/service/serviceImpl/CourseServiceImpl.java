package com.qf.service.serviceImpl;

import com.qf.dao.CourseDao;
import com.qf.domain.Course;
import com.qf.response.CommonCode;
import com.qf.response.QueryResponseResult;
import com.qf.response.QueryResult;
import com.qf.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;
    @Override
    public QueryResponseResult findAll() {                                //查询课程表全部
        List<Course> all = courseDao.findAll();

        QueryResult<Course> userQueryResult = new QueryResult<>();
        userQueryResult.setList(all);

        return new QueryResponseResult<>(CommonCode.SUCCESS,userQueryResult);

    }
}
