import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nivel de satisfacción con la vida (1-10): ");
        int satisfaccionVida = scanner.nextInt();

        System.out.print("Introduce tu nivel de estrés (1-10): ");
        int estres = scanner.nextInt();

        System.out.print("Introduce tu nivel de salud (1-10): ");
        int salud = scanner.nextInt();

        System.out.print("Introduce tu nivel de relaciones personales (1-10): ");
        int relaciones = scanner.nextInt();

        System.out.print("Introduce tu nivel de realización personal (1-10): ");
        int realizacion = scanner.nextInt();

        int sumaFactores = satisfaccionVida + (10 - estres) + salud + relaciones + realizacion;
        double indiceFelicidad = sumaFactores / 5.0;

        System.out.println("Tu índice de felicidad es: " + indiceFelicidad + " / 10");
    }
}
