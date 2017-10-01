package teststaticmethod;

/**
 * Created by nitlak on 14-05-2017.
 */
public class Child implements Parent {
    public static void main(String[] args) {
        System.out.println(test1);
        Parent.printString();
    }
}
