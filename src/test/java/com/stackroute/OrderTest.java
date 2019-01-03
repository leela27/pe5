package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import static org.junit.Assert.*;
public class OrderTest {
    Order orderset;
    @Before
    public void setUp() throws Exception {
        orderset=new Order();
    }    @After
    public void tearDown() throws Exception {
        orderset=null;
    }    @Test
    public void orderOne() {
        String[] strings={"Harry","Olive","Alice","Bluto","Eugene"};
        TreeSet set=new TreeSet();
        set.add("Alice");
        set.add("Bluto");
        set.add("Eugene");
        set.add("Harry");
        set.add("Olive");
        assertEquals(set,orderset.orderSet(strings));
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.addAll(set);
        assertEquals(arrayList,orderset.orderSetArr(set));
    }    @Test
    public void orderTwo() {
        String[] strings={"sai","durga","koduri","hema","harika"};
        TreeSet set=new TreeSet();
        set.add("durga");
        set.add("harika");
        set.add("hema");
        set.add("koduri");
        set.add("sai");
        assertEquals(set,orderset.orderSet(strings));
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.addAll(set);
        assertEquals(arrayList,orderset.orderSetArr(set));
    }
}
