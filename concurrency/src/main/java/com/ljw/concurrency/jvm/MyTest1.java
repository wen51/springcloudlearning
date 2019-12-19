package com.ljw.concurrency.jvm;

/**
 * @Author: lijw
 * @Date: 2019/11/30 17:37
 */
public class MyTest1 {

    public static void main(String[] args) {
        System.out.println(MyChild1.str);
    }

}

class MyParent1 {
    public static final String str = "Hello World";

    static {
        System.out.println("MyParent1 static init");
    }
}

class MyChild1 extends MyParent1 {
    public static String str1 = "welcome";

    static {
        System.out.println("MyChild1 static init");
    }
}
