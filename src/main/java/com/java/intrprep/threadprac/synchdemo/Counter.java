package com.java.intrprep.threadprac.synchdemo;

public class Counter {
    private int count = 0;

    //synchronization prevents race conditions, where the outcome of operations depends on the timing of thread execution.
    //It is the capability to control the access of multiple threads to any shared resource

    //When a method or block is declared as synchronized, only one thread can enter into that method or block.
    // When one thread will be executing synchronized method or block, the other threads which wants to execute that method or
    // block have to wait until first thread executes that method or block.
    // Thus avoiding the thread interference and achieving the thread safeness.

    /**
     * using synchronized keyword
     */
    /*public synchronized void increment(){
        count++;
    }*/

    /**
     * using synchronized block
     */
    public synchronized void increment(){
        synchronized (this){
            count++;
        }
    }

    public int getCount(){
        return count;
    }
}
