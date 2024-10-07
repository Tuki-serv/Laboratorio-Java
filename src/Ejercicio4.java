import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu estado de ánimo (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = scanner.next().toLowerCase();

        String[] playlist;

        switch (estadoAnimo) {
            case "feliz":
                playlist = new String[]{
                        "1. Happy - Pharrell Williams",
                        "2. Good as Hell - Lizzo",
                        "3. Can't Stop the Feeling! - Justin Timberlake"
                };
                break;

            case "triste":
                playlist = new String[]{
                        "1. Someone Like You - Adele",
                        "2. The Night We Met - Lord Huron",
                        "3. Fix You - Coldplay"
                };
                break;

            case "enérgico":
                playlist = new String[]{
                        "1. Eye of the Tiger - Survivor",
                        "2. Uptown Funk - Mark Ronson ft. Bruno Mars",
                        "3. Don't Stop Me Now - Queen"
                };
                break;

            case "relajado":
                playlist = new String[]{
                        "1. Weightless - Marconi Union",
                        "2. Bloom - The Paper Kites",
                        "3. Clair de Lune - Debussy"
                };
                break;

            default:
                System.out.println("Estado de ánimo no válido.");
                return;
        }

        System.out.println("Tu lista de reproducción para el estado de ánimo '" + estadoAnimo + "' es:");
        for (String cancion : playlist) {
            System.out.println(cancion);
        }
    }
}
