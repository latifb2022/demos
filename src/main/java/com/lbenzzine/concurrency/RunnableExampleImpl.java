package com.lbenzzine.concurrency;


public class RunnableExampleImpl implements Runnable {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Runnable...");
        Runnable runnable = new RunnableExampleImpl();

        System.out.println("Creating Thread...");
        Thread thread = new Thread(runnable);

        System.out.println("Starting Thread...");
        thread.start();
    }

    @Override
    public void run() {
    	Thread.currentThread().setName("myThread");
        System.out.println("Inside : " + Thread.currentThread().getName());
    }
}