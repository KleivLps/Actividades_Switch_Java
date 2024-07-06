import java.util.Scanner;

public class calificacion {

        public static void main(String[] args) {
            System.out.println("Escribe un numero:");
            Scanner nota = new Scanner(System.in);

            int Numero =nota.nextInt();

            String Calificacion = switch (Numero) {
                case 1 -> "Muy deficiente";
                case 2 -> "Deficiente";
                case 3 -> "Suficiente";
                case 4 -> "Notable";
                case 5 -> "Sobresaliente";
                default -> "Numero invalido";

            };

            if (Numero >= 1 && Numero <= 5) {
                System.out.println( "el numero es " +Numero+ ", lo que significa que obtuviste una nota "+Calificacion);
            } else {
                System.out.println( "Numero invalido");
            }


            nota.close();
        }
    }


