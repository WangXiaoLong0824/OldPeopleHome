package com.jk.service;

import com.jk.dao.TopMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TopServiceImo {
        @Resource
    private TopMapper topMapper;
}
