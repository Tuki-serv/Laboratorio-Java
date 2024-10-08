import java.util.Scanner;

public class Condicional1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu género de película favorito (acción, comedia, drama, ciencia ficción): ");
        String genero = scanner.next().toLowerCase();

        if (genero.equals("acción")) {
            System.out.println("Te recomendamos ver 'Rambo'.");
        } else if (genero.equals("comedia")) {
            System.out.println("Te recomendamos ver 'Los Tres Chiflados'.");
        } else if (genero.equals("drama")) {
            System.out.println("Te recomendamos ver 'El Secreto de sus Ojos'.");
        } else if (genero.equals("ciencia ficción")) {
            System.out.println("Te recomendamos ver 'Sector 9'.");
        } else {
            System.out.println("Género no válido. Intenta con acción, comedia, drama o ciencia ficción.");
        }
    }
}
