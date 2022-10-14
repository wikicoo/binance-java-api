package com.binance.api.client.constant;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;

public class LogUtils {
    private static final Logger logger = LoggerFactory.getLogger(LogUtils.class);
    public static void i(String s, Throwable e){
        logger.debug(s, e);
    }
    public static void i(String s){
        logger.debug(s);
    }
}
