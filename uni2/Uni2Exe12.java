import java.util.Scanner;

public class Uni2Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva x1");
        double x1 = sc.nextDouble();
        System.out.println("Escreva y1");
        double y1 = sc.nextDouble();
        System.out.println("Escreva x2");
        double x2 = sc.nextDouble();
        System.out.println("Escreva y2");
        double y2 = sc.nextDouble();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distancia: %.4f\n", distancia);

        sc.close();
    }

}
