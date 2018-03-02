package inheritance;

/**
 * Created by nitlak on 02-03-2018.
 */
public class Child extends Parent {
    public int a = 7;
    //public Date d = new Date();
    public Child(){
        testMethod();
    }

    @Override
    protected void testMethod() {
        System.out.println("Child printing " + a + d);
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}
