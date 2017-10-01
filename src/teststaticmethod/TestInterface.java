package teststaticmethod;

/**
 * Created by nitlak on 14-05-2017.
 */
public interface TestInterface {

    default void printDefault(){
        System.out.println("Print from default");
    }

    static void printStatic(){
        System.out.println("Print from static");
    }

    void printTest();

}
