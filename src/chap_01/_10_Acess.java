package chap_01;

public class _10_Acess {
    public static void main(String[] args) {

        // 정보 은닉

        //캡슐화

        //잡근제어자
        //private : 해당클래스 내에서만 접근 가능
        //public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을때) 같은 패키지 내에서만 접근가능
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "블랙";


        b1.setPrice(-5000);


        System.out.println(b1.getPrice());
        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격은 : "+ b2.getPrice() + "원");
        System.out.println(b2.getResolution());



    }
}
