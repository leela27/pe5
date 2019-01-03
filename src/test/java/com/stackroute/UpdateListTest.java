import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.lang.String;
import static org.junit.Assert.assertArrayEquals;
public class UpdateListTest {
    List<String> list=new ArrayList<>();
    UpdateList updateList=new UpdateList();
    @Test
    public void arrayTest1(){
        list.add(0,"Apple");
        list.add(1,"Grape");
        list.add(2,"Melon");
        list.add(3,"Berry");
        List<String> expected=new ArrayList<>();
        expected.add("Apple");
        expected.add("Grape");
        expected.add("Melon");
        expected.add("Berry");
        assertEquals(expected,updateList.array(list));    }
    @Test
    public void arrayTest2(){
        list.add(0,"Apple");
        list.add(1,"Grape");
        list.add(2,"Melon");
        list.add(3,"Berry");
        list.set(0,"Kiwi");
        list.set(2,"Mango");

        List<String> expected=new ArrayList<>();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        expected.add("Berry");
        assertEquals(expected,updateList.array(list));    }
    @Test
    public void arrayTest3(){
        list.add(0,"Apple");
        list.add(1,"Grape");
        list.add(2,"Melon");
        list.add(3,"Berry");
        list.clear();
        List<String> expected=new ArrayList<>();
        assertEquals(new ArrayList<String>(),updateList.array(list));
    }
}