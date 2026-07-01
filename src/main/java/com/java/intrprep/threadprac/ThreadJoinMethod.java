package com.java.intrprep.threadprac;

public class ThreadJoinMethod extends Thread{

    //t1.join()  //Current method/thread will wait for termination of t1 thread

    public ThreadJoinMethod(String name){
        super(name);
    }

    @Override
    public void run(){
        try {
            System.out.println("Thread: "+Thread.currentThread().getName()+" is started..");
            Thread.sleep(5000);
            System.out.println("Thread: "+Thread.currentThread().getName()+" is completed");
        } catch (InterruptedException ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadJoinMethod t1 = new ThreadJoinMethod("t1");
        ThreadJoinMethod t2 = new ThreadJoinMethod("t2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Main completed");
    }
}
