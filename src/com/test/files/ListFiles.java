package com.test.files;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wecash on 19/4/9.
 */
public class ListFiles {

    static List<String> pathList = new ArrayList<>();

    public static void main(String[] args) {
        listFiles("/Users/wecash/Downloads/");
        System.out.print(pathList);
    }

    private static void listFiles(String s) {
        File file = new File(s);
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    pathList.add(f.getName());
                } else if (f.isDirectory()) {
                    listFiles(f.getAbsolutePath());
                }
            }
        }
    }
}
