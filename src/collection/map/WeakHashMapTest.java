package collection.map;

import collection.list.TestList;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/**
 * Created by nitlak on 29-05-2017.
 */
public class WeakHashMapTest {
    public static void main(String[] args) {
        TestList list = new TestList();
        WeakReference<TestList> wr = new WeakReference<TestList>(list);
        //HashMap<TestList, Object> map = new HashMap<>();
        //map.put(list,"abc");
        for (int i = 0; i < 10000; i++) {
            list = new TestList();
            System.out.println(wr.get());
            Runtime.getRuntime().gc();
            System.gc();
        }
    }
}
