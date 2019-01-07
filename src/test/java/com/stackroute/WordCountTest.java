package com.stackroute;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class WordCountTest {

    @Test
    public void test()
    {
        String list="one one -one___two,,three,one @three*one?two";
        WordCount wordCount = new WordCount();
        HashMap<String,Integer> expected = new HashMap<>();
        expected.put("one",5);
        expected.put("two",2);
        expected.put("three",2);
        assertEquals(expected,wordCount.count(list));
    }
    @Test
    public void fail()
    {
        String list="one one -one___two,,three,one @three*one?two";
        WordCount wordCount = new WordCount();
        HashMap<String,Integer> expected = new HashMap<>();
        expected.put("one",2);
        expected.put("two",2);
        expected.put("three",2);
        assertNotEquals(expected,wordCount.count(list));
    }
}


