import java.util.Scanner;

public class diasSemana {

        public static void main(String[] args) {
            System.out.println("Escribe un numero:");
            Scanner dia = new Scanner(System.in);

            int Semana = dia.nextInt();

            String numeroDeDias = switch (Semana) {
                case 1 -> "Lunes";
                case 2 -> "Martes";
                case 3 -> "Miercoles";
                case 4 -> "Jueves";
                case 5 -> "Viernes";
                case 6 -> "Sabado";
                case 7 -> "Domingo";


                default -> "Numero invalido";
            };

            System.out.println( "el numero es " +Semana+ ", lo que significa que hoy es "+numeroDeDias);
            dia.close();
        }
    }




