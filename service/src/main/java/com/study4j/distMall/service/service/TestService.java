package com.study4j.distMall.service.service;

import com.study4j.distMall.service.dao.TestDao;
import com.study4j.distMall.service.model.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestDao testDao;

    public List<Test> getValue(int id) {
        return testDao.findAllById(id);
    }

}
