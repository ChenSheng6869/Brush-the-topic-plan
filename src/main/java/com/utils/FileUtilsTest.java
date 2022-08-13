package com.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 删除本地maven下载的临时文件, 防止切换maven源之后出现一些不可描述的错误.
 */
public class FileUtilsTest {
    private static List<File> fileList = new ArrayList<>();

    public static Collection<File> listFiles(File file, String[] extensions, boolean isDeep) {
        if (!file.exists()) {
            System.out.println("路径不存在:" + file);
        }
        listFiles(file, extensions);
        return fileList;
    }

    private static void listFiles(File file, String[] extensions) {
        File[] fs = file.listFiles();
        for (File f : fs) {
            if (f.isDirectory()) {
                listFiles(f, extensions);
            }
            if (f.isFile()) {
                for (String extension : extensions) {
                    if (f.toString().endsWith(extension)) {
                        fileList.add(f);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String repoPath = "D:\\Environment\\apache-maven-3.5.2\\maven-repo";
        String[] extensions = {
                "lastUpdated",
                "properties",
                "repositories"
        };

        Collection<File> listFiles = FileUtilsTest.listFiles(new File(repoPath), extensions, true);
        for (File file : listFiles) {
            System.out.println(file);
            file.delete();
        }
    }

}
