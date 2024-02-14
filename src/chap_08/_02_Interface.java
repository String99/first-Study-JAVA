package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.AdvamcedFireDector;
import chap_08.detector.FireDector;
import chap_08.reporter.NormalReporter;
import chap_08.reporter.VideoReporter;
import chap_08.detector.Detectable;


public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 단일상속 (extends)
        //
        NormalReporter normalReporter = new NormalReporter();
        normalReporter.report();

        VideoReporter videoReporter = new VideoReporter();
        videoReporter.report();


        Detectable fireDector = new FireDector();
        fireDector.detect();

        AdvamcedFireDector advamcedFireDector = new AdvamcedFireDector();
        advamcedFireDector.detect();


        System.out.println("-------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetectable(advamcedFireDector);
        factoryCam.setReportable(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
