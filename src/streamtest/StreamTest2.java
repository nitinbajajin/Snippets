package streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by nitlak on 14-05-2017.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        /*
        List<String> list = new ArrayList<>();
        list.add("milk");
        list.add("bread");
        list.add("sausage");
        //list = Collections.synchronizedList(list);
        list = list.subList(0,2);
        Stream<String> stream = list.stream();

        list.add("eggs, don't forget eggs");
        System.out.println(stream.count());
        //stream.forEach(System.out::println);
        //stream.forEach( (String s) -> System.out.println(s));
        */


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        //list = Collections.synchronizedList(list);
        //list = list.subList(0,2);
        Stream<Integer> stream = list.stream();


        list.add(5);
        System.out.println(list);
        stream.forEach( (Integer i) -> System.out.println(i));



     }
}
