package com.fan;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BatchInsertProcessor {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Vector vector = new Vector();
        boolean add = vector.add("123");
        StringBuilder stringBuider = new StringBuilder();
        stringBuider.append("12");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("123");
    }


}
