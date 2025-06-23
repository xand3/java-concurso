import java.util.Scanner;

public class entradaDeDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        int age;
        double salary;
        System.out.println("Digite seu nome: ");
        name = sc.next();

        System.out.println("Digite sua idade: ");
        age = sc.nextInt();

        System.out.println("Digite seu salario: ");
        salary = sc.nextDouble();
        System.out.println("Seu nome é: " + name + " e você tem " + age + " anos.");
        System.out.printf("Seu salário é de: %.3f%n", salary);

        sc.close();
    }
}
