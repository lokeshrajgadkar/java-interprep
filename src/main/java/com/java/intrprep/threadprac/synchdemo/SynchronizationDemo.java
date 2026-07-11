package com.java.intrprep.threadprac.synchdemo;

public class SynchronizationDemo {
    public static void main(String[] args) {
        //synchronization prevents race conditions, where the outcome of operations depends on the timing of thread execution.
        // It is the capability to control the access of multiple threads to any shared resource


        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception ex){
            System.out.println(ex);
        }
        System.out.println(counter.getCount());


    }
}
