package com.luban;

import java.util.logging.Logger;

/***
 *
 * jdk 自带的
 *
 * */
public class jul {

    public static void log() {
        Logger logger = Logger.getLogger("jul");
        logger.info("jul");

    }
}
