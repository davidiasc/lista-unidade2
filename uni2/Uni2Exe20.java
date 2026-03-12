import java.util.Scanner;

public class Uni2Exe20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dobras;
        System.out.println("Digite o numero de dobras: ");
        dobras = sc.nextInt();
        int lado = (int) Math.pow(2, dobras) + 1;
        int quadrados = lado * lado;
        System.out.println("Quantidade de quadrados: " + quadrados);

        sc.close();
    }

}
