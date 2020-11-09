package com.jk.service;

import com.jk.entity.Careful;
import com.jk.entity.PageResult;

public interface CarefulService {
    PageResult findCarefulPage(Integer currPage, Integer pageSize, Careful careFul);

    void addCareful(Careful careful);

    void deleteCarefulById(Integer carefulId);

    Careful findCarefulById(Integer carefulId);
}
