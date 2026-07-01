package com.java.intrprep.threadprac;

public class MyThread extends Thread {
    // This exmaple covers Thread methods- start, run, sleep, thread name, setPriority

    // run(){} //actual implementation, it is overriden method of Thread class

    // t1.setPriority(int priority); //1 to 10, 10 being highest priority,
    // Thread priority only provides a scheduling hint. The JVM and operating system decide the actual execution order.
    public MyThread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {

            String a="";
            for (int j = 0; j < 10000; j++) {
                a+="a";
            }
            System.out.println(currentThread().getName()+ " Priority: "+ currentThread().getPriority()  );
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex){
            System.out.println(ex);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Low priority thread t1");
        MyThread t2 = new MyThread("Normal priority thread t2");
        MyThread t3 = new MyThread("High priority thread t3");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
