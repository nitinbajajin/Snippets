package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by nitlak on 27-05-2017.
 */
public class TestList {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(9);
        testList.add(8);
        testList.add(0);
        testList.add(1);
        testList.add(2);

        Set a;
        System.out.println(testList);
        testList.add(0,7);
        testList.add(0,6);
        testList.remove(Integer.valueOf("2"));
        System.out.println(testList);
    }
}
