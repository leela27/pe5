package com.stackroute;

import java.util.ArrayList;
import java.util.List;

    public class UpdateList {
        public List<String> array (List<String> list)      {
            int i;
            for (i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
            System.out.println("\n After updating");
            return list;
        }    }

