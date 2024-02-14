package chap_13;

public class _02_Output {
    public static void main(String[] args) {

        System.out.println("---------정수---------");
        System.out.printf("%d%n%d%c%2f%7d%n", 1,2, 'a',0.5,6);

        System.out.printf("%,15d%n",1000000000);
        System.out.printf("%-6d%n", 1234);

        System.out.println("---------실수---------");

        System.out.printf("%f%n",0.5);


        System.out.println("---------문자열---------");

        String s = "바보";

        System.out.printf("%s", s);
    }
}
