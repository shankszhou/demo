package com.example;

import java.util.Calendar;
import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, 6, 1, 0, 0, 0);
//        calendar.add(Calendar.DAY_OF_MONTH, 7);
//        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//        calendar.add(Calendar.DAY_OF_WEEK, 1);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date date = calendar.getTime();

        System.out.println("*************************");
        System.out.println(date);



    }
}
