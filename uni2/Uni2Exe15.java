import java.util.Scanner;

public class Uni2Exe15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = sc.nextDouble();
        int dinheiro = (int) Math.round(valor * 100);
        System.out.println("notas:");
        System.out.println(dinheiro / 10000 + " notas de R$ 100.00");
        dinheiro = dinheiro % 10000;
        System.out.println(dinheiro / 5000 + " notas de R$ 50.00");
        dinheiro = dinheiro % 5000;
        System.out.println(dinheiro / 2000 + " notas de R$ 20.00");
        dinheiro = dinheiro % 2000;
        System.out.println(dinheiro / 1000 + " notas de R$ 10.00");
        dinheiro = dinheiro % 1000;
        System.out.println(dinheiro / 500 + " notas de R$ 5.00");
        dinheiro = dinheiro % 500;
        System.out.println(dinheiro / 200 + " notas de R$ 2.00");
        dinheiro = dinheiro % 200;
        System.out.println("moedas:");
        System.out.println(dinheiro / 100 + " moedas de R$ 1.00");
        dinheiro = dinheiro % 100;
        System.out.println(dinheiro / 50 + " moedas de R$ 0.50");
        dinheiro = dinheiro % 50;
        System.out.println(dinheiro / 25 + " moedas de R$ 0.25");
        dinheiro = dinheiro % 25;
        System.out.println(dinheiro / 10 + " moedas de R$ 0.10");
        dinheiro = dinheiro % 10;
        System.out.println(dinheiro / 5 + " moedas de R$ 0.05");
        dinheiro = dinheiro % 5;
        System.out.println(dinheiro / 1 + " moedas de R$ 0.01");

        sc.close();
    }

}
