package main.java.student_pavel_sharkel.lesson_4.level_5;

public class LightColorDetectorTest {

    public static void main(String[] args) {

        LightColorDetectorTest lightColorDetectorTest = new LightColorDetectorTest();

        lightColorDetectorTest.violetTest();
        lightColorDetectorTest.blueTest();
        lightColorDetectorTest.greenTest();
        lightColorDetectorTest.yellowTest();
        lightColorDetectorTest.orangeTest();
        lightColorDetectorTest.redTest();
        lightColorDetectorTest.invisibleTest();

    }
        public void violetTest() {
            int waveLength = 385;

            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = LightColorDetector.detect(waveLength);

            if (result.equals("Violet")) {
                System.out.println("Violet test is OK");
            } else {
                System.out.println("Violet test is FAILED");
            }
        }

        public void blueTest() {
            int waveLength = 460;

            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = LightColorDetector.detect(waveLength);

            if (result.equals("Blue")) {
                System.out.println("Blue test is OK");
            } else {
                System.out.println("Blue test is FAILED");
            }
        }

        public void greenTest() {
            int waveLength = 514;

            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = LightColorDetector.detect(waveLength);

            if (result.equals("Green")) {
                System.out.println("Green test is OK");
            } else {
                System.out.println("Green test is FAILED");
            }
        }

        public void yellowTest() {
            int waveLength = 581;

            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = LightColorDetector.detect(waveLength);

            if (result.equals("Yellow")) {
                System.out.println("Yellow test is OK");
            } else {
                System.out.println("Yellow test is FAILED");
            }
        }

        public void orangeTest() {
            int waveLength = 607;

            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = LightColorDetector.detect(waveLength);

            if (result.equals("Orange")) {
                System.out.println("Orange test is OK");
            } else {
                System.out.println("Orange test is FAILED");
            }
        }

        public void redTest() {
            int waveLength = 700;

            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = LightColorDetector.detect(waveLength);

            if (result.equals("Red")) {
                System.out.println("Red test is OK");
            } else {
                System.out.println("Red test is FAILED");
            }
        }

        public void invisibleTest() {
            int waveLength = 900;

            LightColorDetector lightColorDetector = new LightColorDetector();
            String result = LightColorDetector.detect(waveLength);

            if (result.equals("Invisible light")) {
                System.out.println("Invisible light test is OK");
            } else {
                System.out.println("Invisible light test is FAILED");
            }
        }


}

