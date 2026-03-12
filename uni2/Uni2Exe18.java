import java.util.Scanner;

public class Uni2Exe18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double comprimento, altura;
        System.out.println("Digite o comprimento da parede em metros:");
        comprimento = sc.nextDouble();
        System.out.println("Digite a altura da parede em metros:");
        altura = sc.nextDouble();
        double area = comprimento * altura;
        double azulejos = area * 9;
        double valor = azulejos * 12.50;
        System.out.println("Valor gasto com azulejos: R$ " + valor);

        sc.close();
    }

}
