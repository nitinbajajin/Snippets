package collection.map;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by nitlak on 31-07-2017.
 */
public class LinkedHashMapTest {



    public static void main(String[] args) {
        LinkedHashMap linkedHashMap = new LinkedHashMap<>();
        HashMap map = new HashMap();
        Boolean d = true;
        long startTime = System.currentTimeMillis();
        for (int i = 1;i<100000000; i++){
            linkedHashMap.put(i,d);
        }
        System.out.println("LinkedHashMap creation time " + (System.currentTimeMillis() - startTime));
        linkedHashMap = null;
        startTime = System.currentTimeMillis();
        for (int i = 1;i<100000000; i++){
            map.put(i,d);
        }
        System.out.println("HashMap creation time " + (System.currentTimeMillis() - startTime));




    }

}
