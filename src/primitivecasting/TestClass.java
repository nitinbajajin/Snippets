package primitivecasting;

/**
 * Created by nitlak on 26-02-2018.
 */
public class TestClass {
    public static void main(String[] args) {
        int a = 648494641;
        System.out.println((byte)a);
        System.out.println(a);
        System.out.println((short)a);
        System.out.println((long)a);
        System.out.println('a'+ (byte)2);
        System.out.println( 2.3d+2);

        System.out.println(1.0 +4/3f);

        //Bitwise OR    1011 | 1001  = 1011    (1+1 is 1)
        System.out.println(1|1);
        System.out.println(7|1);

        //Similarly Bitwise AND
        //Similarly Bitwise XOR


        //Bitwise compliment is complicated, it negates the binary equivalent and show its 2's complement
        /**
         * 35 = 00100011 (In Binary)

         Bitwise complement Operation of 35
         ~ 00100011
         ________
         11011100  = 220 (In decimal)

         expected output(i.e binary negation is 220)
         but the actual output is -36 because the 2's compliment of 220 is -36
         */

        //Bitwise shift left

        byte s = -5;

        System.out.println(s<<1);
        System.out.println(s>>1);

        //System.out.println(s<<<1);
        System.out.println(s>>>1);

    }
}
