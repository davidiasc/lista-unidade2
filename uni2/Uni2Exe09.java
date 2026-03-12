import java.util.Scanner;

public class Uni2Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor em dolares: ");
        double dolar = sc.nextDouble();
        final double cotacao = 5.26;
        double reais = dolar * cotacao;
        System.out.printf("O total em reais sera de R$ %.2f%n", reais);

        sc.close();
    }

}
