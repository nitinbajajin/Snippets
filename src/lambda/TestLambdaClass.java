package lambda;

/**
 * Created by nitlak on 15-05-2017.
 */
public class TestLambdaClass {


    public void print(TestLambdaInterface testLambdaInterface){
        testLambdaInterface.test("abc", "def");
    }

    public void print(TestLambdaInterface1 testLambdaInterface){
        String result = testLambdaInterface.test("abc", "zyz");
        System.out.println("result is " + result);
    }

    public static void main(String[] args) {
        TestLambdaClass obj = new TestLambdaClass();
        obj.print((String s, String i) -> "test");
        obj.print((String s, String i) -> System.out.println("String is "+s+" string is "+i));
    }
}
