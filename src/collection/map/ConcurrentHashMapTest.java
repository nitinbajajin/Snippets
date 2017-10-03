package collection.map;

import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by nitlak on 02-10-2017.
 */
public class ConcurrentHashMapTest {
    public static void main(String[] args) {
        Map<String, Object> testMap = new ConcurrentHashMap<>();
        testMap.put("test", LocalDate.now());
        testMap.put("test1", LocalDate.now().plusDays(1));

        testMap.compute("test1", (s, o) -> "bigfunctioncalled");

        System.out.println(testMap);


        System.out.println(((ConcurrentHashMap)testMap).reduce(2, (o, o2) -> {
            System.out.println(o);
            System.out.println(o2);
            return System.currentTimeMillis();
        }, (o, o2) -> {
            System.out.println("h "+o);
            System.out.println("h "+o2);
            return o.toString()+o2.toString();
        }));
    }
}
