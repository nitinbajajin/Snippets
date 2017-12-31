package threading;

import java.util.concurrent.Callable;

/**
 * Created by nitlak on 31-12-2017.
 */
public class SampleCallableThrowingException implements Callable{

    private String name;

    public SampleCallableThrowingException(){}

    public SampleCallableThrowingException(String name){
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

            if(name == null){
                name = Thread.currentThread().getName();
            }
            System.out.println(name);

            if(i==4){
                System.out.println("Throwing exception");
                throw new RuntimeException("Custom Exception from "+name);
            }

        }

        return  "Result of "+name;
    }
}
