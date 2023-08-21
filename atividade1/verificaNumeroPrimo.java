package atividade1;

import java.util.Scanner;

public class verificaNumeroPrimo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        boolean ePrimo = true;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                ePrimo = false;
                break;
            }
        }

        if (ePrimo) {
            System.out.println(num + " é um número primo.");
        } else {
            System.out.println(num + " não é um número primo.");
        }
    }
}
