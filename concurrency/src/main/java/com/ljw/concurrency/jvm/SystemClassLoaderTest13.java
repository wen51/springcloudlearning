package com.ljw.concurrency.jvm;

/**
 * @Author: lijw
 * @Date: 2019/12/5 19:52
 */
public class SystemClassLoaderTest13 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);
        while (null != classLoader) {
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }
    }
}
