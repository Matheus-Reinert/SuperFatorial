package SuperFatorial;

import java.util.Scanner;

public class CalculateSuperFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choosen;

        System.out.println("1-Fatorial with Looping");
        System.out.println("2-Fatorial with dinamic programming");
        choosen = sc.nextInt();

        switch (choosen){
            case 1:
               superFatorialWithLooping();
               break;
            case 2:
                superFatorialWithDinamicProgramming();
                break;
        }

    }

    static void superFatorialWithLooping() {
        Scanner sc =  new Scanner(System.in);

        int number;
        double finalResult = 1;
        long tempoInicio = System.currentTimeMillis();

        System.out.println("De qual número você deseja receber o super fatorial?");
        number = sc.nextInt();

        for (int j = number; j >=1; j--) {
            for (int i = j; i >= 1; i--) {
                finalResult *= i;
            }
        }
        System.out.println(finalResult);
        System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));

        sc.close();
    }

    static void superFatorialWithDinamicProgramming() {
        Scanner sc =  new Scanner(System.in);
        double number;
        long tempoInicio = System.currentTimeMillis();

        System.out.println("De qual número você deseja receber o super fatorial?");
        number = sc.nextInt();

        double result = calculateSuperFatorial(number);
        System.out.println("Result: " + result);
        System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));
    }

    private static double calculateSuperFatorial(double number) {
        if (number >= 1) {
            return number *= calculateSuperFatorial(number - 1);
        } else {
            return 1;
        }
    }
}
