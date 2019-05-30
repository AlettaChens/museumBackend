package com.graduate.museum.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public  static String getCurrentStringDate(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String date=df.format(new Date());
        return date;
    }
}
