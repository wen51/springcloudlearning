package com.ljw.concurrency.jvm;

import java.util.Random;

/**
 * @Author: lijw
 * @Date: 2019/12/2 14:09
 */
public class MyTest5 {
    public static void main(String[] args) {
        int a = 2;
        String s = "sdfs";
        System.out.println(MyChild5.b);
    }

}

interface MyParent5 {
    Thread t = new Thread(){
        {
            System.out.println("Myparent5 init");
        }
    };

}

class MyChild5 implements MyParent5 {
    public static int b = 6;
}
