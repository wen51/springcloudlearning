package com.ljw.concurrency.lamada;

/**
 * @Author: lijw
 * @Date: 2020/1/7 10:23
 */
public interface TestService2 {

    /**
     * 默认方法
     * @return : void
     */
    default void testDefault() {
        System.out.println("this is testDefault method");
    }
}
