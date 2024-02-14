package chap_12;

import chap_12.clean.CleanThread;



public class _01_Thread {
    public static void main(String[] args) {
        //쓰레드

        // 1 3 5 7 9
        // 2 4 6 8 10

        CleanThread cleanThread = new CleanThread();
        //cleanThread.run();

        cleanThread.start();
       // cleanByBoss();
    }

    public static void cleanBySelf(){
        System.out.println("-- 혼자서 청소 시작 --");
        for (int i = 1; i < 10; i++) {
            System.out.println("(혼자)" + i+"번방 청소 중");

        }
        System.out.println("-- 혼자 청소 끝 --");
    }
}
