import java.util.Scanner;

public class Condicional7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te sentis hoy? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.nextLine().toLowerCase().trim();

        switch (estadoAnimo) {
            case "feliz":
                System.out.println("Juntate con tus amigos");
                break;
            case "triste":
                System.out.println("Sali a caminar y ver la naturaleza");
                break;
            case "enérgico":
                System.out.println("Sali a correr o hace otra actividad fisica");
                break;
            case "relajado":
                System.out.println("Léete un libro");
                break;
            default:
                System.out.println("Ingresaste mal el valor. Por favor, elegí entre feliz, triste, enérgico o relajado.");
                break;
        }
    }
}