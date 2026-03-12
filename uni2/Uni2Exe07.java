import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float fixo, vendas;
        String nomefuncionario;
        System.out.println("Qual seu nome? ");
        nomefuncionario = sc.nextLine();
        System.out.println("Salário fixo do funcionario: ");
        fixo = sc.nextFloat();
        System.out.println("Total de vendas no mês: ");
        vendas = sc.nextFloat();
        double comissao = vendas * 0.15;
        double salariofinal = fixo + comissao;
        System.out.println("Funcionario: " + nomefuncionario);
        System.out.printf("Salario final: %.2f\n", salariofinal);

        sc.close();
    }

}
