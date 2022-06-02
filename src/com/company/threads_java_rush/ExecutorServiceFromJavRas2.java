package com.company.threads_java_rush;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceFromJavRas2 {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Runnable> runnables = new LinkedBlockingQueue<>();
        for (int i = 1; i <= 10 ; i++) {
            int finalI = i;
            runnables.add(new Runnable() {
                @Override
                public void run() {
                    doExpensiveOperation(finalI);
                }
            });
        }

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3,5,1000, TimeUnit.MILLISECONDS,runnables);
        threadPoolExecutor.prestartAllCoreThreads();

        threadPoolExecutor.shutdown();
        threadPoolExecutor.awaitTermination(5,TimeUnit.SECONDS);
        // Add your code here

        /* Example output
pool-1-thread-2, localId=2
pool-1-thread-3, localId=3
pool-1-thread-1, localId=1
pool-1-thread-3, localId=5
pool-1-thread-2, localId=4
pool-1-thread-3, localId=7
pool-1-thread-1, localId=6
pool-1-thread-3, localId=9
pool-1-thread-2, localId=8
pool-1-thread-1, localId=10
         */
    }

    private static void doExpensiveOperation(int localId) {
        System.out.println(Thread.currentThread().getName() + ", localId=" + localId);
    }
}
