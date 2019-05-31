package com.example.springboot.demo;

/**
 * @Author 曾晶晶
 * @Date 2019/4/17 13:59
 * @Version 1.0
 */

public class java8demo2 {
    public static void main(String[] args) {
        /**
         *   9×9乘法表,三角形
         */
//        for (int i=1;i<=9;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+"×"+i+"="+i*j+"\t");
//
//            }
//            System.out.println("xxxxxxxxxxxx");
//        }


        /***
         *   9×9乘法表，菱形
         */



        for(int i=1;i<=9;i++){//控制行
            // 用来控制每行空格的数量
            for(int k=1;k<=9-i;k++){
                System.out.print("     \t");
            }
            for(int j=1;j<=i;j++){//控制列
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            for(int y=i;y>=1;y--){
                System.out.print((i*y)+"="+i+"*"+y+"\t");
            }            System.out.println();        }
        for(int i=9;i>=1;i--){
            for(int k=1;k<=9-i;k++){
                System.out.print("     \t");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }            for(int y=i;y>=1;y--){
                System.out.print((i*y)+"="+i+"*"+y+"\t");
            }
            System.out.println();
        }
    }


/**
 * 9×9乘法表，倒三角
 */

//public static void main(String[] args) {
//    for(int i=9;i>0;i--) {
//        for(int j=1,k=10-i;j<=i;j++,k++) {
//            System.out.print(j+"×"+k+"="+k*j+"\t");// \t 跳到下一个TAB位置
//        }
//        System.out.println();
//    }
//}



}
