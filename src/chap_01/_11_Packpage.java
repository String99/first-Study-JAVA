package chap_01;

import java.util.Random;

public class _11_Packpage {
    public static void main(String[] args) {
        // 랜덤클래스

        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10));
        System.out.println(random.nextDouble());
        System.out.println(random.nextDouble()*5);

        double min = 5.0;
        double max = 10.0;
        System.out.println();

        System.out.println(random.nextBoolean());




        System.out.println(random.nextInt(45)+1);

    }
}
