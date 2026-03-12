import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        int A, B, C, D, diferenca;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite valor de A");
        A = sc.nextInt();
        System.out.println("Digite valor de B");
        B = sc.nextInt();
        System.out.println("Digite valor de C");
        C = sc.nextInt();
        System.out.println("Digite valor de D");
        D = sc.nextInt();
        diferenca = (A * B - C * D);
        System.out.println("A diferenca é: " + diferenca);

        sc.close();
    }

}
