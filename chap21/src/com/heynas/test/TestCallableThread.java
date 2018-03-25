package com.heynas.test;

import com.heynas.thread.PrintNumberCallableThread;
import com.heynas.thread.PrintNumberThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * <p> Description:  TestThread </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestCallableThread {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> callable = new PrintNumberCallableThread();

        FutureTask<Integer> task0 = new FutureTask(callable);
        FutureTask<Integer> task1 = new FutureTask(callable);

        Thread thread0 = new Thread(task0);
        Thread thread1 = new Thread(task1);

        thread0.start();
        thread1.start();

        Integer result0 = task0.get();
        Integer result1 = task1.get();

        System.out.println("Result0 = " + result0 + "; Result1 = " + result1);



//        System.out.println(task0.get());

        System.out.println("Main Finished!");
    }
}
