package chap_01;

public class _01_HelloWorld {
    public static void  main(String[] args) {


        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);

        BlackBox b2 = new BlackBox();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);

        // 특정 범위를 초과하는 충돌 감지시 자동 심고 기능 개발 여부
        System.out.println(" - 개발전 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " +b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        // 기능 개발

        BlackBox.canAutoReport = true;

        System.out.println(" - 개발후 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " +b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + b2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);




    }
}
