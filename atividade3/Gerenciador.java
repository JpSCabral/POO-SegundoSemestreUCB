package atividade3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerenciador {

    private static Sistema sistema = new Sistema();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc = 0;

        while (opc != 4) {
            System.out.println("=============================");
            System.out.println("1 - Adicionar produto\n2 - Remover produto\n3 - Listar produtos\n4 - Fechar sistema\n==============================");
            opc = scan.nextInt();
            scan.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("==============Adicionar produtos================");
                    System.out.println("Digite o nome do produto: ");
                    String nomeProd = scan.nextLine();
                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = scan.nextInt();
                    sistema.addProd(nomeProd, quantidade);
                    break;

                case 2:
                    System.out.println("================Apagar produtos===============");
                    System.out.println("Digite o nome do produto que deseja apagar: ");
                    nomeProd = scan.nextLine();
                    if (sistema.produtos.contains(new Produto(nomeProd))) {
                        sistema.removerProd(nomeProd);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 3:
                    System.out.println("==========Lista de produtos===========");
                    sistema.listarProd();
                    break;
                case 4:
                    System.out.println("Encerrando programa..");
                    break;
            }
        }
    }
}