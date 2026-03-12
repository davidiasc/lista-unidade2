import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distância em km: ");
        int distancia = sc.nextInt();
        int tempo = 2;
        int minutos = distancia * tempo;
        System.out.println("O carro leva " + minutos + " minutos para tomar a distancia do carro x");

        sc.close();
    }

}
