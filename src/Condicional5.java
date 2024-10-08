import java.util.Scanner;
import java.util.Random;

public class Condicional5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Elige piedra, papel o tijera: ");
        String usuarioEleccion = scanner.next().toLowerCase();

        String[] opciones = {"piedra", "papel", "tijera"};
        String computadoraEleccion = opciones[random.nextInt(3)];

        System.out.println("Pichico eligió: " + computadoraEleccion);

        if (usuarioEleccion.equals(computadoraEleccion)) {
            System.out.println("¡Es un empate!");
        } else if (
                (usuarioEleccion.equals("piedra") && computadoraEleccion.equals("tijera")) ||
                        (usuarioEleccion.equals("papel") && computadoraEleccion.equals("piedra")) ||
                        (usuarioEleccion.equals("tijera") && computadoraEleccion.equals("papel"))
        ) {
            System.out.println("¡Ganaste!");
        } else if (
                usuarioEleccion.equals("piedra") ||
                        usuarioEleccion.equals("papel") ||
                        usuarioEleccion.equals("tijera")
        ) {
            System.out.println("¡Pichico ganó!");
        } else {
            System.out.println("Opción no válida. Por favor, elige piedra, papel o tijera.");
        }
    }
}
