package com.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/10.
 */
public class ListFiles {

    public static void main(String[] args) {
        listFiles("/Users/wecash/Downloads/");
    }

    private static void listFiles(String s) {
        List<String> pathList = new ArrayList<>();
        listFiles0(s, pathList);
        System.out.print(pathList);
    }

    private static void listFiles0(String s, List<String> pathList) {
        File file = new File(s);
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    pathList.add(f.getName());
                } else if (f.isDirectory()) {
                    listFiles0(f.getAbsolutePath(), pathList);
                }
            }
        }
    }
}
