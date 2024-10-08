import java.util.Scanner;

public class Secuencial1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu día de nacimiento : ");
        int dia = scanner.nextInt();
        System.out.print("Introduce tu mes de nacimiento : ");
        int mes = scanner.nextInt();

        String signo;
        String horoscopo;

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
            horoscopo = "Toma menos agua";
        } else if ((mes == 2 ) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
            horoscopo = "Come mas pescado";
        } else if ((mes == 3 ) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
            horoscopo = "Cuidado con los cachos";
        } else if ((mes == 4 ) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
            horoscopo = "Te diria cuidado con los cachos, pero vos ya no tenes salida";
        } else if ((mes == 5 ) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
            horoscopo = "Tene en cuenta al gemelo malvado";
        } else if ((mes == 6 ) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
            horoscopo = "Si un cangrejo pierde su pinza le vuelve a crecer";
        } else if ((mes == 7 ) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
            horoscopo = "Mufasa";
        } else if ((mes == 8 ) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
            horoscopo = "Tuki";
        } else if ((mes == 9 ) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
            horoscopo = "La balanza de la verduleria no anda";
        } else if ((mes == 10 ) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
            horoscopo = "Guarda con la abejas";
        } else if ((mes == 11 ) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
            horoscopo = "Domado";
        } else if ((mes == 12 ) || (mes == 1 )) {
            signo = "Capricornio";
            horoscopo = "Corre más";
        } else {
            System.out.println("Fecha no válida.");
            return;
        }

        System.out.println("Tu signo zodiacal es: " + signo);
        System.out.println("Horóscopo: " + horoscopo);
    }
}
