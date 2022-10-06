package com.fan;

public class MyThead implements Runnable {
    @Override
    public void run() {
        System.out.println("继承了runuable接口");
    }

    public static void main(String[] args) {
        new Thread(new MyThead()).start();
    }
}
