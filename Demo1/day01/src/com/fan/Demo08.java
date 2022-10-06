package com.fan;

import java.util.ArrayList;
import java.util.List;

public class Demo08 {
    public static void main(String[] args) {
        boolean equals = "111".equals("111");
        System.out.println(equals);
        List<String> lists = new ArrayList<>();
        lists.add("123");
        lists.add("456");
        lists.add("789");
        for (String s : lists) {
            System.out.println(s);
        }
    }
}
