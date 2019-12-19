package com.ljw.concurrency.jvm;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: lijw
 * @Date: 2019/12/5 20:51
 */
public class MyTest15 {
    public static void main(String[] args) {
        //        aa();
//        sortNumberStr();
//        regex();
        String s = null;
        System.out.println(JSONObject.toJSONString(s));
    }

    private static void regex() {
        String reg = "^((?!@).)*$";
        String reg2 = "((?![\\:： ]).)*";
        System.out.println(" sdfsf".matches(reg2));
    }

    private static void aa() {
        String[] strings = new String[2];
        System.out.println(strings.getClass());
        System.out.println(strings.getClass().getClassLoader());

        System.out.println("------------------");
        MyTest15[] myTest15s = new MyTest15[2];
        System.out.println(myTest15s.getClass().getClassLoader());

        System.out.println("----------------|");
        int[] ints = new int[2];
        System.out.println(ints.getClass().getClassLoader());
    }

    public static void sortNumberStr() {
        String s1 = "100";
        String s2 = "101";
        String s3 = "102";
        String s4 = "110";
        String s5 = "111";
        String s6 = "1001";
        String s7 = "1011";
        String s8 = "10011";

        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        list.add(s7);
        list.add(s8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
