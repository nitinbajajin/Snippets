package teststaticmethod;

/**
 * Created by nitlak on 14-05-2017.
 */
public class TestClass implements TestInterface {
    /*
    @Override
    public void printDefault() {
        System.out.println("Default from class");
    }*/

    @Override
    public void printTest() {
        System.out.println("Test from class");
    }


    public void printStatic(){
        System.out.println("Static from class");
    }

    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.printDefault();
        t.printTest();
        TestInterface.printStatic();
        t.printStatic();
    }
}
