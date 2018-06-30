package com.study4j.distMall.service.controller;

import com.study4j.distMall.service.dao.TestDao;
import com.study4j.distMall.service.model.Test;
import com.study4j.distMall.service.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/test")
@Api(description = "测试Controller")
public class TestController {

    @Autowired
    private TestService testService;

    @ApiOperation(value = "测试")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test(@RequestParam String value) {
        return value;
    }

    @ApiOperation(value = "测试mysql")
    @RequestMapping(value = "/testMysql", method = RequestMethod.GET)
    @ResponseBody
    public List<Test> test(@RequestParam int id) {
        return testService.getValue(id);
    }

}
