package com.stackroute;
import java.util.HashMap;
import java.util.Map;
public class Occurence {
    HashMap<String,Boolean> map=new HashMap<String,Boolean>();
    public HashMap<String,Boolean> count(String[] array)
    {
        HashMap<String,Boolean> mp = new HashMap<String,Boolean>();
        int count;
        for (int i = 0; i < array.length; i++) {
            count=0;
            for (int j = array.length-1; j >=0; j--)
            {
                if (array[i].equals(array[j]))
                {
                    count++;
                }
                if (count >= 2)
                {
                    mp.put(array[i], true);
                }
                else {
                    mp.put(array[i], false);
                }
            }        }
        System.out.println(mp);
        return mp;
    }
}

