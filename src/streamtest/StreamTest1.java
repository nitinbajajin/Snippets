package streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by nitlak on 14-05-2017.
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<Integer> t = new ArrayList<>();
        t.add(2);t.add(-1);t.add(8);t.add(0);t.add(19);
        Stream<Integer> stream = t.stream();
        Stream<Integer> stream2 = stream.filter( (Integer i) -> {
            System.out.println("First stream");
            return i>0;});

        Stream<Integer> stream3 = stream2.filter( (Integer i1) -> {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2nd stream");  return i1>2;
        });
        t.add(8);
        //System.out.println(stream3.count());
        stream3.forEach( (Integer s) -> System.out.println(s));
        System.out.println("End");
    }
}
