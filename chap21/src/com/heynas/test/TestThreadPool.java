package com.heynas.test;

import com.heynas.thread.PrintNumberCallableThread;

import java.util.concurrent.*;

/**
 * <p> Description:  TestThreadPool </p>
 * <pre> </pre>
 *
 * Copyright: © 2012-2017 Heynas Studio. All rights reserved.
 *
 * @author William
 * @version 1.0
 */
public class TestThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newFixedThreadPool(8);
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(8);
        ExecutorService executorService = Executors.newWorkStealingPool(2);

        Callable<Integer> callable = new PrintNumberCallableThread();

        Future<Integer> task0 = executorService.submit(callable);
        Future<Integer> task1 = executorService.submit(callable);

//        Future<Integer> task0 = executorService.schedule(callable, 5, TimeUnit.SECONDS);
//        Future<Integer> task1 = executorService.schedule(callable, 5, TimeUnit.SECONDS);

        System.out.println(task0.get());
        System.out.println(task1.get());

        executorService.shutdown();
    }
}
