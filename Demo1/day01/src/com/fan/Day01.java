package com.fan;

import java.io.File;

public class Day01 {
    public static void main(String[] args) {
        String path = "D:\\home\\zhbx\\upload\\评估" + File.separator + "1111" + File.separator + "盖章";
        File file = new File(path);
        System.out.println(file.exists());
        Boolean flag = false;
        if (file.exists()) {
            File[] files = file.listFiles();
            for (File f : files) {
                if (f.getName().endsWith(".pdf") || f.getName().contains("盖章")) {
                    flag = true;
                }
            }
        }
        System.out.println(flag);
    }
}
