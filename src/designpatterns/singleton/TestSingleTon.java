package designpatterns.singleton;

/**
 * Created by nitlak on 03-10-2017.
 * <p>
 * Eager
 */

/**
 * Eager
 */
/*
public class TestSingleTon {

    private static TestSingleTon object = new TestSingleTon();
    private TestSingleTon(){

    }

    public static TestSingleTon getInstance(){
        return object;
    }


}*/


/**
 * Lazy
 */

/*
public class TestSingleTon {
    private static TestSingleTon object;

    private TestSingleTon() {
    }

    public static TestSingleTon getInstance() {
        if (object == null) {
            synchronized () {
                if (object == null) {
                    object = new TestSingleTon();
                }
            }
        }
        return object;

    }
}*/


/**
 * BillPugh
 */
public class TestSingleTon{

    private TestSingleTon(){}


    private static class SubClass{
        private static TestSingleTon object = new TestSingleTon();
    }

    public static TestSingleTon getInstance(){
        return SubClass.object;
    }



}





