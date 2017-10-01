package designpatterns.singleton;

/**
 * Created by nitlak on 25-03-2017.
 */
public class LazyNonThreadSafe {
    private static LazyNonThreadSafe INSTANCE = null;
    private LazyNonThreadSafe(){
        System.out.println("Constructor called...");
    }

    public static LazyNonThreadSafe getInstance(){
        System.out.println("GetInstance Called");
        if(INSTANCE == null){
            INSTANCE = new LazyNonThreadSafe();
        }
        return INSTANCE;

    }
}
