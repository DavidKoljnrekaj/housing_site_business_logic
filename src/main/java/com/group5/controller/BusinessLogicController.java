package com.group5.controller;

import com.group5.service.BusinessLogicServiceImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessLogicController {

    private BusinessLogicServiceImpl businessLogicService;
    public BusinessLogicController(BusinessLogicServiceImpl businessLogicService)
    {
        this.businessLogicService=businessLogicService;
    }
}
