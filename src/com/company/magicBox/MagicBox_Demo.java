package com.company.magicBox;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class MagicBox_Demo {
    public static void main(String[] args) {
        MagicBox magicBox=new MagicBox();
        //magicBox.setObject(0);
        //magicBox.setObject(LocalDate.now());
        magicBox.setObject(new ArrayList<String>(Arrays.asList("1","2","3")));         System.out.println(magicBox.getObject());
    Object object=magicBox.getObject();
    Class c =object.getClass();
        System.out.println(object);
        System.out.println(c);

        MagicBoxGeneric<Integer> magicBoxInteger= new MagicBoxGeneric<>();
    }
}

class MagicBox{
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "MagicBox{" +
                "object=" + object +
                '}';
    }
}