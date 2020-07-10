package com.example;

import sun.security.provider.PolicySpiFile;

import java.util.*;

/**
 * @author ZY
 * @date 2020/5/15 - 0:30
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("aaa");
//      System.out.println(System.currentTimeMillis());

//      System.out.println(System.currentTimeMillis());

        System.out.println(new Date(System.currentTimeMillis()));

        System.out.println(new Date(1590114562848L));

        /*****************test****************/
       /*System.out.println("*****************test****************");

        System.out.println("bool--"+"abc".contains(""));

        System.out.println("one more line!!!");*/

        Calendar cal = Calendar.getInstance();

        cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH), 0, 0, 0);
//        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
//        cal.setTime(new Date());
        cal.add(Calendar.HOUR_OF_DAY, -24);

//        cal.add(Calendar.HOUR_OF_DAY, 24);

        System.out.println("*************************");

        System.out.println(cal);

        System.out.println(cal.getTime());

        System.out.println("*************************************");

        System.out.println("this is a test!!!");

    }

}
