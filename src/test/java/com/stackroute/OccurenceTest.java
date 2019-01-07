package com.stackroute;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
public class OccurenceTest {
    Occurence Occurence=new Occurence();
    @Test
    public void stringCount1() {
        String arr[] = {"a","b","c","d","a","c","c"};
        Map<String,Boolean> map=new HashMap<>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        assertEquals(map,Occurence.count(arr));
    }
    @Test
    public void stringCount2()
    {
        String arr[] = {"abc","1","def","1","abc","2","2","3"};
        Map<String,Boolean> map=new HashMap<>();
        map.put("abc",true);
        map.put("def",false);
        map.put("1",true);
        map.put("2",true);
        map.put("3",false);
        assertEquals(map,Occurence.count(arr));
    }
}
