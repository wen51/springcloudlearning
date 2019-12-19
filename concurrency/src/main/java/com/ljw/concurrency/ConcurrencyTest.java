package com.ljw.concurrency;

/** @Author: lijw @Date: 2019/11/29 10:26 */
public class ConcurrencyTest {

    private static final long count = 100000000000L;

    public static void main(String[] args) throws InterruptedException {
//        long a = 0;
//        long start = System.currentTimeMillis();
//        System.out.println(start);
//        for (long i = 0; i <10000000000L; i++) {
//            a++;
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end);
//        System.out.println(end - start);
        concurrency();
        serial();
    }

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println(count);

        Thread t =
                new Thread(
                        new Runnable() {
                            @Override
                            public void run() {
                                long a = 5;
                                for (int i = 0; i < count; i++) {
                                    a += 5;
                                }
                            }
                        });
        t.start();
        long b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        t.join();
        long time = System.currentTimeMillis() - start;

        System.out.println("concurrency cost : " + time +", b= "+b );
    }

    private static void serial() {
        long start = System.currentTimeMillis();
        System.out.println(count);
        long a = 5;
        for (int i = 0; i < count; i++) {
            a += 5;
        }
        long b = 0;
        for (int i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial     cost : " + time +",b="+b +",a="+a);
        System.out.println();
    }
}
