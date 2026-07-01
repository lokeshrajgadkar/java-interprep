package com.java.intrprep.threadprac;

public class ThreadInterruptMethod extends Thread{
    //This example covers the interrupt method of Thread
    //t1.interrupt() //current thread will interrupt the mentioned thread, throws InterruptedException

    public ThreadInterruptMethod(String name){
        super(name);
    }

    @Override
    public void run(){
        try {
            System.out.println("Thread " + currentThread().getName() + " started...");
            Thread.sleep(3000);
            System.out.println("Thread " + currentThread().getName() + "completed");
        } catch (InterruptedException ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        ThreadInterruptMethod t1 = new ThreadInterruptMethod("t1");

        t1.start();
        t1.interrupt();
    }
}
