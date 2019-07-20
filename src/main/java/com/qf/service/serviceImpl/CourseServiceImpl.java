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

    /**
     *          查询全部课程表
     * @return
     */
    @Override
    public QueryResponseResult findAll() {

        List<Course> all = courseDao.findAll();
        QueryResult<Course> userQueryResult = new QueryResult<>();
        userQueryResult.setList(all);
        return new QueryResponseResult<>(CommonCode.SUCCESS,userQueryResult);
    }

    /**
     *         查询能力学院全部课程
     * @return
     */
    @Override
    public QueryResponseResult findByAbility(String courseCollege) {

        List<Course> listByAbility = courseDao.findByAbility(courseCollege);
        QueryResult<Course> userQueryResult = new QueryResult<>();
        userQueryResult.setList(listByAbility);
        return new QueryResponseResult<>(CommonCode.SUCCESS,userQueryResult);
    }

    /**
     * //专题首页过滤返回 （首页图片，上架时间，书标题，）
     * @return
     */
    @Override
    public QueryResponseResult findHomePage() {
        List<Course> listByAbility = courseDao.findHomePage();
        QueryResult<Course> userQueryResult = new QueryResult<>();
        userQueryResult.setList(listByAbility);
        return new QueryResponseResult<>(CommonCode.SUCCESS,userQueryResult);
    }
}
