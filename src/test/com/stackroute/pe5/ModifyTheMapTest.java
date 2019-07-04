package com.stackroute.pe5;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ModifyTheMapTest {

    @Test
    public void modify() {
        HashMap<String,String> hashMap= new HashMap<String,String>();
        hashMap.put("val1","java");
        hashMap.put("val2","c++");
        String result =ModifyTheMap.modify(hashMap).toString();
        assertEquals("{val2=java, val1= }",result);
    }

    @Test
    public void modify2() {
        HashMap<String,String> hashMap= new HashMap<String,String>();
        hashMap.put("val1"," ");
        hashMap.put("val2"," ");
        String result =ModifyTheMap.modify(hashMap).toString();
        assertEquals("{val2= , val1= }",result);
    }
    @Test
    public void modify3() {
        HashMap<String,String> hashMap= new HashMap<String,String>();
        hashMap.put("val1","c++");
        hashMap.put("val2","c++");
        String result =ModifyTheMap.modify(hashMap).toString();
        assertEquals("{val2=c++, val1= }",result);
    }
}