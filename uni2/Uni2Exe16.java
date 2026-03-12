import java.util.Scanner;

public class Uni2Exe16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lata350, garrafa600, garrafa2L;
        System.out.println("Digite a quantidade de latas de 350 ml:");
        lata350 = sc.nextInt();
        System.out.println("Digite a quantidade de garrafas de 600 ml:");
        garrafa600 = sc.nextInt();
        System.out.println("Digite a quantidade de garrafas de 2 litros:");
        garrafa2L = sc.nextInt();
        int totalml = (lata350 * 350) + (garrafa600 * 600) + (garrafa2L * 2000);
        double totallitros = totalml / 1000.0;
        System.out.println("Total de refrigerante comprado: " + totallitros + " litros");

        sc.close();
    }

}
