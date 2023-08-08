package atividade1;

import java.util.Scanner;

public class verificaNumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int number = scanner.nextInt();

        boolean ePrimo = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                ePrimo = false;
                break;
            }
        }

        if (ePrimo) {
            System.out.println(number + " é um número primo.");
        } else {
            System.out.println(number + " não é um número primo.");
        }
    }
}
