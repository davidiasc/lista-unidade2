import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a duração em segundos: ");
        int totalsegundos = sc.nextInt();
        int horas = totalsegundos / 3600;
        // Calculando quantas horas inteiras cabem no total de segundos
        int resto = totalsegundos % 3600;
        // Calculando o que sobra após retirar as horas
        int minutos = resto / 60;
        // Calcula quantos minutos cabem no resto
        int segundos = resto % 60;
        // Calcula os segundos restantes

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }

}
