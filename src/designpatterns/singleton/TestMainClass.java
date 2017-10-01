package designpatterns.singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by nitlak on 25-03-2017.
 */
public class TestMainClass {


    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(5);
        //service.execute(()-> {BillPughSingleton.getInstance();});
        List<Callable<BillPughSingleton>> tasks = new ArrayList<>();
        System.out.println(BillPughSingleton.testVar   );
        for(int i=0; i <=20; i++){
          tasks.add(()->{return BillPughSingleton.getInstance();})  ;
        }
        //service.invokeAll(tasks);

        service.shutdown();
    }
}
