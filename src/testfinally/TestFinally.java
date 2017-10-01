package testfinally;

/**
 * Created by nitlak on 13-08-2017.
 */
public class TestFinally {
    public static void main(String[] args) {
        String s = getStringFromMethod();
        System.out.println(s);
        System.out.println("test");
    }

    private static String getStringFromMethod() {

        try{

            if (1 != 1){
                throw new Exception("Test");
            }

            return "Test";
        } catch (Exception e){
            System.out.println( " In catch");
            return "From Catch";
        }
        finally {

            System.out.println("In finally");
            System.exit(0);
            return "From Finally";
        }
    }
}
