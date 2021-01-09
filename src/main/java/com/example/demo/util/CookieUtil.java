package com.example.demo.util;

import java.util.UUID;

public class CookieUtil {
    public static String generateCookie(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
