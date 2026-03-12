import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        double A, B, C;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        A = sc.nextDouble();
        System.out.println("Digite o valor de B:");
        B = sc.nextDouble();
        System.out.println("Digite o valor de C:");
        C = sc.nextDouble();
        double areadotriangulo = (A * C) / 2;
        System.out.printf("Area do triangulo: %.3f\n", areadotriangulo);
        double areadocirculo = 3.14159 * Math.pow(C, 2);
        System.out.printf("Area do circulo: %.3f\n", areadocirculo);
        double areatrapezio = ((A + B) * C) / 2;
        System.out.printf("Area do trapezio: %.3f\n", areatrapezio);
        double areaquadrado = B * B;
        System.out.printf("Area do quadrado: %.3f\n", areaquadrado);
        double arearetangulo = A * B;
        System.out.printf("Area do retangulo: %.3f\n", arearetangulo);

        sc.close();
    }

}
