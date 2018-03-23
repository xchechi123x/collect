package com.jinke.collect.actions;


import com.jinke.collect.common.Constant;
import com.jinke.collect.common.Response;
import com.jinke.collect.dto.LoggerMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/collect")
public class LoggerAction {

    public static final Logger logger = LoggerFactory.getLogger(Constant.COLLECT_LOGGER);

    @RequestMapping(path = "logger", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Response logger(@RequestHeader HttpHeaders headers, @RequestBody LoggerMessage loggerMessage) {
        Response response = new Response();
        loggerMessage.setDeviceToken(headers.getFirst("deviceToken") != null ? headers.getFirst("deviceToken") : "-");
        loggerMessage.setUserAgent(headers.getFirst("user-agent") != null ? headers.getFirst("user-agent") : "-");
        logger.info(loggerMessage.toString());
        return response;
    }

}
