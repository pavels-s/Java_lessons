package main.java.JavaGuru_2020_Java1.lesson_10.level_4.task_11;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Weatercast {
    int celsiumDefault, kelvin, fahrenheit;

    Weatercast(int celsiumDefault) {
        this.celsiumDefault = celsiumDefault;
    }
    private int kelvinConvert(Weatercast weatercast){
        return kelvin = weatercast.celsiumDefault + 20;
    }

    private int fahrenfeitConvert(Weatercast weatercast){
        return fahrenheit = weatercast.celsiumDefault - 20;
    }

    public static void main(String[] args) {

        Weatercast weatercast = new Weatercast(25);

        System.out.println("Celsium temp = " + weatercast.celsiumDefault);
        System.out.println("Kelvin temp = " + weatercast.kelvinConvert(weatercast));
        System.out.println("Fahrenheit temp = " + weatercast.fahrenfeitConvert(weatercast));

    }
}
