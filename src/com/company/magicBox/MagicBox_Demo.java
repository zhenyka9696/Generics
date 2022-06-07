package com.company.magicBox;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MagicBox_Demo {
    public static void main(String[] args) {
        MagicBox magicBox=new MagicBox();
        magicBox.setObject(0);
        magicBox.setObject(LocalDate.now());
        magicBox.setObject(new ArrayList<String>(Arrays.asList("1","2","3")));
        System.out.println(magicBox.getObject());
    Object object=magicBox.getObject();
    Class c =object.getClass();
      System.out.println(object);
       System.out.println(c);

        MagicBoxGeneric<Integer> magicBoxInteger= new MagicBoxGeneric<>();
magicBoxInteger.setObject(1);
        System.out.println(magicBoxInteger.getObject());

        MagicBoxGeneric<List<String>> magicBoxGeneric2 = new MagicBoxGeneric<>();
        magicBoxGeneric2.setObject(Arrays.asList("hocus", "pocus", "spell"));
        System.out.println(magicBoxGeneric2.getObject());
    }
}

