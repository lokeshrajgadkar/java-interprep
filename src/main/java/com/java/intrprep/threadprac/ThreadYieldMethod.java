package com.java.intrprep.threadprac;

public class ThreadYieldMethod extends Thread{
    // This exmaple covers Thread method - yield()
    //Thread.yield()  //hint to scheduler that other thread can be given a chance to run
    public ThreadYieldMethod(String name){
        super(name);
    }

    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread " + currentThread().getName() + " started...");
                Thread.yield();
                Thread.sleep(3000);
                System.out.println("Thread " + currentThread().getName() + " completed");
            }
        } catch (InterruptedException ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        ThreadYieldMethod t1 = new ThreadYieldMethod("t1");
        ThreadYieldMethod t2 = new ThreadYieldMethod("t2");

        t1.start();
        t2.start();
    }

}
