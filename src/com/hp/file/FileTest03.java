package com.hp.file;

import java.text.SimpleDateFormat;
import java.util.Date;
/*
*  作业3:  使用线程的sleep方法 做一个控制台显示时间 ,  格式是:  2021-07-17 23:45:动态的秒
 时间是动态的...
* */
public class FileTest03 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }
}

// 通过继承Thread类 来重写run方法
class MyThread extends Thread {
    //修改日期格式
    SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");

    //重写run()方法
    public void run() {
        while (true) {
            Date date = new Date();
            //格式化
            String str = s.format(date);
            System.out.println(str);
            try {
                //间隔时间1秒输出一次
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}