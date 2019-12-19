package com.ljw.concurrency.jvm;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @Author: lijw
 * @Date: 2019/12/5 19:42
 */
public class ContextClassLoaderTest14 {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String sourceName = "com/ljw/concurrency/jvm/MyTest5.class";
        Enumeration<URL> resource = classLoader.getResources(sourceName);
        while (resource.hasMoreElements()){
            System.out.println(resource.nextElement());
        }

        System.out.println("------------");

        Class<?> clazz = ContextClassLoaderTest14.class;
        System.out.println(clazz.getClassLoader());

        Class<?> clazz2 = String.class;
        System.out.println(clazz2.getClassLoader());
    }
}
