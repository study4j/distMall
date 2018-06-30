package com.study4j.distMall.service.dao;

import com.study4j.distMall.service.model.Test;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TestDao extends Repository<Test, Long> {

    List<Test> findAllById(int id);

}
