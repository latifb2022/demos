package com.lbenzzine.concurrency;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsMultiThreadsExample {

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service with a thread pool of Size 3");
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable task1 = () -> {
            System.out.println("Executing Task1 inside : " + Thread.currentThread().getName());
            double result = 0;
            
            Instant start = Instant.now();

            	for (int i = 1 ; i < 1000; i++) {
            		
            		 try {
            			TimeUnit.MILLISECONDS.sleep(200);
            			 result += Math.pow(i, 2);
            		 } catch (InterruptedException ex) {
            			 throw new IllegalStateException(ex);
            		 }
            	}
            	Instant finish = Instant.now();
            	long timeElapsed = Duration.between(start, finish).toMinutes();  //in millis
            	System.out.println("at the end result is :" + result + " and it took " +
            	timeElapsed + " to calculate");
        };

        Runnable task2 = () -> {
            System.out.println("Executing Task2 inside : " + Thread.currentThread().getName());
            System.out.println(Thread.activeCount());
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };

        Runnable task3 = () -> {
            System.out.println("Executing Task3 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };
        
        Runnable task4 = () -> {
            System.out.println("Executing Task4 inside : " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException ex) {
                throw new IllegalStateException(ex);
            }
        };


        System.out.println("Submitting the tasks for execution...");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);

        executorService.shutdown();
    }
}
