package com.kgy.blog.service;

import com.kgy.blog.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestService {
    @Autowired
    TestDao testDao;

    public List<Map<String, Object>> test(){
       return testDao.test();
    }
}
