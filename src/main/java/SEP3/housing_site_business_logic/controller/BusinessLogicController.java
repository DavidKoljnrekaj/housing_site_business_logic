package SEP3.housing_site_business_logic.controller;

import SEP3.housing_site_business_logic.database.DatabaseServerConnection;
import SEP3.housing_site_business_logic.service.BusinessLogicServiceImpl;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessLogicController {

    private BusinessLogicServiceImpl businessLogicService;
    public BusinessLogicController(BusinessLogicServiceImpl businessLogicService)
    {
        this.businessLogicService=businessLogicService;
    }
}
