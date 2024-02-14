package chap_01;

import chap_01.camera.Camera;
import chap_01.camera.FactoryCam;
import chap_01.camera.Speedcam;

public class _13_MethodOverridin {
    public static void main(String[] args) {



        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        Speedcam speedcam = new Speedcam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedcam.showMainFeature();
    }
}
