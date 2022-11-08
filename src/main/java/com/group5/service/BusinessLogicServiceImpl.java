package com.group5.service;

import com.group5.database.DatabaseServerConnection;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogicServiceImpl implements BusinessLogicService {
    private DatabaseServerConnection database;
    public BusinessLogicServiceImpl()
    {
        //database=new DatabaseServerConnection();
    }
}
