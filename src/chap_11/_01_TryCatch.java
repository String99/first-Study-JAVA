package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {

        // 예외처리
        // 오류 : 컴파일오류, 런타임 오류


        try {

//            //System.out.println(3/0);
//            int[] arr = new int[3];
//            arr[5] = 100;
            Object obj = "test";
            System.out.println((Integer) obj);
        } catch (Exception e){
            System.out.println("이런 문제가 발생했어요 =>"+e.getMessage());

            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종류");
    }
}


