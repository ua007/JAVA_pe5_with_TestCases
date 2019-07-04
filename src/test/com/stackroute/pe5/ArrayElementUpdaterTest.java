package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArrayElementUpdaterTest {

    ArrayElementUpdater array;

    @Before
    public void setUp() throws Exception
    {
        array=new ArrayElementUpdater();
    }

    @After
    public void tearDown() throws Exception {
        array=null;
    }

    @Test
    public void givenArrayListAndElementShouldReturnUpdatedArrayList()
    {
        ArrayList<String> returnArray=new ArrayList<>();
        returnArray.add("Apple");
        returnArray.add("Grape");
        returnArray.add("Melon");
        returnArray.add("Berry");
        String result=array.updateElement(returnArray);

        assertEquals("[Kiwi, Grape, Mango, Berry]\nArray removed",result);

    }

}