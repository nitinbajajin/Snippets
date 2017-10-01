package interfacetesting;

/**
 * Created by nitlak on 22-03-2017.
 */
public interface TestInterface2 {
    static void testStatic(){
        System.out.println("static method called");
    }

    default void testDefault(){
        System.out.println("default method called");
    }

    void testAbstract();

    default void fullFunction(){
        System.out.println("full function called");
    }

}
