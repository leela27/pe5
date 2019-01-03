package com.stackroute;

import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;

public class ModifyMapTest {
   String string = new String();

    @Test
    public void maptest() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("val1", "java");
        hashMap.put("val2", "C++");
        HashMap<String, String> mapNew = new HashMap<>();
        mapNew.put("val1", " ");
        mapNew.put("val2", "java");
        assertEquals(mapNew, string.replaceMap(hashMap));
    }



}

