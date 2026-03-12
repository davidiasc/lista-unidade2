import java.util.Scanner;

public class Uni2Exe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int horas, dependentes;
        System.out.println("Digite o nome do funcionario:");
        nome = sc.nextLine();
        System.out.println("Digite o numero de horas trabalhadas:");
        horas = sc.nextInt();
        System.out.println("Digite o numero de dependentes:");
        dependentes = sc.nextInt();
        double salariotrabalho = horas * 10;
        double salariofamilia = dependentes * 60;
        double salariobruto = salariotrabalho + salariofamilia;
        double inss = salariotrabalho * 0.085;
        double ir = salariotrabalho * 0.05;
        double salarioliquido = salariobruto - inss - ir;
        System.out.println("Nome: " + nome);
        System.out.println("Salario bruto: " + salariobruto);
        System.out.println("Salario liquido: " + salarioliquido);

        sc.close();
    }

}
