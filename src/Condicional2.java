import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el precio del producto: ");
        double precio = scanner.nextDouble();

        System.out.print("Introduce tu categoría (estudiante, adulto, jubilado): ");
        String categoria = scanner.next().toLowerCase();

        double descuento;

        if (categoria.equals("estudiante")) {
            descuento = 0.10;
        } else if (categoria.equals("adulto")) {
            descuento = 0.05;
        } else if (categoria.equals("jubilado")) {
            descuento = 0.15;
        } else {
            System.out.println("Categoría no válida.");
            return;
        }

        double precioFinal = precio - (precio * descuento);

        System.out.println("El precio final después del descuento es: $" + precioFinal);
    }
}
