package testgenerics;

import java.util.List;

public class NaturalNumber<T extends Number> {

    private T n;

    public NaturalNumber(T n)  { this.n = n; }

    public boolean isEven() {
        return n.intValue() % 2 == 0;
    }

    public static void addExcpetion(List<? super Exception> test){
        System.out.println("test");
    }

    public static void main(String[] args) {
        NaturalNumber<Number> naturalNumber = new NaturalNumber<>(5);
        System.out.println(naturalNumber.isEven());
        List<Throwable> dummy = null;
        addExcpetion(dummy);
    }

}