package com.java.intrprep.threadprac;

public class ThreadDaemonMethod extends Thread{
    // This exmaple covers Thread method - setDaemon()
    //t1.setDeamon(true); //By default when we create a thread it is User Thread and
    // main always waits until user thread has completed its execution,
    // deamon threads are those for which main doesnt wait, to make any userthread as deamon thread,
    // setDaemon(true) can be used.
    public ThreadDaemonMethod(String name){
        super(name);
    }

    @Override
    public void run(){
        while (true){
            System.out.println("Thread: " + Thread.currentThread().getName() + " is running..");
        }
    }

    public static void main(String[] args) {
        ThreadDaemonMethod t1 = new ThreadDaemonMethod("t1");
        //ThreadDaemonMethod t2 = new ThreadDaemonMethod("t2");

        t1.setDaemon(true);
        t1.start();
        //t2.start();

        System.out.println("Main thread is done");
    }
}
