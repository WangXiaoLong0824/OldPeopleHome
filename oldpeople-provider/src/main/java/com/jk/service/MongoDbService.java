package com.jk.service;

import com.jk.entity.PageResult;

public interface MongoDbService {

    PageResult findLog(Integer currPage, Integer pageSize);
}
