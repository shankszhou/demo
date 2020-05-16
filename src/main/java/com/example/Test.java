package com.example;

import sun.security.provider.PolicySpiFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ZY
 * @date 2020/5/15 - 0:30
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("aaa");


        List<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");

        for (String s : list) {
            System.out.println(s);
        }
        String[] arr = new String[]{"aaa","bbb","ccc"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        Scanner sc = new Scanner(System.in);

        int aaa=sc.nextInt();
        System.out.println("aaa---"+aaa);

        System.out.println("aaa");

        int a = 1/0;

        System.out.println("a--" + a);

    }

}
