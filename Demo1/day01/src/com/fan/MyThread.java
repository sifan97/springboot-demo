package com.fan;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("我被执行了");
    }

    public static void main(String[] args) {
        new MyThread().start();
    }

}
