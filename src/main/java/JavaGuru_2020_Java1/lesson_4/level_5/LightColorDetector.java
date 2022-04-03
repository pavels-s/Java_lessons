package main.java.JavaGuru_2020_Java1.lesson_4.level_5;

import java.util.Scanner;

public class LightColorDetector {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter wave length: ");
        int waveLength = in.nextInt();

        System.out.println("Wave color is " + detect(waveLength));

    }

    // почему тут static? мы static не учили и не применяем его!
    public static String detect(int wavelength) {
        String waveColor;
        if ((wavelength >= 380) && (wavelength <= 449)) {
            waveColor = "Violet";
            return waveColor;
        } else if ((wavelength >= 450) && (wavelength <= 494)) {
            waveColor = "Blue";
            return waveColor;
        } else if ((wavelength >= 495) && (wavelength <= 569)) {
            waveColor = "Green";
            return waveColor;
        } else if ((wavelength >= 570) && (wavelength <= 589)) {
            waveColor = "Yellow";
            return waveColor;
        } else if ((wavelength >= 590) && (wavelength <= 619)) {
            waveColor = "Orange";
            return waveColor;
        } else if ((wavelength >= 620) && (wavelength <= 750)) {
            waveColor = "Red";
            return waveColor;
        } else {
            waveColor = "Invisible light";
            return waveColor;
        }
    }

}
