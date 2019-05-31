package com.example.springboot.demo;

import java.util.*;

/**
 * @Author 曾晶晶
 * @Date 2019/4/17 13:41
 * @Version 1.0
 */
public class java8Test {

    public static void main(String[] args) {

        List<String> names=new ArrayList<String>();
        names.add("Gooles");
        names.add("runoon");
        names.add("taobao");
        names.add("baidu");
        names.add("sina");



        List<String> names2=new ArrayList<String>();
        names2.add("Gooles ");
        names2.add("taobao ");
        names2.add("baidu ");
        names2.add("sina ");

        java8Test tester = new java8Test();
        System.out.println("使用java 7 语法");
        tester.sortUsingJava7(names);
        System.out.println(names);

        System.out.println("使用java8语法");
        tester.sortUsingJava8(names2);
        names2.add("runoon ");
        System.out.println(names2);

    }



    private void  sortUsingJava8(List<String>names){
        Collections.sort(names,(s1,s2)->s1.compareTo(s2));
    }


    private void  sortUsingJava7(List<String>names){
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
    }


}
