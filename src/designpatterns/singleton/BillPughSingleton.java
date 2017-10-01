package designpatterns.singleton;

/**
 * Created by nitlak on 25-03-2[017.
 */
public class BillPughSingleton {
    public static String testVar = "teat";
    private BillPughSingleton(){
        System.out.println("Construction called");
    }
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
    public static BillPughSingleton getInstance(){
        System.out.println("Getinstance called at "+System.nanoTime());
        return  SingletonHelper.INSTANCE;
    }

}



