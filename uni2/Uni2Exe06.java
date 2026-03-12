import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        int numero;
        float horas, valor, salariofinal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva o número do funcionario ");
        numero = sc.nextInt();
        System.out.println("Escreva número de horas trabalhadas ");
        horas = sc.nextFloat();
        System.out.println("Escreva o valor que recebe por hora trabalhada");
        valor = sc.nextFloat();
        salariofinal = valor * horas;
        System.out.println("Numero do funcionario: " + numero);
        System.out.printf("Salario: %.2f\n", salariofinal);

        sc.close();
    }

}
