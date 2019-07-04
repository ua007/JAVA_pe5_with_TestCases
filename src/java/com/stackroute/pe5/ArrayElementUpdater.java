package com.stackroute.pe5;

import java.util.ArrayList;

public class ArrayElementUpdater {
    public static String updateElement(ArrayList<String> array)
    {
        //finding the index of element
        //replace the element
        array.set(array.indexOf("Apple"),"Kiwi");
        array.set(array.indexOf("Melon"),"Mango");
        //ArrayList<String> arrayCopy=new ArrayList<>(array);
        String arrayCopy=array.toString();
        //removing the array
        array.clear();
        arrayCopy+="\nArray removed";
        return arrayCopy;
    }
}
