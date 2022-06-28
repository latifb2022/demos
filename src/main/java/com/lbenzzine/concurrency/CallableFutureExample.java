package com.lbenzzine.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableFutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Double> callable = () -> {
            // Perform some computation
            System.out.println("Entered Callable");
            //Thread.sleep(2000);
            double result = 0;
            for (int i = 1 ; i < 1000; i++) {
        		
       		 try {
       			TimeUnit.MILLISECONDS.sleep(200);
       			 result += Math.pow(i, 2);
       		 } catch (InterruptedException ex) {
       			 throw new IllegalStateException(ex);
       		 }
       	}
            return result;
        };

        System.out.println("Submitting Callable");
        Future<Double> future = executorService.submit(callable);

        // This line executes immediately
        System.out.println("Do something else while callable is getting executed");

        System.out.println("Retrieve the result of the future");
        // Future.get() blocks until the result is available
        Double result = future.get();
        System.out.println("the computaion result is " + result);

        executorService.shutdown();
    }

}