package SuperFatorial;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class CalculateSuperFatorial {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int choose = 2;

        switch (choose){
            case 1:
                superFatorialWithLooping();
                long totalTime = System.nanoTime() - startTime;
                System.out.println("Demorou " + totalTime + " milissegundos");
                break;
            case 2:
                superFatorialWithDinamicProgramming();
                totalTime = System.nanoTime() - startTime;
                System.out.println("Demorou " + totalTime + " milissegundos");
                break;
        }
    }

    static void superFatorialWithLooping() {

        double finalResult = 1;
        double number = 25;

        for (double j = number; j >=1; j--) {
            for (double i = j; i >= 1; i--) {
                finalResult *= i;
            }
        }

        System.out.println("SuperFatorial de: " + number);
        System.out.println(finalResult);
    }

    static void superFatorialWithDinamicProgramming() {

        double number = 25;
        double result = conclusion(number);

        System.out.println("SuperFatorial de: " + number);
        System.out.println("Result: " + result);
    }

    private static double conclusion(double number){
        return superFatorial(number, number);
    }

    private static double superFatorial(double number, double number2){
        if(number2 == 1){
            return 1;
        }
        if (number == 1){
            return superFatorial(number2 - 1, number2 - 1);
        }
        return number * superFatorial(number - 1, number2);
    }
}
