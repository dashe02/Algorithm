package com.exercise5.files;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/9.
 */
public class ListFiles {

    static List<String> pathList = new ArrayList<>();

    public static void main(String[] args) {
        ListFiles l = new ListFiles();
        l.listFile("/Users/wecash/Downloads/");
        System.out.print(pathList);
    }

    private void listFile(String dir) {
        File or = new File(dir);
        File[] files = or.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    pathList.add(file.getName());
                } else if (file.isDirectory()) {
                    listFile(file.getAbsolutePath());
                }
            }
        }
    }
}
