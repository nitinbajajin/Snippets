package threading;

/**
 * Created by nitlak on 31-12-2017.
 */
public class SampleThread implements Runnable {
    private String name ;

    public SampleThread(){};

    public SampleThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
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
    }
}
