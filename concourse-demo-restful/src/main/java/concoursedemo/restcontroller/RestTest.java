package concoursedemo.restcontroller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bliang on 2/19/17.
 */
@RestController
public class RestTest {
    @Value("${restInfo}")
    private String restInfo ;

    Logger logger = Logger.getLogger(RestTest.class);

    @RequestMapping(value = "/restInfo")
    public String restInfo(){
        logger.info("restInfo is [ "+ restInfo +"]");
        return restInfo;
    }
}
