package chap_01;

import chap_01.camera.Camera;
import chap_01.camera.FactoryCam;
import chap_01.camera.Speedcam;

public class _12_intheritand {
    public static void main(String[] args) {

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        Speedcam speedcam = new Speedcam();


        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedcam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedcam.takePicture();

        factoryCam.detectFire();
        speedcam.recognizeLicensePlate();


    }
}
