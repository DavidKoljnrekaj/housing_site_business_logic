package SEP3.housing_site_business_logic.service;

import SEP3.housing_site_business_logic.database.DatabaseServerConnection;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogicServiceImpl implements BusinessLogicService {
    private DatabaseServerConnection database;
    public BusinessLogicServiceImpl()
    {
        database=new DatabaseServerConnection();
    }
}
