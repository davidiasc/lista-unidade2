import java.util.Scanner;

public class Uni2Exe14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor inteiro");
        valor = sc.nextInt();
        System.out.println(valor);
        System.out.println(valor / 100 + "notas de R$ 100,00");
        valor = valor % 100;
        System.out.println(valor / 50 + "notas de R$ 50,00");
        valor = valor % 50;
        System.out.println(valor / 20 + "notas de R$ 20,00");
        valor = valor % 20;
        System.out.println(valor / 10 + "notas de R$ 10,00");
        valor = valor % 10;
        System.out.println(valor / 5 + "notas de R$ 5,00");
        valor = valor % 5;
        System.out.println(valor / 2 + "notas de R$ 2,00");
        valor = valor % 2;
        System.out.println(valor / 1 + "notas de R$ 1,00");
        valor = valor % 1;

        sc.close();
    }

}
