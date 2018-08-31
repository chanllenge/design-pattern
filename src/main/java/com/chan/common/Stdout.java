package com.chan.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yuyuanhe
 * Date: 8/30/18 2:42 PM
 * Description:
 */
public class Stdout {

    public static void println(Object oj) {
        System.out.println(oj);
    }

    public static void debug(Object oj) {
        print("DEBUG", oj);
    }

    public static void error(Object oj) {
        print("ERROR", oj);
    }

    public static void info(Object oj) {
        print("INFO", oj);
    }

    private static void print(String level, Object oj) {
        System.out.println(time() + "[" + level + "] " + oj);
    }

    private static String time() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss:SSS] ");
        return dateFormat.format(date);
    }
}
