package inheritance;

import java.util.Date;

/**
 * Created by nitlak on 02-03-2018.
 */
public class Parent {

    public int a = 5;

    public Date d = new Date();
    public Parent(){
        testMethod();
    }

    protected void testMethod() {
        System.out.println("Parent printing "+ a);
    }
}
