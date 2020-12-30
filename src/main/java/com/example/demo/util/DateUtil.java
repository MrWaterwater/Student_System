package com.example.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String format(Date date){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        System.out.println(format.format(date));
        return format.format(date);
    }
}
