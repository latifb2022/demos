package com.lbenzzine.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.riversun.promise.Func;
import org.riversun.promise.Promise;

public class PromiseExample {

	public static void main(String[] args) {

		final ExecutorService myExecutor = Executors.newFixedThreadPool(5);

		Func func1 = (action, data) -> {
			System.out.println("func1 on " + Thread.currentThread().getName());
			action.resolve();
		};

		Func func2 = (action, data) -> {
			System.out.println("func2 on " + Thread.currentThread().getName());
			action.resolve();
		};

		Func func3 = (action, data) -> {
			System.out.println("func3 on " + Thread.currentThread().getName());
			action.resolve();
		};

		Promise.all(myExecutor, func1, func2, func3).then((action, data) -> {
			System.out.println("final process on " + Thread.currentThread().getName());
			myExecutor.shutdown();// If you use your own executor, remember to shut it down after use
			action.resolve();
		}).start();
	}
}