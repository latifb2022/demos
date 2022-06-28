package com.lbenzzine.concurrency;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {
	public static void main(String[] args) {
		System.out.println("Inside : " + Thread.currentThread().getName());

		System.out.println("Creating Executor Service...");
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		System.out.println("Creating a Runnable...");
		Runnable runnable = () -> {
			System.out.println("Inside : " + Thread.currentThread().getName());
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
            	long timeElapsed = Duration.between(start, finish).toMillis();  //in millis
            	System.out.println("at the end result is :" + result + " and it took " +
            	timeElapsed + " minutes to calculate");
		};

		System.out.println("Submit the task specified by the runnable to the executor service.");
		executorService.submit(runnable);
		System.out.println("Shutting down the executor");
		executorService.shutdown();
	}
}