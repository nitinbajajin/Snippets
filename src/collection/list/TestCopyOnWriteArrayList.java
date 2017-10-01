package collection.list;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.jar.Attributes;

/**
 * Created by nitlak on 28-05-2017.
 */
public class TestCopyOnWriteArrayList {

    public static void main(String[] args) {
        List<String> stringCopyOnWriteArrayList = new CopyOnWriteArrayList<>();
        stringCopyOnWriteArrayList.add("one");
        stringCopyOnWriteArrayList.add("two");
        stringCopyOnWriteArrayList.add("three");
        stringCopyOnWriteArrayList.add("four");
        stringCopyOnWriteArrayList.add("five");


        Iterator<String> stringIterator = stringCopyOnWriteArrayList.iterator();
        while(stringIterator.hasNext()){
            //stringCopyOnWriteArrayList.add("six");
            System.out.println(stringIterator.next());

            stringIterator.remove();


        }

        System.out.println(stringCopyOnWriteArrayList);
    }

}
