import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Created by nitlak on 17-03-2017.
 */
public class Java8List {
    public static void main(String[] args) {
        List testList = new ArrayList<String>();
        testList.addAll(Arrays.asList("a","b","c"));



        testList.forEach(new Consumer<String>() {
            @Override
            public void accept(String o) {
                System.out.println(o);
                testList.removeIf( (Object o1) -> {return o1.toString().startsWith("ab");});
            }
        });

        testList.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String o) {
                return o.startsWith("a");
            }
        });

        testList.removeIf((Object o) -> {return o.toString().startsWith("b");});

        testList.replaceAll(new UnaryOperator<String>() {
            @Override
            public String apply(String o) {
                return o+"test";
            }
        });

        testList.replaceAll((Object o) -> {return (String)o+"test";});


        testList.forEach(new Consumer<String>() {
            @Override
            public void accept(String o) {
                System.out.println(o);
            }
        });
    }
}
