package com.stackroute.pe5;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NumberOccurenceCounterTest {

    NumberOccurenceCounter number;

    @Before
    public void setUp() throws Exception
    {
        number=new NumberOccurenceCounter();
    }

    @After
    public void tearDown() throws Exception
    {
        number=null;
    }
    @Test
    public void givenStringInputShouldReturnMap()
    {
        Map<String,Integer> result=new HashMap<>();
        result=number.countNumberOccurence("one one -one___two,,three,one @three*one?two");
        assertEquals("{one=5, two=2, three=2}",result.toString());
    }

}