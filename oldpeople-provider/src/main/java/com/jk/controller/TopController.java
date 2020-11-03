package com.jk.controller;

import com.jk.service.TopService;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TopController {
        @Resource
    private TopService topService;
}
