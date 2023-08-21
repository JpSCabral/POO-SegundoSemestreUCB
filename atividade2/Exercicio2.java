/*Crie um conversor de temperatura que permita ao usuário converter entre Celsius e Fahrenheit. Peça ao usuário
para escolher a direção da conversão e, em seguida, faça a conversão e exiba o resultado.*/

package atividade2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha a direçao da cconversao: \n1 - Celsius -> Fahrenheit\n2 - Fahrenheit -> Celsius");
        int opc = scan.nextInt();

        if (opc == 1){
            System.out.println("Digite a temperatura em Celsius");
            double cels = scan.nextDouble();

            double fahr = (1.8 * cels) + 32;
            System.out.println("A temperatura convertida é" + fahr + "Fahrenheit");
        } else if (opc == 2) {
            System.out.println("Digite a temperatura em Fahrenheit");
            double fahr = scan.nextDouble();

            double cels = (fahr - 32) * 1.8;
            System.out.println("A temperatura convertida é" + cels + "Fahrenheit");
        }else {
            System.out.println("Invalido");
        }

    }

}
    /* grausC * 1,8 = resultado + 32 = Xf */
    /* grausF - 32 = resultado  / 1,8 = Xc */