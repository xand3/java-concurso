package exercicios.estrutura_sequencial;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        double raio, area, pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULAR ÁREA DE UM CIRCULO COM O RAIO");
        System.out.println("Digite o raio do circulo: ");
        raio = sc.nextFloat();

        area = pi * raio * raio;
        System.out.printf("A=%.4f%n", area);

        sc.close();
    }
}
