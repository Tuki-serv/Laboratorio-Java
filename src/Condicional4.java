import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Introduce tu altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Tu IMC es: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Bajo peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso.");
        } else {
            System.out.println("Obesidad.");
        }
    }
}
