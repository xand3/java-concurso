package exercicios.estrutura_sequencial;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, num4, diferencaDosProdutos;

        System.out.println("Digite o primeiro valor: ");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo valor: ");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro valor: ");
        num3 = sc.nextInt();

        System.out.println("Digite o quarto valor: ");
        num4 = sc.nextInt();

        diferencaDosProdutos = (num1 * num2) - (num3 * num4);
        System.out.print("DIFERENÇA=" + diferencaDosProdutos);

        sc.close();
    }
}
