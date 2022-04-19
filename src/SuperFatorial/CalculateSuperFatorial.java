package SuperFatorial;

import java.util.Scanner;

public class CalculateSuperFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1-Fatorial with Looping");
        System.out.println("2-Fatorial with dinamic programming");
        int choose = sc.nextInt();

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
        Scanner sc =  new Scanner(System.in);

        double finalResult = 1;
        long start = System.currentTimeMillis();

        System.out.println("De qual número você deseja receber o super fatorial?");
        int number = sc.nextInt();

        for (int j = number; j >=1; j--) {
            for (int i = j; i >= 1; i--) {
                finalResult *= i;
            }
        }
        System.out.println(finalResult);
        System.out.println("Tempo Total: " + (System.currentTimeMillis() - start));

        sc.close();
    }

    static void superFatorialWithDinamicProgramming() {
        Scanner sc =  new Scanner(System.in);
        long tempoInicio = System.currentTimeMillis();

        System.out.println("De qual número você deseja receber o super fatorial?");
        int number = sc.nextInt();

        int result = conclusion(number);
        System.out.println("Result: " + result);
        System.out.println("Tempo Total: "+(System.currentTimeMillis()-tempoInicio));
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
    private static int conclusion(int number){
        return superFatorial(number, number);
    }
}
