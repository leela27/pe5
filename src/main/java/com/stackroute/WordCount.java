package com.stackroute;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
public class WordCount
{
    public static Map<String,Integer> count(String list) {
        String[] wordsArray = list.split("\\s+|-+|\\?+|,+|\\*|_+|@+");
        int count;
        ArrayList<String> arr=new ArrayList<>();
        arr.addAll(Arrays.asList(wordsArray));
        arr.removeAll(Arrays.asList(""));
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : arr)
        {
            if (map.containsKey(word)) {
            count = map.get(word);
            map.put(word, count + 1);
        }
            else {
            map.put(word, 1);
        }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet())
            map.put(entry.getKey(), entry.getValue());
        return map;
    }
}

