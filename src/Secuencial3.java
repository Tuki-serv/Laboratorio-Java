import java.util.Scanner;

public class Secuencial3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nivel de condición física (principiante, intermedio, avanzado): ");
        String nivel = scanner.next().toLowerCase();

        String[] rutina;

        switch (nivel) {
            case "principiante":
                rutina = new String[]{
                        "Día 1: 20 minutos de caminata",
                        "Día 2: 15 minutos de estiramientos y yoga",
                        "Día 3: 25 minutos de bicicleta suave",
                        "Día 4: 20 minutos de natación ligera",
                        "Día 5: Descanso",
                        "Día 6: 20 minutos de caminata rápida",
                        "Día 7: 15 minutos de yoga"
                };
                break;

            case "intermedio":
                rutina = new String[]{
                        "Día 1: 30 minutos de correr",
                        "Día 2: 40 minutos de bicicleta",
                        "Día 3: 30 minutos de entrenamiento de fuerza (pesas)",
                        "Día 4: 45 minutos de natación",
                        "Día 5: Descanso",
                        "Día 6: 30 minutos de correr y 15 minutos de estiramientos",
                        "Día 7: 30 minutos de yoga o pilates"
                };
                break;

            case "avanzado":
                rutina = new String[]{
                        "Día 1: 60 minutos de correr",
                        "Día 2: 45 minutos de bicicleta a ritmo intenso",
                        "Día 3: 60 minutos de entrenamiento de fuerza (pesas)",
                        "Día 4: 60 minutos de natación a alta intensidad",
                        "Día 5: 30 minutos de yoga o descanso activo",
                        "Día 6: 50 minutos de entrenamiento combinado (correr y pesas)",
                        "Día 7: 60 minutos de entrenamiento de intervalos de alta intensidad (HIIT)"
                };
                break;

            default:
                System.out.println("Nivel de condición física no válido.");
                return;
        }

        System.out.println("Tu rutina semanal es:");
        for (String dia : rutina) {
            System.out.println(dia);
        }
    }
}
