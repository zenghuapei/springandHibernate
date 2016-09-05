package com.perry.thread;


import java.util.concurrent.*;

/**
 * @Title:XXXX
 * @Description:
 * @author: zenghuapei
 * @date 2016/9/4
 * @update [修改人] [修改时间] [变更描述]
 */
public class ExectorServiceTest {
    public static void main(String[] args) {
        //ExectorTest();
        try {
            SubCallTest();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void ExectorTest() {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });

        executorService.shutdown();
    }
    private static void SubRunTest() throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future future = executorService.submit(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });
        System.out.println("future.get()=" + future.get());
        executorService.shutdown();
    }
    private static void SubCallTest() throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future future = executorService.submit(new Callable() {
            @Override
            public Object call() throws Exception {
                System.out.println("ddddd");
                return "调用成功";
            }
        });
        System.out.println("future.get()=" + future.get());
        executorService.shutdown();
    }
}
