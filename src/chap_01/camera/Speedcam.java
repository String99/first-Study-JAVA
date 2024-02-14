package chap_01.camera;

public class Speedcam extends Camera
{


    public Speedcam(){
        this.name = "과속 카메라";
    }

    public void checkSpeed(){
        System.out.println("속도를 측정합니다.");

    }

    public void recognizeLicensePlate(){
        System.out.println("차량 번호를 인식합니다.");

    }
    public void showMainFeature(){

        System.out.println(this.name + "의 주요기능 : 속도 측정, 번호 인식");


    }
}
