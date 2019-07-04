package com.stackroute.pe5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckWordCountGreaterThanTwoTest {
    CheckWordCountGreaterThanTwo str;

    @Before
    public void setUp() throws Exception
    {
        str=new CheckWordCountGreaterThanTwo();
    }

    @After
    public void tearDown() throws Exception
    {
        str=null;
    }

    @Test
    public void givenStringArrayInputShouldReturnHashMap()
    {
        String result=str.countWordOccurence(new String[]{"a","b","a","c","a","b","d"});
        assertEquals("{a=true, b=true, c=false, d=false}",result);
    }

}