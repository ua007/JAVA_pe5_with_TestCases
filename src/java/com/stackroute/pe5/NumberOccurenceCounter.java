package com.stackroute.pe5;

import java.util.*;

public class NumberOccurenceCounter {
    public static Map<String,Integer> countNumberOccurence(String string)
    {

        String stringCopy=string.replaceAll("[^a-zA-Z]"," ").trim();
        String[] stringArray=stringCopy.split("\\s+");

        //creating map
        Map<String,Integer> numberCount = new HashMap<>();

        //counting number occurence
        for(int i=0;i<stringArray.length;i++) {

            numberCount.put(stringArray[i], (numberCount.get(stringArray[i]) == null) ? 1 : numberCount.get(stringArray[i]) + 1);
        }
        return numberCount;
    }
}
