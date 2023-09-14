import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        short s1 = 99, s2 = 99;
        int d1, d2;
        float f1, f2;
        byte b = -10;
        boolean q = true;
        s1 = (short)Math.pow(b, 2);
        s2 = (short)(Math.random()*(10-0)+0);
        Random random = new Random(69);
        d2 = (random.nextInt()*(9999-1)+1);
        d1 = (s2/(s1*s2));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(s1);
        System.out.println(s2);
        Scanner in = new Scanner(System.in);
        f1 = in.nextFloat();
        f2 = in.nextFloat();
        double y = (1/f1)-(2/f2)+(Math.sin(s1)/Math.log10(s2));
        System.out.println(y);
    }
}