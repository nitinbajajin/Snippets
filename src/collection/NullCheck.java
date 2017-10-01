package collection;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Created by nitlak on 13-08-2017.
 */
public class NullCheck {
    public static void main(String... args) {
        List l  = new CopyOnWriteArrayList();
        l.add(null);
        l.add(null);
        System.out.println(l.size());
        System.out.println(l.contains(null));
        System.out.println(l.indexOf(null));
        System.out.println(l.get(1));
        Collections.sort(l);
        System.out.println(l);

        //Null and Duplicates are allowed in ArrayList as well as LinkedList, CopyOnWriteArrayList
        //Null allowed in HashSet, LinkedHashSet, CopyOnWriteArraySet
        //Null not allowed in TreeSet
        //Null Key and Values allowed in HashMap, LinkedHashMap
        //Null not allowed in TreeMap



        Set s = new HashSet();
        s.add("One");
        s.add(null);
        s.add("Two");
        s.add(null);
        s.add("Three");

        System.out.println(s.size());
        System.out.println(s);


        Map m = new TreeMap();
        //m.put(null, "One");
        //m.put(null, "Two");
        m.put("1", null);

        System.out.println(m.size());
        System.out.println(m.get("1"));




    }
}
