package com.stackroute;

import org.junit.Assert;
import org.junit.Test;
import static.org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ArrayOfStringTest {
    StringMap obj = new StringMap();
    @Test
    public void array1() {
        String[] string = {"a", "b", "c", "d", "a", "a", "d"};
        HashMap<String, Boolean> expected = new HashMap<>();
        expected.put("a", true);
        expected.put("b", false);
        expected.put("c", true);
        expected.put("d", false);
        Assert.assertEquals(expected,obj.StringMap(String));
    }
    @Test
    public void array2() {
            String[] string = {"a", "b", "c", "d", "a", "a", "d"};
            HashMap<String, Boolean> expected = new HashMap<>();
            expected.put("a", true);
            expected.put("b", true);
            expected.put("c", true);
            expected.put("d", false);
            Assert.assertNotEquals(expected,obj.StringMap(String);

    }

        @Test
        public void array3() {
            String[] string = {};
            HashMap<String,Boolean> expected=new HashMap<>();

            Assert.assertNull(expected);

            }
}
