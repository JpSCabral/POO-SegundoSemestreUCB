/*Calculadora Simples Crie um programa Java que funcione como uma calculadora simples. Peça ao usuário para inserir dois
números e uma operação (+, -, *, /). Realize a operação escolhida e exiba o resultado.*/

package atividade2;
import java.util.Scanner;
import org.jetbrains.annotations.NotNull;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.println("Digite um numero inteiro: ");
        int number1 = scan.nextInt();
        calc.setA(number1);

        System.out.println("Digite outro numero inteiro: ");
        int number2 = scan.nextInt();
        calc.setB(number2);

        String operador = String.valueOf(scan.next().charAt(0));
        calc.setOpr(operador);

        int resultado = calc.operar();


        System.out.println("O resultado é: " + resultado);
    }


}

class Calculadora {
    private Integer a;
    private Integer b;
    private String opr;
    private Scanner scan;

    public Calculadora() {
        this.scan = new Scanner(System.in);
    }

    public Integer getA() {
        return this.a;
    }
    public void setA(Integer a){
        this.a = a;
    }

    public Integer getB() {
        return this.b;
    }
    public void setB(Integer b){
        this.b = b;
    }

    public String getOpr(){
        return this.opr;
    }

    public void setOpr(@NotNull String op) throws Exception {
        System.out.println("Digite a operação desejada (+, -, *, /): ");
        op = scan.nextLine();

        if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")) {
            throw new Exception("Operador inválido");
        }

        this.opr = op;
    }

    public Integer operar(){
        Integer ret = 0;
        switch (this.opr) {
            case "+":
                ret = this.a + this.b;
                break;
            case "-":
                ret = this.a - this.b;
                break;
            case "*":
                ret = this.a * this.b;
                break;
            case "/":
                ret = this.a / this.b;
                break;
        }
        return ret;
    }
}