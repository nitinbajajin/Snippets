package threading;

/**
 * Created by nitlak on 31-12-2017.
 */
public class SampleThreadThrowingException implements Runnable{
    @Override
    public void run() {
        for(int i =1; i<=1000; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());

            if(i==4){
                System.out.println("Throwing exception");
                throw new RuntimeException("Custom Exception from "+Thread.currentThread().getName());
            }

        }
    }
}
