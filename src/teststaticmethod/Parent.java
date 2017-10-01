package teststaticmethod;

/**
 * Created by nitlak on 14-05-2017.
 */
//@FunctionalInterface
public interface Parent {
    public static String test1 = "Nitin";

    static void printString(){
        System.out.println("printing string from Parent");
    }

    //void test();
    //void test1();
}
