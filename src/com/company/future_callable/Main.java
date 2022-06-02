package com.company.future_callable;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<People> callable = new MyCallable();
        FutureTask<People> futureTask = new FutureTask<People>(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());


    }
}

