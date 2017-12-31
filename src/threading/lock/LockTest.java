package threading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by nitlak on 19-12-2017.
 */
public class LockTest {

    ReentrantLock reentrantLock = new ReentrantLock();
    ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        LockTest lockTest = new LockTest();
        lockTest.reentrantLock.lock();
        //doSomeStuff
        lockTest.reentrantLock.unlock();


        lockTest.readWriteLock.readLock().lock();
        lockTest.readWriteLock.readLock().unlock();

        lockTest.readWriteLock.writeLock().lock();
        lockTest.readWriteLock.writeLock().unlock();





    }

}
