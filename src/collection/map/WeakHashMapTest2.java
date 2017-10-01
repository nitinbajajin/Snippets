package collection.map;

import collection.list.TestList;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created by nitlak on 29-05-2017.
 */
public class WeakHashMapTest2 {
    public static void main(String[] args) throws InterruptedException {
        Map<Key, String> weakHashMap= new WeakHashMap<>();
        Key k1 = new Key("ABC");
        weakHashMap.put(k1, "ABC");
        System.out.println(weakHashMap);
        k1 = null;
        System.gc();
        Thread.sleep(1000l);
        System.out.println(weakHashMap);

    }

    static class Key{
        String key;
        public Key(String key){
            this.key = key;
        }
    }
}
