import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Introduce la duración del ejercicio en minutos: ");
        int duracion = scanner.nextInt();

        System.out.print("Introduce el tipo de ejercicio (correr, nadar, bicicleta): ");
        String ejercicio = scanner.next().toLowerCase();

        double caloriasPorMinuto;

        switch (ejercicio) {
            case "correr":
                caloriasPorMinuto = 0.0175 * 10 * peso;
                break;
            case "nadar":
                caloriasPorMinuto = 0.0175 * 8 * peso;
                break;
            case "bicicleta":
                caloriasPorMinuto = 0.0175 * 7.5 * peso;
                break;
            default:
                System.out.println("Tipo de ejercicio no válido.");
                return;
        }

        double caloriasQuemadas = caloriasPorMinuto * duracion;

        System.out.println("Has quemado aproximadamente " + caloriasQuemadas + " calorías.");
    }
}
