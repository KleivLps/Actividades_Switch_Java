import java.util.Scanner;

public class menu {

        public static void main(String[] args) {
            System.out.println("Escribe una opcion: 1: 'Guardar' | 2: 'Cargar' | 3:'Salir'"
                    );
            Scanner opciones = new Scanner(System.in);

            int Numero =opciones.nextInt();

            String Calificacion = switch (Numero) {
                case 1 -> "El archivo se ha guardado correctamente.";
                case 2 -> "El archivo se ha cargado correctamente";
                case 3 -> "Nos vemos";
                default -> "Valor invalido";

            };

            System.out.println( "Elegiste: " +Numero+ " - - - " +Calificacion);



            opciones.close();
        }
    }




