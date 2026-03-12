import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        float notaA, notaB, media;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite notaA");
        notaA = sc.nextFloat();
        System.out.println("Digite notaB");
        notaB = sc.nextFloat();
        media = ((notaA * 3.5f) + (notaB * 7.5f)) / 11;
        System.out.println("Media: " + media);

        sc.close();
    }
}
