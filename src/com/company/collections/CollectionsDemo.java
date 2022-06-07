package com.company.collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List list=new ArrayList();
    list.add(1);
    list.add("String");
    list.add(new Date());

 //   for (Object object:list)
    //    System.out.println(object);

        List <String> list2=new ArrayList();
        list2.add("String0");
        list2.add("String1");
        list2.add("String2");

        list2.forEach(System.out::println);
        System.out.println(list2);
    }
}
