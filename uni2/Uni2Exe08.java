import java.util.Scanner;

public class Uni2Exe08 {
    public static void main(String[] args) {
        int peca1, peca2;
        int numerop1, numerop2;
        double valorp1, valorp2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Código da peça 1:");
        peca1 = sc.nextInt();
        System.out.println("Número de peças 1:");
        numerop1 = sc.nextInt();
        System.out.println("Valor da peça 1:");
        valorp1 = sc.nextDouble();
        System.out.println("Código da peça 2:");
        peca2 = sc.nextInt();
        System.out.println("Número de peças 2:");
        numerop2 = sc.nextInt();
        System.out.println("Valor da peça 2:");
        valorp2 = sc.nextDouble();
        double valorfinal = (numerop1 * valorp1) + (numerop2 * valorp2);
        System.out.printf("Valor a pagar: %.2f\n", valorfinal);

        sc.close();
    }

}
