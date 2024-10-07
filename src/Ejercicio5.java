import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la distancia del viaje en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Introduce el consumo de combustible en litros por kilómetro: ");
        double consumoCombustible = scanner.nextDouble();

        System.out.print("Introduce el precio del combustible por litro: ");
        double precioCombustible = scanner.nextDouble();

        double costoTotal = distancia * consumoCombustible * precioCombustible;

        System.out.println("El costo total del viaje es: $" + costoTotal);
    }
}
