package interfacetesting;

/**
 * Created by nitlak on 22-03-2017.
 */
public class TestClass implements TestInterface, TestInterface2 {


    @Override
    public void testDefault() {
        System.out.println("class test default");
    }

    @Override
    public void testAbstract() {
        System.out.println("class test abstract");
    }

    @Override
    public void fullFunction() {
        System.out.println("class test full function");
        TestInterface.testStatic();
    }


    public static void main(String[] args) {
        TestInterface obj = new TestClass();
        obj.testAbstract();
        obj.testDefault();
        obj.fullFunction();

    }
}
