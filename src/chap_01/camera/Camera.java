package chap_01.camera;

public class Camera {
    public String name;

    public Camera() {
        this.name  = "카메라";

    }

    public void takePicture(){
        System.out.println(this.name +  " : 사진을 촬영합니다.");

    }

    public void recordVideo(){
        System.out.println(this.name + " : 동영상을 녹화합니다");

    }


    public void showMainFeature(){

        System.out.println(this.name + "의 주요기능 : 사진촬영, 동영상 녹화");


    }
}
