import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas horas al día puedes estudiar? ");
        int horasPorDia = scanner.nextInt();

        String[] materias = {"ArquiSistemas", "Laboratorio", "Matemática", "Programación", "OrgEmpresarial"};

        int horasPorMateria = horasPorDia / materias.length;
        int horasExtra = horasPorDia % materias.length;

        System.out.println("Tu plan de estudio semanal es:");

        for (int dia = 1; dia <= 7; dia++) {
            System.out.println("Día " + dia + ":");
            for (int i = 0; i < materias.length; i++) {
                int horasAsignadas = horasPorMateria;

                if (i < horasExtra) {
                    horasAsignadas++;
                }

                System.out.println(materias[i] + ": " + horasAsignadas + " horas");
            }
            System.out.println();
        }
    }
}
