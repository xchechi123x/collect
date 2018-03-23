package com.jinke.collect.dto;

import lombok.Data;

import java.util.Date;

@Data
public class LoggerMessage {

    private String deviceToken = "-";
    private String userId = "-";
    private String refer = "-";
    private String event = "-";
    private String redirectType = "-";
    private String busiType = "-";
    private Long clientTime = 0l;
    private String addition = "-";
    private String userAgent = "-";

    private static String LOG_PATTERN = "%s %s %s %s %s %s %s %s %d %d";

    @Override
    public String toString() {
        return String.format(LOG_PATTERN, deviceToken,"[" + userAgent + "]", userId, refer, event, redirectType, busiType, addition, clientTime, new Date().getTime()).toString();
    }


}
