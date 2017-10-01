package designpatterns.singleton;

/**
 * Created by nitlak on 25-03-2017.
 */
public class EagerInitialization {
    private static EagerInitialization INSTANCE = new EagerInitialization();
    private EagerInitialization(){
        System.out.println("Constructor called");
    }

    public static EagerInitialization getInstance(){
        System.out.println("Get instance called");
        return INSTANCE;
    }

}
