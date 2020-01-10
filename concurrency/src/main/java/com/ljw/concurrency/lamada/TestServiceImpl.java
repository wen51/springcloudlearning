package com.ljw.concurrency.lamada;

/**
 * @Author: lijw
 * @Date: 2020/1/4 16:48
 */
public class TestServiceImpl extends SuperClass implements TestService, TestService2 {

    /**
     * 默认方法
     *
     * @return : void
     */
    @Override
    public void testDefault() {
        System.out.println("impl testDefault");
    }
}
