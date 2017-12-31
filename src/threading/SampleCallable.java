package threading;

import java.util.concurrent.Callable;

/**
 * Created by nitlak on 31-12-2017.
 */
public class SampleCallable implements Callable {
    private String name ;

    public SampleCallable(){};

    public SampleCallable(String name){
        this.name = name;
    }

    @Override
    public Object call() {
        for(int i =1; i<=10; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(name == null)
                name = Thread.currentThread().getName();
            System.out.println(name);



        }
        return "Result of "+name;
    }
}
