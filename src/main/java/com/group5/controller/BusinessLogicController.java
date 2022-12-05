package com.group5.controller;

import com.group5.model.User;
import com.group5.service.BusinessLogicServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/housingsite")
public class BusinessLogicController {

    private BusinessLogicServiceImpl businessLogicService;
    public BusinessLogicController(BusinessLogicServiceImpl businessLogicService)
    {
        this.businessLogicService=businessLogicService;
    }


}
