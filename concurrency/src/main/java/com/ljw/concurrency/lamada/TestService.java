package com.ljw.concurrency.lamada;

/**
 * @Author: lijw
 * @Date: 2020/1/4 16:45
 */
public interface TestService {

    /**
     * 默认方法
     * @return : void
     */
    default void testDefault() {
        System.out.println("this is testDefault method");
    }

    /**
     * 默认方法
     * @return : void
     */
    default void testDefaultConflict() {
        System.out.println("this is testDefault method");
    }
    /**
     * 静态方法
     * @return : void
     */
    static void testStatic() {
        System.out.println("this is first testStatic method");
    }

    static void testStatic2() {
        System.out.println("this is second testStatic method");
    }
}
