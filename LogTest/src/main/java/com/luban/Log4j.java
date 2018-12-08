package com.luban;

import java.util.logging.Logger;

public class Log4j {


//-Dlog4j.configuration=file:////Users/wr/Desktop/python/web-ssm/LogTest/src/log4j.properties

    public static void log() {
        Logger logger = Logger.getLogger("log4j");
        logger.info("log4j");
    }


}
