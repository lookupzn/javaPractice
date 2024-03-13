package com.ning.thread_;

import java.util.concurrent.*;

// 自定义Callable，与上面一样
class FutureTask_ implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // 模拟计算需要一秒
        Thread.sleep(1000);
        return 2;
    }
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        // 使用
        ExecutorService executor = Executors.newCachedThreadPool();
        FutureTask<Integer> futureTask = new FutureTask<>(new FutureTask_());
        executor.submit(futureTask);
        System.out.println(futureTask.get());
    }
}
