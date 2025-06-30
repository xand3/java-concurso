package exercicios.estrutura_sequencial;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cod1, cod2, qtd1, qtd2;
        double valor1, valor2, valorTotal;

        System.out.println("Digite o código da peça 1, número de peças e valor unitário de cada peça 1");
        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        valor1 = sc.nextDouble();

        System.out.println("Digite o código da peça 2, número de peças e valor unitário de cada peça 2");
        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        valor2 = sc.nextDouble();

        valorTotal = (qtd1 * valor1) + (qtd2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);

        sc.close();
    }
}
