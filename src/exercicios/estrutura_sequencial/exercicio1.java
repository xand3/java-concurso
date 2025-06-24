package exercicios.estrutura_sequencial;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        int num1;
        int num2;
        int soma;

        Scanner sc = new Scanner(System.in);
        System.out.println("SOMA DE 2 DIGITOS");
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = sc.nextInt();

        soma = num1 + num2;
        System.out.println("SOMA = " + soma);

        sc.close();
    }
}
