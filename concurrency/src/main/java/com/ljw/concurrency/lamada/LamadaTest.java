package com.ljw.concurrency.lamada;

/**
 * @Author: lijw
 * @Date: 2019/12/19 10:40
 */
public class LamadaTest {

    public static void main(String[] args) {
//        interfaceMethod();
        defaultMethodConflict();
    }

    private static void defaultMethodConflict() {
        TestServiceImpl t = new TestServiceImpl();
        t.testDefaultConflict();
    }

    private static void interfaceMethod() {
        TestService.testStatic();
        TestService t = new TestServiceImpl();
        t.testDefault();
    }
}
