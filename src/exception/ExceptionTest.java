package exception;

/**
 * Created by nitlak on 25-02-2018.
 */

class SubException extends Exception {}

class SubSubException extends SubException {}

public class ExceptionTest {
    void doStuff () throws SubException {}
}

class CC2 extends ExceptionTest{
    @Override
    void doStuff() throws SubSubException {

    }


}