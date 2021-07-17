package com.hp.file;
import java.io.File;
/*
* 作业1:   遍历 你D盘 的 其中一个文件夹 , 并查找出 文件中带有 java 的 文件
* */
public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("D:\\ppp\\ooo");
        getFile(file);

    }
    private static void getFile(File dir){
        //创建文件数组
        File[] files = dir.listFiles();
        //如果数组不为空
        if(files != null){
            for (File file : files) {
                //如果文件是目录
                if(file.isDirectory()){
                    //继续遍历文件（递归）
                    getFile(file);
                }else{
                    //判断文件以java结尾
                    if(file.getName().endsWith(".java")){
                        //获取文件绝对路径
                        System.out.println(file.getAbsolutePath());
                    }
                }
            }
        }

    }
}
