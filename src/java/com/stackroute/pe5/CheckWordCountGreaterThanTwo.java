package com.stackroute.pe5;

import java.util.HashMap;
import java.util.Map;

public class CheckWordCountGreaterThanTwo {

    public static String countWordOccurence(String[] strArray)
    {
        //creating map
        Map<String,Integer> numberCount = new HashMap<>();
        Map<String,Boolean> numberCheck=new HashMap<>();

        int i;
        //count occurence
        for(i=0;i<strArray.length;i++) {

            numberCount.put(strArray[i], (numberCount.get(strArray[i]) == null) ? 1 : numberCount.get(strArray[i]) + 1);
            int k=numberCount.get(strArray[i]);
            numberCheck.put(strArray[i], (k>1));

        }

        return numberCheck.toString();
    }
}
