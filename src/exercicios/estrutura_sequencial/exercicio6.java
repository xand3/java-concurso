package exercicios.estrutura_sequencial;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi = 3.14159;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        areaTriangulo = (a * c) / 2;
        areaCirculo = pi * (c * c);
        areaTrapezio = ((a + b) * c) / 2;
        areaQuadrado = b * b;
        areaRetangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n" +
                "CIRCULO: %.3f%n" +
                "TRAPEZIO: %.3f%n" +
                "QUADRADO: %.3f%n" +
                "RETANGULO: %.3f%n", areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);

        sc.close();
    }
}
