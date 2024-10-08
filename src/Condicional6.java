import java.util.Scanner;

public class Condicional6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas dormis al día? ");
        int horasSueno = scanner.nextInt();

        System.out.print("¿Cuántas horas haces ejercicio al día? ");
        int horasEjercicio = scanner.nextInt();

        System.out.print("¿Cuántas comidas saludables consumes al día? ");
        int comidasSaludables = scanner.nextInt();

        if (horasSueno >= 7 && horasSueno <= 9) {
            System.out.println("Tenes un buen hábito de sueño.");
        } else if (horasSueno < 7) {
            System.out.println("No estás durmiendo lo suficiente.");
        } else {
            System.out.println("Estás durmiendo demasiado.");
        }

        if (horasEjercicio >= 1) {
            System.out.println("Tenes un buen hábito de ejercicio.");
        } else {
            System.out.println("Deberías hacer más ejercicio.");
        }

        if (comidasSaludables >= 3) {
            System.out.println("Tenes una buena dieta.");
        } else {
            System.out.println("Deberías consumir más comidas saludables.");
        }

        if (horasSueno >= 7 && horasSueno <= 9 && horasEjercicio >= 1 && comidasSaludables >= 3) {
            System.out.println("¡Tenes hábitos saludables!");
        } else {
            System.out.println("Tenes que mejorar tus hábitos");
        }
    }
}
