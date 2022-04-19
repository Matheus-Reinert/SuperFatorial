package SuperFatorial;

import java.util.Scanner;

public class CalculateSuperFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choose = 1;

        switch (choose){
            case 1:
               superFatorialWithLooping();
               break;
            case 2:
                superFatorialWithDinamicProgramming();
                break;
        }

    }

    static void superFatorialWithLooping() {

        double finalResult = 1;
        long start = System.currentTimeMillis();

        int number = 4;

        for (int j = number; j >=1; j--) {
            for (int i = j; i >= 1; i--) {
                finalResult *= i;
            }
        }

        System.out.println("SuperFatorial de: " + number);
        System.out.println(finalResult);
        System.out.println("Tempo Total: " + (System.currentTimeMillis() - start));
        System.out.println("Meg used= "+(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/(1000*1000)+"M");
    }

    static void superFatorialWithDinamicProgramming() {

        int dataSize = 1024 * 1024;
        long tempoInicio = System.currentTimeMillis();
        Runtime runtime = Runtime.getRuntime();

        int number = 4;

        int result = conclusion(number);

        System.out.println("SuperFatorial de: " + number);
        System.out.println("Result: " + result);
        System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));
        System.out.println("Meg used= "+(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/(1000*1000)+"M");
    }

    private static int conclusion(int number){
        return superFatorial(number, number);
    }

    private static int superFatorial(int number, int number2){
        if(number2 == 1){
            return 1;
        }
        if (number == 1){
            return superFatorial(number2 - 1, number2 - 1);
        }
        return number * superFatorial(number - 1, number2);
    }
}
