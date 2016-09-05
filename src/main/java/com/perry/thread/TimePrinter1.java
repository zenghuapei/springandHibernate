package com.perry.thread;

import java.util.Date;

/**
 * Created by zenghuapei on 2016/8/29.
 */
public class TimePrinter1 implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    int pauseTime;
    String name;
    public TimePrinter1(int x, String n) {
        pauseTime = x;
        name = n;
    }
    public void run() {
        while(true) {
            try {
                System.out.println(name + ":" + new
                        Date(System.currentTimeMillis()));
                Thread.sleep(pauseTime);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
    static public void main(String args[]) {
        Thread t1 = new Thread (new TimePrinter1(1000, "Fast Guy"));
        t1.start();
        Thread t2 = new Thread (new TimePrinter1(3000, "Slow Guy"));
        t2.start();

    }
}
