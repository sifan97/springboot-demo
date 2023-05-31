package com.fan.springbootdemo.test;

import org.apache.tomcat.util.threads.ThreadPoolExecutor;

import java.util.concurrent.*;

/**
 * @author ssf
 * @date 2023/5/25 11:32
 */
public class test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ThreadPoolExecutor executor =new ThreadPoolExecutor(5,
//                12,
//                20,
//                TimeUnit.SECONDS,
//                new LinkedBlockingDeque<Runnable>(1000),
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy());
//        executor.submit(new Callable<Object>() {
//        })
//
//
//
//        CompletableFuture<Void> voidCompletableFuture1 = CompletableFuture.runAsync(() -> {
//            System.out.println("111");
//        }, executor);
//        CompletableFuture<Void> voidCompletableFuture2 = CompletableFuture.runAsync(() -> {
//            System.out.println("222");
//        }, executor);
//        CompletableFuture.allOf(voidCompletableFuture1,voidCompletableFuture2).get();
//
//        executor.invokeAll()

    }
}
