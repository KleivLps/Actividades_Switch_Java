import java.util.Scanner;

public class diaHabil {



        public static void main(String[] args) {

            Scanner Dias = new Scanner(System.in);

            System.out.println("VERIFICADOR DE DIA HABIL");
            System.out.println("Por favor ingresa un numero del 1 al 7:");

            int Numero =Dias.nextInt();

            switch (Numero) {

                case 1-> {
                    String primero = "Lunes";
                    System.out.println("Hoy es "+primero+ " asi que es un dia habil :C");
                }

                case 2-> {
                    String segundo = "Martes";
                    System.out.println("Hoy es "+segundo+ " asi que es un dia habil :C");
                }

                case 3-> {
                    String tercero = "Miercoles";
                    System.out.println("Hoy es "+tercero+ " asi que es un dia habil :C");
                }

                case 4-> {
                    String cuarto = "Jueves";
                    System.out.println("Hoy es "+cuarto+ " asi que es un dia habil :C");
                }

                case 5-> {
                    String quinto = "Viernes";
                    System.out.println("Hoy es "+quinto+ " asi que es un dia habil :C");
                }

                case 6-> {
                    String sexto = "Sabado";
                    System.out.println("Hoy es "+sexto+ " asi que no es un dia habil, disfruta tu descanso C:");
                }

                case 7-> {
                    String septimo = "Domingo";
                    System.out.println("Hoy es "+septimo+ "asi que no es un dia habil, disfruta tu descanso C:");
                }






                default -> System.out.println("Valor invalido, ingrese un numero del 1 al 7");

            };

            Dias.close();

        }
    }


