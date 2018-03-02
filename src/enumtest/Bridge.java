package enumtest;

/**
 * Created by nitlak on 25-02-2018.
 */
public class Bridge {
    public enum Suits {
        CLUB(20), DIAMOND(20);

        private int points;
        Suits(int points){
            this.points = points;
        }
    }

    public static void main(String[] args) {
        System.out.println(Suits.DIAMOND + " " + Suits.DIAMOND.points);
    }
}
