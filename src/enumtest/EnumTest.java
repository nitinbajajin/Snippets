package enumtest;

/**
 * Created by nitlak on 31-07-2017.
 */
public class EnumTest {
    public enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN{
            public void printTest(){
                System.out.println("test");
            }
        };

        public void printTest(){
            System.out.println("test1");
        }

    }

    public static void main(String[] args) {
        System.out.println(Season.WINTER instanceof Season);
        System.out.println(Season.WINTER instanceof Enum);
        Season.AUTUMN.printTest();
        Season.WINTER.printTest();
    }
}
