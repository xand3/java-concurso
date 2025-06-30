package exercicios.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int funcionario, horasTrabalhadas;
        double valorPorHora, salarioDoFuncionario;

        System.out.print("Digite o número do funcionário: ");
        funcionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor recebido por hora trabalhada: ");
        valorPorHora = sc.nextDouble();

        salarioDoFuncionario = horasTrabalhadas * valorPorHora;
        System.out.println("NUMBER = " + funcionario);
        System.out.printf(Locale.US,"SALARY = %.2f%n", salarioDoFuncionario);

        sc.close();
    }
}
