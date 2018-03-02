package abstract1;

/**
 * Created by nitlak on 25-02-2018.
 */
public class Concrete extends AbstractTest {

    public void printTest(){
        System.out.println("test");
    }

    public static void main(String[] args) {
        Concrete c = new Concrete();
        c.printTest();
    }
}
