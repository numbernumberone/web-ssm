package com.luban;

import java.util.logging.Logger;

public class Log4j {




    public static void log() {
        Logger logger = Logger.getLogger("log4j");
        logger.info("log4j");
    }


}
