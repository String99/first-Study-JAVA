package chap_01.camera;

public class FactoryCam extends Camera
{

public FactoryCam(){
    this.name = "공장 카메라";
}

    public void detectFire() {
        System.out.println("화재를 감지합니다.");

    }


    public void showMainFeature(){

        System.out.println(this.name + "의 주요기능 : 화재 감지");


    }




}
