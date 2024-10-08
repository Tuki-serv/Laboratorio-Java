import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu género de libro favorito (fantasía, misterio, romance, ciencia ficción): ");
        String genero = scanner.nextLine().toLowerCase().trim();

        switch (genero) {
            case "fantasía":
                System.out.println("Te recomendamos leer 'El Señor de los Anillos' de J.R.R. Tolkien.");
                break;
            case "misterio":
                System.out.println("Te recomendamos leer 'La chica del tren' de Paula Hawkins.");
                break;
            case "romance":
                System.out.println("Te recomendamos leer 'Orgullo y Prejuicio' de Jane Austen.");
                break;
            case "ciencia ficción":
                System.out.println("Te recomendamos leer 'Dune' de Frank Herbert.");
                break;
            default:
                System.out.println("Género no válido. Intenta con fantasía, misterio, romance o ciencia ficción.");
                break;
        }
    }
}
