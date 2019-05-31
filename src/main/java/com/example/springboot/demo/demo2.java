package com.example.springboot.demo;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * @Author 曾晶晶
 * @Date 2019/5/22 14:42
 * @Version 1.0
 */
public class demo2 {

    public static void main(String[] args) {

//        int x=1;

        /**
         * 循环语句  while
         */
//        while (x<=20){
//            System.out.println("value of x:"+ x );
//            x++;
//            System.out.println("\n");
//
//        }

        /**
         *   循环语句 ： do...while
         */
//        do {
//            System.out.println("value of x:"+x);
//            x++;
//            System.out.println("\n");
//        }while (x<10);


        /**
         *  循环语句 for
         */

//        for (int x=1;x<10;x=x+1){
//            System.out.println("value of x:"+x);
//            System.out.println("\n");
//
//        }

//        String [] names={"曾晶晶","慧慧","茜茜"};
//        for (String name :names){
//            System.out.println(name);
//        }
        /**
         * 循环，break关键字（跳出循环），continue（continue 关键字遇条件跳转到下一个）
         * */
//        int [] numbers={10,20,30,40,50,60};
//         for (int x:numbers){
//             if (x==50){
//                 continue;
//             }
//             System.out.println(x);
//         }

        /**
         * 判断语句 if else
         */
//        int x=20;
//        if(x>20){
//            System.out.println("这是if语句");
//        }else {
//            System.out.println("这是else语句");
//        }

        /**
         * 判断语句 switch case
         */
//            char grade='C';
//
//            switch (grade){
//                case 'A':
//                    System.out.println("优秀");
//                    break;
//                case 'B':
//                    System.out.println("良好");
//                case 'C':
//                    System.out.println("及格");
//                    break;
//                case 'F':
//                    System.out.println("你需要的等级");
//                    break;
//                    default:
//                        System.out.println("未知等级");
//            }
//        System.out.println("你的等级是"+grade);


        /**
         * 查看字符串长度
         */
//        String  site="www.runoob.com";
//         int len=site.length();
//        System.out.println(len);

        /**
         *数组实例
         */
//         定义数组大小
//         int size=10;
//         定义数组
//        double [] myList =new double [size];
//        myList[0]=5.6;
//        myList[1]=15.6;
//        myList[2]=18.6;
//        myList[3]=29.6;
//        myList[4]=78.6;
//        myList[5]=98.6;
//        myList[6]=45.6;
//        myList[7]=55.6;
//        myList[8]=65.6;
//        myList[9]=59.6;
//
//        double total=0;
//
//        for (int i=0;i<size;i++){
//            total +=myList[i];
//        }
//        System.out.println("这个数组的和为"+ total);


        //处理数组，求和，最大元素等
//        double [] mylist1 ={1.9,5.2,6.3};
//        double max=mylist1[0];
//        for (int i=0;i<mylist1.length;i++){
//               if (mylist1[i] > max) max = mylist1[i];
//        }
//        System.out.println("最大值"+ max);


         //for -each 循环
//        double [] myList2={2.9,3.6,4.5,9.6};
//        for(double element:myList2){
//            System.out.println(element);
//        }

      //获取当前时间
//        Date date=new Date();
//        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println("当前时间"+sdf.format(date));


        List<String> list=new ArrayList<String>();
         list.add("hello");
         list.add("world");
         list.add("hahahah");

         for (String str:list){
             System.out.println(str);
         }

         String[] strArray =new String [list.size()];
          list.toArray(strArray);
        for (int i =0;i < strArray.length;i++){
            System.out.println(strArray[i]);
        }


        Iterator<String> Iterator = list.iterator();
        while (Iterator.hasNext()){
            System.out.println(Iterator.next());
        }




    }




















}